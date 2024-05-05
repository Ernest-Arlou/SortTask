package by.test.ernestarlou.dao;

import junit.framework.TestCase;

import java.util.List;

public class TXTFileDAOTest extends TestCase {

    public void testReadLines() throws DAOException {
        TXTFileDAO fileDAO = new TXTFileDAO();
        List<String> lines = fileDAO.readLines("src/test/resources/in_test.txt");

    }

    public void testWriteLines() {
    }
}