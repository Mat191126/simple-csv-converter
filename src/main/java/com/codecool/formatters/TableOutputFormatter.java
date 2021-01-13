package com.codecool.formatters;

import com.jakewharton.fliptables.FlipTable;

import java.io.BufferedReader;
import java.util.List;

public class TableOutputFormatter implements OutputFormatter{

    @Override
    public void printToConsole(BufferedReader data) {
        int HEADER_INDEX = 0;
        List<String[]> rows = getRows(data);

        String[] header = new String[rows.get(HEADER_INDEX).length];
        String[][] rowsForFlipTable = new String[rows.size() - 1][];

        for (int i = 0; i < rows.size(); i++) {
            String[] dataForFlipTables = new String[rows.get(HEADER_INDEX).length];
            for (int j = 0; j < rows.get(HEADER_INDEX).length; j++) {
                if (i == HEADER_INDEX) {
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
