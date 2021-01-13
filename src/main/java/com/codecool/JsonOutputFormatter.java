package com.codecool;

import com.jakewharton.fliptables.FlipTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader data) {
        int HEADER_INDEX = 0;
        int indention = 5;
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

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[\n");
        for (int i = 0; i < rows.size(); i++) {
            stringBuilder.append(" ".repeat(indention))
                    .append("{\n");
            for (int j = 0; j < rows.get(HEADER_INDEX).length; j++) {
                stringBuilder.append(" ".repeat(indention*2))
                        .append(rows.get(HEADER_INDEX)[j])
                        .append(" : ")
                        .append(rows.get(i)[j]);
                if (j != rows.get(HEADER_INDEX).length - 1) {
                    stringBuilder.append(",");
                }
                stringBuilder.append("\n");
            }
            stringBuilder.append(" ".repeat(indention))
                    .append("}");
            if (i != rows.size() - 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append("\n");
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }
}
