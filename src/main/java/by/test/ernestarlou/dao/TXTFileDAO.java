package by.test.ernestarlou.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TXTFileDAO implements FileDAO {

    private static final Logger logger = LoggerFactory.getLogger(TXTFileDAO.class);

    public static final String READ_ERROR_MSG = "read file error";
    public static final String WRITE_ERROR_MSG = "write file error";

    @Override
    public List<String> readLines(String location) throws DAOException {

        List<String> collection = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(location))) {
            while (reader.ready()) {
                collection.add(reader.readLine().strip());
            }
        } catch (IOException e) {
            logger.error("Read Error in TXTFileDAO", e);
            throw new DAOException(READ_ERROR_MSG, e);
        }
        return collection;
    }

    @Override
    public void writeLines(String location, List<String> lines) throws DAOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(location))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            logger.error("Write Error in TXTFileDAO", e);
            throw new DAOException(WRITE_ERROR_MSG, e);
        }

    }


}
