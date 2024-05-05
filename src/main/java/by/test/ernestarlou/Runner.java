package by.test.ernestarlou;

import by.test.ernestarlou.service.ServiceException;
import by.test.ernestarlou.service.ServiceFactory;
import by.test.ernestarlou.service.Sorter;


public class Runner {
    public static void main(String[] args) {

        String inFileName = "x:/in.txt";
        String outFileName = "x:/out.txt";


        Sorter sorter = ServiceFactory.getInstance().getSorter();

        try {
            sorter.sortFiles(inFileName, outFileName);
        } catch (ServiceException e) {
            e.printStackTrace();
        }


    }
}
