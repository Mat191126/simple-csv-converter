package com.codecool.formatters;

import java.io.BufferedReader;
import java.util.List;

public class XmlOutputFormatter implements OutputFormatter{

    @Override
    public void printToConsole(BufferedReader data) {
        int HEADER_INDEX = 0;
        int INDENTION = 5;
        List<String[]> rows = getRows(data);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<rowset>\n");
        for (int i = 0; i < rows.size(); i++) {
            stringBuilder.append(" ".repeat(INDENTION))
                    .append("<row>\n");
            for (int j = 0; j < rows.get(HEADER_INDEX).length; j++) {
                stringBuilder.append(" ".repeat(INDENTION*2))
                        .append("<").append(rows.get(HEADER_INDEX)[j]).append(">")
                        .append(rows.get(i)[j])
                        .append("</").append(rows.get(HEADER_INDEX)[j]).append(">")
                        .append("\n");
            }
            stringBuilder.append(" ".repeat(INDENTION))
                    .append("</row>")
                    .append("\n");
        }
        stringBuilder.append("</rowset>");
        System.out.println(stringBuilder.toString());
    }
}
