package by.test.ernestarlou;

import by.test.ernestarlou.service.ServiceException;
import by.test.ernestarlou.service.ServiceFactory;
import by.test.ernestarlou.service.Sorter;

import java.io.File;


public class Runner {
    private static final String IN_FILE = "in.txt";
    private static final String OUT_FILE = "out.txt";

    public static void main(String[] args) {


        File file = new File(Runner.class.getProtectionDomain().getCodeSource().getLocation()
                .getFile());
        String pathIn = file.getParent() + File.separator + IN_FILE;
        String pathOut = file.getParent() + File.separator + OUT_FILE;

        Sorter sorter = ServiceFactory.getInstance().getSorter();

        try {
            sorter.sortFiles(pathIn, pathOut);
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }


    }
}
