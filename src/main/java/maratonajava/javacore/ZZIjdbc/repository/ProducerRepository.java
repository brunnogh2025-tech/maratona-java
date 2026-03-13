package maratonajava.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.dominio.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "INSERT INTO `anime_store`.`Producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.printf("Inserted producer '%s' in the database, rows affected %d\n",producer.getName(),rowsAffected);
        } catch (SQLException e) {
            System.out.printf("Error while trying to insert producer '%s'\n",producer.getName(),e);
        }
    }
    public static void delete(int id){
        String sql = "DELETE FROM `anime_store`.`Producer` WHERE (`idProducer` = '%d');".formatted(id);
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.printf("Deleted producer '%d' from the database, rows affected %d\n",id,rowsAffected);
        } catch (SQLException e) {
            System.out.printf("Error while trying to delete producer '%d'\n",id,e);
        }
    }
    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`Producer` SET `name` = '%s' WHERE (`idProducer` = '%d');\n".formatted(producer.getName(),producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.printf("Updated producer '%d' from the database, rows affected %d\n", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            System.out.printf("Error while trying to update producer '%d'\n", producer.getId(), e);
        }
    }
    public static List<Producer> findAll() {
        return findByName("");
    }
    public static List<Producer> findByName(String name) {
        System.out.println("Finding producer by name");
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT * FROM anime_store.Producer WHERE name LIKE '%s';"
                .formatted("%" + name + "%");
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while(rs.next()){
                int id = rs.getInt("idProducer");
                String nm = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(nm).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            System.out.printf("Error while trying to find all producers '%d'\n",e);
        }
        return producers;
    }
    public static void showProducerMetaData() {
        System.out.println("Showing Producer MetaData");
        String sql = "SELECT * FROM anime_store.Producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetadata = rs.getMetaData();
            int columnCount = rsMetadata.getColumnCount();
            System.out.printf("Columns count '%d'\n",columnCount);
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Table name: " + rsMetadata.getTableName(i));
                System.out.println("Column name: " + rsMetadata.getColumnName(i));
                System.out.println("Column size: " + rsMetadata.getColumnDisplaySize(i));
                System.out.println("Column type: " + rsMetadata.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            System.out.printf("Error while trying to showing metadatas '%d'\n",e);
        }
    }
    public static void showDriverMetaData() {
        System.out.println("Showing Driver MetaData");
        String sql = "SELECT * FROM anime_store.Producer;";
        try (Connection conn = ConnectionFactory.getConnection()){
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                System.out.println("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And supports CONCUR_UPDATABLE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                System.out.println("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And supports CONCUR_UPDATABLE");
                }
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                System.out.println("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)){
                    System.out.println("And supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            System.out.printf("Error while trying to show all conditions '%d'\n",e);
        }
    }

}


