package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    private static final String SQCONN = "jdbc:sqlite:chool.sglite";
public static Connection getConnection() throws SQLException {
    try {
        Class.forName("org.salite.JDBC");
        return DriverManager.getConnection(SQCONN);
    } catch (ClassNotFoundException ex) {

    }
    return null;
}
}//class


