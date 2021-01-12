package com.codecool;

import java.nio.file.Path;

public class ConverterApplication {
    public static void main(String[] args) {
        if (args.length > 0) {
            switch (args.length) {
                case 1:
                    //only file path argument
                    Path onlyPath = Path.of(args[0]);
                    FileType defaultOutputType = FileType.TABLE;
                case 2:
                    //file type and file path arguments
                    FileType outputType = FileType.getFileType(args[0]);
                    Path path = Path.of(args[1]);
                default:
                    System.out.println("Wrong arguments. Enter file path to convert into table by default, or file type and file path to convert into this file type.");
            }
        } else {
            System.out.println("No input file defined");
        }
    }
}
