package com.codecool;

import com.jakewharton.fliptables.FlipTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TableOutputFormatter implements OutputFormatter{
    @Override
    public void printToConsole(BufferedReader data) {
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

        String[] header = new String[rows.get(0).length];
        String[][] rowsForFlipTable = new String[rows.size() - 1][];

        for (int i = 0; i < rows.size(); i++) {
            String[] dataForFlipTables = new String[rows.get(0).length];
            for (int j = 0; j < rows.get(0).length; j++) {
                if (i == 0) {
                    header[j] = rows.get(i)[j];
                } else {
                    dataForFlipTables[j] = rows.get(i)[j];
                }
            }
            if (i > 0) {
                rowsForFlipTable[i - 1] = dataForFlipTables;
            }
        }
        System.out.println(FlipTable.of(header, rowsForFlipTable));
    }
}
