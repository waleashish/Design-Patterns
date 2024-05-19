package creational.singletonPattern;

/**
 * This class represents a singleton class to connect to database ensuring a single
 * db connection instance is maintained throughout the application.
 * 
 * @author Ashish Wale
 */
public class DBConnection {

    private static DBConnection dbConnection = null;
    // Other fields

    private DBConnection() {
        // private constructor to prevent instantiation
    }

    public static DBConnection getConnection() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }

    public void read() {
        // Read from database
    }

    public void write() {
        // Write to database
    }
}