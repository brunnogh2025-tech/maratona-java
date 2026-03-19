package projeto_cadastro_retiro;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    public static void save(String nome, int idade, String telefone){
        String sql = "INSERT INTO `retiro`.`Participante` (`nome`, `idade`, `telefone`) VALUES (?, ?, ?);";
        try(Connection conn = Conn.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,nome);
            stmt.setInt(2,idade);
            stmt.setString(3,telefone);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void delete(int id){
        String sql = "DELETE FROM `retiro`.`Participante` WHERE (`id` = ?);";
        try(Connection conn = Conn.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public static void update(int id, String nome, int idade, String telefone){
        String sql = "UPDATE `retiro`.`Participante` SET `nome` = ?, `idade` = ?, `telefone` = ? WHERE (`id` = ?);";
        try(Connection conn = Conn.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1,nome);
            stmt.setInt(2,idade);
            stmt.setString(3,telefone);
            stmt.setInt(4,id);
            stmt.executeUpdate();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public static List<Participante> consulta(){
        String sql = "SELECT * FROM retiro.Participante;";
        try(Connection conn = Conn.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {
            List<Participante> participantes = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String telefone = rs.getString("telefone");
                Participante participante = Participante.builder().id(id).nome(nome).idade(idade).telefone(telefone).build();
                participantes.add(participante);
            }
            return participantes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
