package by.test.ernestarlou.dao;

import java.util.List;

public interface FileDAO {
    public List<String> readTableFile(String location);

    public void writeTableFile(List<String> rows, String location);


}
