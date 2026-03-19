package projeto_cadastro_retiro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3307/retiro";
        String usuario = "root";
        String senha = "G!tHu825";
        return DriverManager.getConnection(url,usuario,senha);
    }
}
