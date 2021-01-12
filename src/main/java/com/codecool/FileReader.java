package com.codecool;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public BufferedReader readData(Path path) throws IOException {
        return Files.newBufferedReader(path);
    }
}
