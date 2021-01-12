package com.codecool;

public class OutputFormatterFactory {

    public static OutputFormatter createByFormat(FileType outputFormat) {
        switch (outputFormat) {
            case JSON:
                return new JsonOutputFormatter();
            case XML:
                return new XmlOutputFormatter();
            case TABLE:
                return new TableOutputFormatter();
            default:
                return new UnsupportedTypeOutputFormatter();
        }
    }
}
