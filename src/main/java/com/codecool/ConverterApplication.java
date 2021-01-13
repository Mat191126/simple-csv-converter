package com.codecool;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.nio.file.Path;

public class ConverterApplication {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("default_path");
        FileType outputType = FileType.UNSUPPORTED;
        if (args.length > 0) {
            switch (args.length) {
                case 1:
                    //only file path argument
                    path = Path.of(args[0]);
                    outputType = FileType.TABLE;
                    break;
                case 2:
                    //file type and file path arguments
                    outputType = FileType.getFileType(args[0]);
                    path = Path.of(args[1]);
                    break;
                default:
                    System.out.println("Wrong arguments. Enter file path to convert into table by default, " +
                                        "or file type and file path to convert into this file type.");
                    break;
            }
        } else {
            System.out.println("No input file defined");
            return;
        }
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SimpleCsvConverter simpleCsvConverter = (SimpleCsvConverter) context.getBean("simpleCsvConverter");
        simpleCsvConverter.convert(path, outputType);
    }
}
