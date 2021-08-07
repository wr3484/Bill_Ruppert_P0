package com.revature.Util;

import java.sql.*;
//import java.beans.Statement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.DriverManager;

public class ConnectionFactory {
    // This will create a connection with the DB without having to hardcode



    public static Connection getConnection() throws SQLException {
        // Obtain a connection through JDBC
        Connection conn = null;

        conn = DriverManager.getConnection(
                System.getenv("db_url"),System.getenv("db_name"),
                        System.getenv("db_password"));


        return conn;
    }

//    List<Planet> dbList = new ArrayList<>();
//
//    String sql = "Select * from accountinformation";
//
//    Statement s = f.createStatement();
//
//    ResultSet rs = s.executeQuery(sql);
}


