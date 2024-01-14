package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    public static final String userName = "postgres";
    public static final String password = "postgres";
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(URL, userName, password);
    }

}


// реализуйте настройку соеденения с БД


