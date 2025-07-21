/*
 *	MSS Code Factory CFLib
 *
 *	Copyright (c) 2025 Mark Stephen Sobkow
 *
 *	This file is part of MSS Code Factory 3.0.
 *
 *	MSS Code Factory 3.0 is free software: you can redistribute it and/or modify
 *	it under the terms of the Apache v2.0 License as published by the Apache Foundation.
 *
 *	MSS Code Factory 3.0 is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 *	You should have received a copy of the Apache v2.0 License along with
 *	MSS Code Factory.  If not, see https://www.apache.org/licenses/LICENSE-2.0
 *
 *	Contact Mark Stephen Sobkow at mark.sobkow@gmail.com for commercial licensing or
 *  customization.
 */

package server.markhome.msscf.msscf.cflib.inz;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Properties;

/**
 * An InzEntry contains all InzLang entries for a given entry in the language path defined by Inz.langPath.
 * 
 * When Inz does the top-level translation search, it probes the InzEntry data in path-order sequence until
 * it finds a match for the requested key.  If the key ultimately could not be found, it returns "!key!".
 * 
 * InzEntry is not intended to be instantiated directly by users of the CFLib, but rather is used internally
 * by Inz to manage the language entries loaded from the properties files in the langPath.
 * 
 * @author Mark Stephen Sobkow
 * @see Inz
 * @see InzLang
 */
class InzEntry {
    protected String pathName = null;
    protected File pathEntry = null;
    protected HashMap<String, InzLang> langs = new HashMap<>();
    
    /**
     * Construct an InzEntry for the specified pathName, using it to open the directory specified as pathEntry,
     * and then loading all the InzLang entries from the properties files in that directory.
     * 
     * @param pathName
     */
    public InzEntry(String pathName) {
        if (pathName == null || pathName.isEmpty()) {
            throw new IllegalArgumentException("Path name cannot be null or empty");
        }
        this.pathName = pathName;
        this.pathEntry = new File(pathName);
        if (!pathEntry.exists() || !pathEntry.isDirectory()) {
            throw new IllegalArgumentException("Path entry must be a valid directory: " + pathName);
        }
        loadLangs();
    }

