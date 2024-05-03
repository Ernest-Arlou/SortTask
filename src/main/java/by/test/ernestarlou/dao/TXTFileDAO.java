package by.test.ernestarlou.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TXTFileDAO implements FileDAO {

    public static final String TAB_SYMBOL = "\t";

    @Override
    public List<String> readTableFile(String location) {

        List<String> collection = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(location))) {
            while (reader.ready()) {
                collection.add(reader.readLine().strip());
            }
        } catch (IOException e) {

        }
        return collection;
    }

    @Override
    public void writeTableFile(List<String> rows, String location) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(location))) {
            for (String row : rows) {
                writer.write(row);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {

        }

    }


}
