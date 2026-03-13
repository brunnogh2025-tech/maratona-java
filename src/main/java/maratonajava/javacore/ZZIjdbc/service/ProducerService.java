package maratonajava.javacore.ZZIjdbc.service;

import maratonajava.javacore.ZZIjdbc.dominio.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void delete(int id){
        if (id <= 0){
            throw new IllegalArgumentException("Invalid value for ID");
        }
        ProducerRepository.delete(id);
    }
    public static void update(Producer producer){
        requiredValidId(producer.getId());
        ProducerRepository.update(producer);
    }
    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name) {return ProducerRepository.findByName(name);}

    public static void showProducerMetaData(){
        ProducerRepository.showProducerMetaData();
    }

    public static void showDriverMetaData(){
        ProducerRepository.showDriverMetaData();
    }

    private static void requiredValidId(Integer id){
        if (id <= 0 || id == null){
            throw new IllegalArgumentException("Invalid value for ID");
        }
    }

}
