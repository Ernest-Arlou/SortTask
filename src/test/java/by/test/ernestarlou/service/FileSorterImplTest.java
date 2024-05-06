package by.test.ernestarlou.service;

import by.test.ernestarlou.dao.DAOException;
import by.test.ernestarlou.dao.DAOFactory;
import by.test.ernestarlou.dao.FileDAO;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class FileSorterImplTest extends TestCase {

    private static final String UNSORTED_TEST_PATH = "src/test/resources/unsorted_test.txt";
    private static final String SORTED_TEST_PATH = "src/test/resources/sorted_test.txt";

    private static final String LINE_A = "90"+ '\t' + "80"+ '\t' +"1";
    private static final String LINE_B = "90"+ '\t' +"80"+ '\t' +"abc";
    private static final String LINE_C = "90"+ '\t' +"80"+ '\t' +"bbb";
    private static final String LINE_D = "100"+ '\t' +"80"+ '\t' +"60";
    private static final String LINE_E = "100"+ '\t' +"80";

    public void testSortFiles() throws ServiceException, DAOException {
        FileSorterImpl sorter = new FileSorterImpl();
        sorter.sortFiles(UNSORTED_TEST_PATH, SORTED_TEST_PATH);

        FileDAO fileDAO = DAOFactory.getInstance().getFileDAO();
        List<String> actual = fileDAO.readLines(SORTED_TEST_PATH);
        List<String> expected = new ArrayList<>();
        expected.add(LINE_A);
        expected.add(LINE_B);
        expected.add(LINE_C);
        expected.add(LINE_D);
        expected.add(LINE_E);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }

    }
}