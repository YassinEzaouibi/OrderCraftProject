package ordercraft.project.DataBase;

import java.sql.*;


public class ConnectDataBase {
    private static Connection instance = null;
    private static String DB_USER_NAME = "root";
    private static String DB_USER_PASSWORD = "";
    private static String DB_URL = "jdbc:mysql://localhost:3306/ordercraft";

    public static Connection getInstance() throws SQLException {
        if (instance == null || instance.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                instance = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_USER_PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error In DB");
                throw new RuntimeException(e);
            }
        }
        return instance;
    }

    /*
     * */
}