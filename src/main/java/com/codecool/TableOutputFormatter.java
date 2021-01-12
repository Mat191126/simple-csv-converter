package com.codecool;

import java.io.BufferedReader;

public class TableOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader data) {
        System.out.println("Table");
    }
}
