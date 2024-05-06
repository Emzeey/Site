package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void connect(String url) {
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("Connected!\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
