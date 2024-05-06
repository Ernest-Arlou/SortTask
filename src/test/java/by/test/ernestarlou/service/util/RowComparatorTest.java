package by.test.ernestarlou.service.util;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RowComparatorTest extends TestCase {


    public static final String[] A = {"90", "80", "1"};
    public static final String[] B = {"90", "80", "abc"};
    public static final String[] C = {"90", "80", "bbb"};
    public static final String[] D = {"100", "80", "60"};
    public static final String[] E = {"100", "80"};

    @Test
    public void testSort() {
        List<String[]> unsortedRows = new ArrayList<>();

        unsortedRows.add(E);
        unsortedRows.add(D);
        unsortedRows.add(C);
        unsortedRows.add(A);
        unsortedRows.add(B);


        List<String[]> actual = unsortedRows.stream().sorted(new RowComparator()).collect(Collectors.toList());
        List<String[]> expected = new ArrayList<>();
        expected.add(A);
        expected.add(B);
        expected.add(C);
        expected.add(D);
        expected.add(E);

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




