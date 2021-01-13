package com.codecool.formatters;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface OutputFormatter {
    void printToConsole(BufferedReader data);

    default List<String[]> getRows(BufferedReader data) {
        List<String[]> rows = new ArrayList<>();
        String line = "";
        while (true) {
            try {
                if ((line = data.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] dataLine = line.split(",");
            rows.add(dataLine);
        }
        return rows;
    }
}
