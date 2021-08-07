package com.revature.Util;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    /**
     * This will create a connection with the DB without having to hardcode
     * Anytime the connection is needed this class can be called
     * @return
     * @throws SQLException
     */

    public static Connection getConnection() throws SQLException {
        // Obtain a connection through JDBC
        Connection conn = null;

        // Connection locates the Environment Variables for JDBC
        conn = DriverManager.getConnection(
                System.getenv("db_url"),System.getenv("db_name"),
                        System.getenv("db_password"));

        return conn;
    }
    
}