    /**
     * Load all InzLang entries from the properties files in the pathEntry directory.
     * Each properties file should be named with the language code (e.g., "en.properties" for English).
     * The InzLang instances are stored in the langs map, keyed by their language code.
     * 
     * This method reads each properties file, validates the required properties,
     * and creates an InzLang instance for each valid file. It also handles fallback languages
     * by linking them to their respective InzLang instances.
     * 
     * If a properties file does not contain the required properties or has mismatched language codes,
     * an IllegalArgumentException is thrown.
     * 
     * @throws IOException if there is an error reading the directory or files.
     * @throws RuntimeException if there is an error loading the language files.
     * @throws IllegalArgumentException if a properties file is invalid or missing required properties.
     * @see InzLang#LANG_CODE_PROP
     * @see InzLang#ENGLISH_NAME_PROP
     * @see InzLang#NLS_NAME_PROP
     * @see InzLang#FALLBACK_LANG_PROP
     * @see InzLang#setTranslations(Properties)
     * @see InzLang#setFallbackLang(InzLang)
     * 
     * Note: This method assumes that the properties files are well-formed and contain the required properties.
     * It does not handle malformed files or unexpected formats, which should be validated before calling this method.
     */
    protected final void loadLangs() {
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(pathEntry.toPath(), "*.properties")) {
            for (Path p : dir) {
                File file = p.toFile();
                if (file.isFile() && file.getName().endsWith(".properties")) {
                    String langCode = file.getName().substring(0, file.getName().length() - 11); // Remove ".properties"
                    Properties properties = new Properties();
                    try (InputStream input = new FileInputStream(file)) {
                        properties.load(input);
                    } catch (IOException e) {
                        throw new RuntimeException("Failed to load language file: " + file.getName(), e);
                    }
                    
                    String loadedLangCodeString = properties.getProperty(InzLang.LANG_CODE_PROP);
                    if (loadedLangCodeString == null || loadedLangCodeString.isEmpty()) {
                        throw new IllegalArgumentException("Language file " + file.getName() + " must contain " +
                                InzLang.LANG_CODE_PROP + " property.");
                    }
                    if (!loadedLangCodeString.toLowerCase().equals(langCode.toLowerCase())) {
                        throw new IllegalArgumentException("Language file " + file.getName() + " has mismatched language code: " +
                                loadedLangCodeString.toLowerCase() + ", expected: " + langCode.toLowerCase());
                    }
                    String englishName = properties.getProperty(InzLang.ENGLISH_NAME_PROP);
                    String nlsName = properties.getProperty(InzLang.NLS_NAME_PROP);
                    if (englishName == null || nlsName == null || englishName.isEmpty() || nlsName.isEmpty()) {
                        throw new IllegalArgumentException("Language file " + file.getName() + " must contain " +
                                InzLang.ENGLISH_NAME_PROP + " and " + InzLang.NLS_NAME_PROP + " properties.");
                    }
                    String fallbackLangCode = properties.getProperty(InzLang.FALLBACK_LANG_PROP);

                    // Create an InzLang instance and add it to the langs map
                    InzLang lang = new InzLang(langCode.toLowerCase(), englishName, nlsName, (fallbackLangCode != null ? fallbackLangCode.toLowerCase() : null));
                    lang.setTranslations(properties);
                    langs.put(langCode, lang);
                }
            }
            
            // Link the fallback languages
            for (InzLang lang : langs.values()) {
                String fallbackCode = lang.getFallbackLangCode();
                if (fallbackCode != null && !fallbackCode.isEmpty()) {
                    InzLang fallbackLang = langs.get(fallbackCode.toLowerCase());
                    if (fallbackLang != null) {
                        lang.setFallbackLang(fallbackLang);
                    } else {
                        throw new IllegalArgumentException("Fallback language " + fallbackCode + " not found for language " + lang.getLangCode());
                    }
                }
                else {
                    String iso639 = lang.getIso639();
                    String iso3166 = lang.getIso3166();
                    if (iso3166 != null) {
                        // If no fallback is specified, set the fallback to the default English language
                        InzLang defaultLang = langs.get(iso639.toLowerCase());
                        if (defaultLang != null) {
                            lang.setFallbackLang(defaultLang);
                        } else {
                            throw new IllegalArgumentException("Fallback base language " + iso639 + " not found for language " + lang.getLangCode());
                        }
                    }
                    else {
                        // If no fallback is specified and no ISO codes are available, set the fallback to "en"
                        InzLang defaultLang = langs.get("en");
                        if (defaultLang != null) {
                            lang.setFallbackLang(defaultLang);
                        } else {
                            throw new IllegalArgumentException("Default fallback language 'en' not found for language " + lang.getLangCode().toLowerCase());
                        }
                    }
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to read directory: " + pathEntry.getAbsolutePath(), e);
        }   
    }

    /**
     * Search for a translation for the given key, starting with the specified language code.
     * If the key is not found in the specified language, it will search through the fallback languages
     * until it finds a match or exhausts all options.
     * 
     * @param key The translation key to search for.
     * @param langCode The language code to start the search from.
     * @return The translation for the key, or "!key!" if not found in any language.
     */
    public String x(String key, String langCode) {
        InzLang lang = langs.get(langCode.toLowerCase());
        if (lang != null) {
            return lang.x(key);
        }
        return null;
    }

    /**
     * Get the path name of this InzEntry.
     * 
     * @return The path name as a String.
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * Get the path entry (File) of this InzEntry.
     * 
     * @return The path entry as a File object.
     */
    protected File getPathEntry() {
        return pathEntry;
    }

    /**
     * Get the map of language codes to InzLang instances for this InzEntry.
     * 
     * @return A HashMap containing language codes and their corresponding InzLang instances.
     */
    protected HashMap<String, InzLang> getLangs() {
        return langs;
    }

    /**
     * Get the InzLang instance for the specified language code.
     * 
     * @param langCode The language code to retrieve the InzLang instance for.
     * @return The InzLang instance for the specified language code, or null if not found.
     */
    protected InzLang getLang(String langCode) {
        return langs.get(langCode.toLowerCase());
    }
}
