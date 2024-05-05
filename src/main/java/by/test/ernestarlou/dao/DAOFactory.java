package by.test.ernestarlou.dao;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final FileDAO fileDAO = new TXTFileDAO();


    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public FileDAO getFileDAO() {
        return fileDAO;
    }

}
