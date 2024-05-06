package by.test.ernestarlou.service;

import by.test.ernestarlou.dao.DAOException;
import by.test.ernestarlou.dao.DAOFactory;
import by.test.ernestarlou.dao.FileDAO;
import by.test.ernestarlou.service.util.Parser;
import by.test.ernestarlou.service.util.RowComparator;

import java.util.List;
import java.util.stream.Collectors;

public class FileSorterImpl implements Sorter {

    @Override
    public void sortFiles(String inFileLocation, String outFileLocation) throws ServiceException {
        FileDAO fileDAO = DAOFactory.getInstance().getFileDAO();

        List<String> lines;
        try {
            lines = fileDAO.readLines(inFileLocation);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        if (lines == null){
            throw new ServiceException("Null from DAO");
        }

        List<String[]> rows = Parser.parseLinesToRows(lines);
        List<String[]> sortedRows = rows.stream().sorted(new RowComparator()).collect(Collectors.toList());

        try {
            fileDAO.writeLines(outFileLocation, Parser.parseRowsToLines(sortedRows));
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

    }

}
