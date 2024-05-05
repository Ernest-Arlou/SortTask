package by.test.ernestarlou.service;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final Sorter sorter = new FileSorterImpl();


    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public Sorter getSorter() {
        return sorter;
    }

}
