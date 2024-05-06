package by.test.ernestarlou.service.util;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RowComparatorTest extends TestCase {


    private static final String[] ROW_A = {"90", "80", "1"};
    private static final String[] ROW_B = {"90", "80", "abc"};
    private static final String[] ROW_C = {"90", "80", "bbb"};
    private static final String[] ROW_D = {"100", "80", "60"};
    private static final String[] ROW_E = {"100", "80"};

    @Test
    public void testCompare() {
        List<String[]> unsortedRows = new ArrayList<>();

        unsortedRows.add(ROW_E);
        unsortedRows.add(ROW_D);
        unsortedRows.add(ROW_C);
        unsortedRows.add(ROW_A);
        unsortedRows.add(ROW_B);


        List<String[]> actual = unsortedRows.stream().sorted(new RowComparator()).collect(Collectors.toList());
        List<String[]> expected = new ArrayList<>();
        expected.add(ROW_A);
        expected.add(ROW_B);
        expected.add(ROW_C);
        expected.add(ROW_D);
        expected.add(ROW_E);

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertArrayEquals(expected.get(i), actual.get(i));
        }

    }


    @Test
    public void testOneEmpty() {
        RowComparator rowComparator = new RowComparator();

        String[] a = {};
        String[] b = {"x"};

        assertEquals(1, rowComparator.compare(a, b));

    }

}




