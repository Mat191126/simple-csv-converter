package com.codecool;

public enum FileType {
    JSON, XML, CSV, TABLE, UNSUPPORTED;

    public static FileType getFileType(String fileType) {
        switch (fileType) {
            case "json":
                return JSON;
            case "xml":
                return XML;
            case "table":
                return TABLE;
            case "csv":
                return CSV;
            default:
                return UNSUPPORTED;
        }
    }
}
