package by.test.ernestarlou.service.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Parser {

    public static final String DIVIDE_BY_TAB_REGEX = "\\t";
    public static final char TAB_SYMBOL = '\t';

    public static List<String[]> parseLinesToRows(List<String> lines) {
        return lines.stream()
                .map(line -> line.split(DIVIDE_BY_TAB_REGEX))
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public static List<String> parseRowsToLines(List<String[]> rows) {
        return rows.stream()
                .map(x -> {
                    StringBuilder line = new StringBuilder();
                    for (int i = 0; i < x.length; i++) {
                        if (i < (x).length - 1) {
                            line.append(x[i]).append(TAB_SYMBOL);
                        } else {
                            line.append(x[i]);
                        }

                    }
                    return line.toString();
                }).collect(Collectors.toList());
    }
}
