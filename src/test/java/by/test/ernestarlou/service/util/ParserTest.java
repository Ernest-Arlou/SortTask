package by.test.ernestarlou.service.util;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ParserTest extends TestCase {
    private static final String LINE = "A" + '\t' + "B" + '\t' + "C";
    private static final String[] ROW = {"A", "B", "C"};


    public void testParseLinesToRows() {
        List<String> lines = new ArrayList<>();
        lines.add(LINE);
        List<String[]> actual = Parser.parseLinesToRows(lines);
        List<String[]> expected = new ArrayList<>();
        expected.add(ROW);


        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(actual.get(i), expected.get(i));
        }
    }

    public void testParseRowsToLines() {
        List<String[]> rows = new ArrayList<>();
        rows.add(ROW);
        List<String> actual = Parser.parseRowsToLines(rows);
        List<String> expected = new ArrayList<>();
        expected.add(LINE);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }


    }
}