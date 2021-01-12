package com.codecool;

import java.io.BufferedReader;

public class XmlOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader data) {
        System.out.println("XML");
    }
}
