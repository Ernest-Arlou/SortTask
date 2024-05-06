package by.test.ernestarlou.dao;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class TXTFileDAOTest extends TestCase {
    private static final String IN_TEST_PATH = "src/test/resources/in_test.txt";
    private static final String OUT_TEST_PATH = "src/test/resources/out_test.txt";
    private static final String LINE = "A" + '\t' + "B" + '\t' + "C";

    public void testReadLines() throws DAOException {
        TXTFileDAO fileDAO = new TXTFileDAO();
        List<String> lines = fileDAO.readLines(IN_TEST_PATH);
        assertEquals(LINE, lines.get(0));

    }

    public void testWriteLines() throws DAOException {
        TXTFileDAO fileDAO = new TXTFileDAO();
        List<String> lines = new ArrayList<>();
        lines.add(LINE);
        lines.add(LINE);

        fileDAO.writeLines(OUT_TEST_PATH,lines);
        List<String> writtenLines = fileDAO.readLines(OUT_TEST_PATH);

        for (int i = 0; i < lines.size(); i++) {
            assertEquals(lines.get(i),writtenLines.get(i));
        }

    }
}