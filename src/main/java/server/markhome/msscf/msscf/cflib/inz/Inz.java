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
import java.util.ArrayList;

/**
 * Inz is the main class for the CFLib Internationalization (Inz) library.
 * It provides a framework for managing translations and language files.
 * The Inz class is responsible for loading language files, managing language codes,
 * and providing access to translations through the InzLang class.
 */
public class Inz {

    /**
     * The language file path is a list of semicolon-separated path names to language file directories.
     * In each directory may be any number of 2 or 5 letter .properties files which are loaded on a per-language basis,
     * with the pre-".properties" portion of the file name used as the language code.
     * The built-in default path is "resource:server/markhome/msscf/msscf/cflib/inz/langs".  Although the only populated
     * language in that resource directory is "en", there is a hierarchy of accepted language codes and their fallbacks
     * defined with no actual translations in them, so the default for CFLib is to report all exceptions in English.
     */
    protected String langPath = null;

    /**
     * The language file entries matching the langPath.
     */
    protected ArrayList<InzEntry> entries = new ArrayList<>();

    /**
     * Default constructor for Inz.
     * Initializes the Inz instance with the default language path.
     * The default language path is set to "resource:server/markhome/msscf/msscf/cflib/inz/langs".
     * This constructor can be used when no specific language path is required.
     */
    public Inz() {
        setLangPath("resource:server/markhome/msscf/msscf/cflib/inz/langs");
    }

    /**
     * Constructor for Inz with a specified language path.
     * This constructor allows you to set a custom language path for the Inz instance.
     * The language path can be a directory or a resource path where language files are located.
     * If the provided path is null or empty, it defaults to "resource:server/markhome/msscf/msscf/cflib/inz/langs".
     * @param langPath
     */
    public Inz(String langPath) {
        setLangPath(langPath);
    }

    /**
     * Sets the language file path for this Inz instance.
     * This method allows you to specify a custom path for language files.
     *
     * @param langPath The path to the language files, which can be a directory or a resource path.
     */
    public final void setLangPath(String langPath) {
        if (langPath == null || langPath.isEmpty()) {
            langPath = "resource:server/markhome/msscf/msscf/cflib/inz/langs";
        }
        else {
            if (!langPath.endsWith("resource:server/markhome/msscf/msscf/cflib/inz/langs")) {
                langPath = langPath + ";resource:server/markhome/msscf/msscf/cflib/inz/langs";
            }
        }
        this.langPath = langPath;
    }

    /**
     * Get the semicolon-separeted list of language file paths.
     * This method returns the current language file path set for this Inz instance.
     *
     * @return The language file path as a String.
     */
    public String getLangPath() {
        return langPath;
    }

    /**
     * Load the language entries and their language translations from the path specified.
     * This method will clear existing entries if forceReload is true.
     * It will throw an IllegalStateException if the language path is not set or is empty.
     * It will throw an IllegalArgumentException if the path does not exist or is not a directory.
     * If any error occurs while loading the entries, it will throw a RuntimeException.
     *
     * @param forceReload If true, existing entries will be cleared before loading new ones.
     * @throws IllegalStateException if the language path is not set or is empty.
     * @throws IllegalArgumentException if the path does not exist or is not a directory.
     * @throws RuntimeException if an error occurs while loading the entries.
     * @see InzEntry#loadLangs()
     * @see InzLang
     * @see Inz#x(String, String)
     * @see InzEntry
     * @see InzLang#x(String)
     * 
     * This method is typically called to initialize the language entries before using the translation methods.
     * It allows for dynamic loading of language files from specified directories.
     * If the language path is not set, it will throw an exception to ensure that the user sets it before attempting to load entries.
     * The method supports reloading of entries by clearing existing ones if `forceReload` is true.
     * It iterates through each path in the semicolon-separated list, checking if the path exists and is a directory,
     * and then attempts to load language files from that directory.
     * If any path does not exist or is not a directory, it throws an IllegalArgumentException.
     * If an error occurs while loading the language files, it throws a RuntimeException with the error details.
     * The method ensures that all loaded entries are added to the `entries` list for later use in translations.
     * 
     * Example usage:
     * <pre>
     * Inz inz = new Inz();
     * inz.setLangPath("path/to/languages");
     * inz.loadLangEntries(true); // Load entries, clearing existing ones if any
     * String translation = inz.x("greeting", "en"); // Get translation for 'greeting' in English
     * </pre>
     */
    public void loadLangEntries(boolean forceReload) {
        if (langPath == null || langPath.isEmpty()) {
            throw new IllegalStateException("Language path is not set. Please set the language path before loading entries.");
        }
        if (forceReload) {
            entries.clear(); // Clear existing entries if force reload is requested
        }
        String[] paths = langPath.split(";");
        for (String path : paths) {
            File pathEntry = new File(path);
            if (!pathEntry.exists()) {
                throw new IllegalArgumentException("Language path does not exist: " + path);
            }
            if (pathEntry.isDirectory()) {
                InzEntry entry = new InzEntry(path);
                try {
                    entry.loadLangs();
                    entries.add(entry);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to load language entries from path: " + path, e);
                }
            } else {
                throw new IllegalArgumentException("Language path must be a directory: " + path);
            }
        }
    }

    /**
     * Get a translation for a given key in the specified language, probing each of the path entries in order
     * until a non-null translation is found.  If no translation is found, it returns "!key!".
     * This method is case-insensitive for both the key and the language code.
     * @param key The translation key to look up.
     * @param langCode The language code to use for the translation.
     * @return The translated string if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key or language code is null or empty.
     * @see InzEntry#x(String, String)
     * @see InzLang#x(String)
     */
    public String x(String key, String langCode) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        if (langCode == null || langCode.isEmpty()) {
            throw new IllegalArgumentException("Language code cannot be null or empty.");
        }
        String lowerLangCode = langCode.toLowerCase();
        for (InzEntry entry : entries) {
            String translation = entry.x(key, lowerLangCode);
            if (translation != null) {
                return translation; // Return the first non-null translation found
            }
        }
        return "!" + key + "!";
    }
}
