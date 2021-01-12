package com.codecool;

import java.nio.file.Path;

public class SimpleCsvConverter {

    public void convert(Path filePath, FileType outputType) {
        System.out.println("I convert CSV to output format " + outputType.toString().toLowerCase());
    }
}
