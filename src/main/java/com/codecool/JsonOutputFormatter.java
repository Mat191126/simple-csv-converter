package com.codecool;

import java.io.BufferedReader;
import java.util.List;

public class JsonOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader data) {
        int HEADER_INDEX = 0;
        int INDENTION = 5;
        List<String[]> rows = getRows(data);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[\n");
        for (int i = 0; i < rows.size(); i++) {
            stringBuilder.append(" ".repeat(INDENTION))
                    .append("{\n");
            for (int j = 0; j < rows.get(HEADER_INDEX).length; j++) {
                stringBuilder.append(" ".repeat(INDENTION*2))
                        .append(rows.get(HEADER_INDEX)[j])
                        .append(" : ")
                        .append(rows.get(i)[j]);
                if (j != rows.get(HEADER_INDEX).length - 1) {
                    stringBuilder.append(",");
                }
                stringBuilder.append("\n");
            }
            stringBuilder.append(" ".repeat(INDENTION))
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
