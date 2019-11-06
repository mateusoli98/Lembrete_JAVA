package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionFactory {
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://127.0.0.1/lembrete";
    
   public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        return conn;
    }
}
