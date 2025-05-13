
package com.meritfundwork.config;
import java.sql.*;

public class DbConfig {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/merit_funds", "root", "");
    }
}
