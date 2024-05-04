package by.test.ernestarlou.service;

import by.test.ernestarlou.service.util.Parser;
import by.test.ernestarlou.service.util.RowComparator;

import java.util.List;
import java.util.stream.Collectors;

public class SorterImpl implements Sorter {
    @Override
    public List<String> sort(List<String> lines) {
        List<String[]> rows = Parser.parseLinesToRows(lines);



//        for (String[] strRow : rows
//             ) {
//            for (int i = 0; i < strRow.length; i++) {
//                System.out.println(strRow[i]);
//            }
//        }


        List<String[]> sortedRows = rows.stream().sorted(new RowComparator()).collect(Collectors.toList());



        return Parser.parseRowsToLines(sortedRows);
    }
}
