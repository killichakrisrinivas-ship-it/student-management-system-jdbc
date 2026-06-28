package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
private static final String URL = "jdbc:postgresql://localhost:5432/student";
private static final String USER = "postgres";
private static final String PWORD ="Chakri@45";

public static Connection getConnection() throws Exception{
    return DriverManager.getConnection(
            URL,
            USER,
            PWORD
    );
}
}
