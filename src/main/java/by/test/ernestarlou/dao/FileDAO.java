package by.test.ernestarlou.dao;

import java.util.List;

public interface FileDAO {
    public List<String> readLines(String location) throws DAOException;

    public void writeLines(String location, List<String> rows) throws DAOException;


}
