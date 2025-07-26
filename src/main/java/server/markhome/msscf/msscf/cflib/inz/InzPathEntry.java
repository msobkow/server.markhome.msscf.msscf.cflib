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
import java.io.InputStream;

/**
 * An InzPathEntry can represent either a resource path, in which case it needs to specify a class for resource loading, and use a path
 * that starts with "resource:", or a file system path, in which case it accesses files directly from the file system.
 */
public final class InzPathEntry {

    private String path;
    private Class<?> clazz;

    /**
     * Constructs an InzPathEntry with the specified file system path.
     *
     * @param path the path for this entry
     */
    public InzPathEntry(String path) {
        this.path = path;
    }

    /**
     * Constructs an InzPathEntry with the specified class and file system path.
     *
     * @param clazz the class associated with this entry
     * @param path  the path for this entry
     */
    public InzPathEntry(Class<?> clazz, String path) {
        this.clazz = clazz;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    /**
     * Returns the resource associated with this path entry.
     * This method should be overridden by subclasses that represent resource paths.
     */
    public InputStream getInputStream(String resourceName) {
        if (resourceName == null || resourceName.isEmpty()) {
            return null;
        }
        if (path == null || path.isEmpty()) {
            throw new IllegalStateException("Path is not set for this InzPathEntry.");
        }

        if (path.startsWith("resource:")) {
            if (clazz != null) {
                InputStream input = clazz.getClassLoader().getResourceAsStream(path.substring(9) + "/" + resourceName);
                if (input == null) {
                    throw new IllegalStateException("Resource not found: " + path + resourceName);
                }
                return input;
            }
            else {
                throw new IllegalStateException("Class is not set for this resource-based InzPathEntry.");
            }
        }
        else {
            String fullName = path + File.separator + resourceName;
            File f = new File(fullName);
            if (!f.exists()) {
                return null;
            }
            if (!f.isFile()) {
                throw new IllegalStateException("Path does not point to a file: " + fullName);
            }
            if (!f.canRead()) {
                throw new IllegalStateException("Cannot read file: " + fullName);
            }
            try {
                return new java.io.FileInputStream(f);
            } catch (java.io.FileNotFoundException e) {
                throw new IllegalStateException("File not found: " + fullName, e);
            }
        }
    }
}
