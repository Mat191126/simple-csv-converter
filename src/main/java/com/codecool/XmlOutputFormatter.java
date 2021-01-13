package com.codecool;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlOutputFormatter implements OutputFormatter{
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
        stringBuilder.append("<rowset>\n");
        for (int i = 0; i < rows.size(); i++) {
            stringBuilder.append(" ".repeat(indention))
                    .append("<row>\n");
            for (int j = 0; j < rows.get(HEADER_INDEX).length; j++) {
                stringBuilder.append(" ".repeat(indention*2))
                        .append("<").append(rows.get(HEADER_INDEX)[j]).append(">")
                        .append(rows.get(i)[j])
                        .append("</").append(rows.get(HEADER_INDEX)[j]).append(">")
                        .append("\n");
            }
            stringBuilder.append(" ".repeat(indention))
                    .append("</row>")
                    .append("\n");
        }
        stringBuilder.append("</rowset>");
        System.out.println(stringBuilder.toString());
    }
}
