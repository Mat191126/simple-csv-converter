package com.codecool;

import java.io.BufferedReader;

public class JsonOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader data) {
        System.out.println("JSON");
    }
}
