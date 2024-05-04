package by.test.ernestarlou;

import by.test.ernestarlou.dao.FileDAO;
import by.test.ernestarlou.dao.TXTFileDAO;
import by.test.ernestarlou.service.SorterImpl;

import java.util.List;

/**
 * Hello world!
 *
 */
public class Runner
{
    public static void main( String[] args )
    {

        String inFileName ="x:/in.txt";
        String outFileName ="x:/out.txt";

        FileDAO fileDAO = new TXTFileDAO();
        List<String> lines =  fileDAO.readTableFile(inFileName);

        System.out.println("lol");
        for (String string : lines) {
            System.out.println(string);
        }

        SorterImpl sorter = new SorterImpl();
        List<String> sortedLines = sorter.sort(lines);



        System.out.println("kek");
        for (String string : sortedLines) {
            System.out.println(string);
        }


    }
}
