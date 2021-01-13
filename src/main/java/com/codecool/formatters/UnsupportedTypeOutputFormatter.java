package com.codecool.formatters;

import java.io.BufferedReader;

public class UnsupportedTypeOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader data) {
        System.out.println("That output type is not supported");
    }
}
