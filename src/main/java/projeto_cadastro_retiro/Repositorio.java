package projeto_cadastro_retiro;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Repositorio {
    public static void save(String nome, int idade){
        try(Connection conn = Conn.getConnection();
            Statement stmt = conn.createStatement()) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
