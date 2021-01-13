package com.codecool;

import com.codecool.formatters.OutputFormatter;
import com.codecool.formatters.OutputFormatterFactory;

import java.io.IOException;
import java.nio.file.Path;

public class SimpleCsvConverter {
    FileReader fileReader;

    public SimpleCsvConverter(){

    }

    public SimpleCsvConverter(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public void convert(Path filePath, FileType outputType) throws IOException {
        System.out.println("I convert CSV to output format " + outputType.toString().toLowerCase());
        OutputFormatter outputFormatter = OutputFormatterFactory.createByFormat(outputType);
        outputFormatter.printToConsole(fileReader.readData(filePath));
    }
}
