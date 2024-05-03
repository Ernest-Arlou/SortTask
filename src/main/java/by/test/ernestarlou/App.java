package by.test.ernestarlou;

import by.test.ernestarlou.dao.FileDAO;
import by.test.ernestarlou.dao.TXTFileDAO;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String inFileName ="x:/in.txt";
        String outFileName ="x:/out.txt";

        FileDAO fileDAO = new TXTFileDAO();
        List<String> strings =  fileDAO.readTableFile(inFileName);
        fileDAO.writeTableFile(strings,outFileName);

//        System.out.println(strings.get(0));

//        for (String string : strings) {
//            System.out.println(string);
//        }


    }
}
