package maratonajava.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.dominio.Producer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.printf("Inserted producer '%s' in the database, rows affected $d\n",producer.getName(),rowsAffected);
        } catch (SQLException e) {
            System.out.printf("Error while trying to insert producer '%s'\n",producer.getName(),e);
        }
    }
    public static void delete(int id){
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.printf("Deleted producer '%d' from the database, rows affected %d\n",id,rowsAffected);
        } catch (SQLException e) {
            System.out.printf("Error while trying to delete producer '%d'\n",id,e);
        }
    }
    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');\n".formatted(producer.getName(),producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.printf("Updated producer '%d' from the database, rows affected %d\n", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            System.out.printf("Error while trying to update producer '%d'\n", producer.getId(), e);
        }
    }
    public static List<Producer> findAll() {
        System.out.println("Finding all Producers");
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT id,name FROM anime_store.producer;\n";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(name).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            System.out.printf("Error while trying to find all producers '%d'\n",e);
        }
        return producers;

    }
}
