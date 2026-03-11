package maratonajava.javacore.ZZIjdbc.test;

import maratonajava.javacore.ZZIjdbc.dominio.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

public class ConnectionTest01 {
    static void main(String[] args) {
        //Producer producer = Producer.builder().name("NHK").build();
        //Producer producerToUpdate = Producer.builder().id(17).name("MAD HOUSE").build();
        //ProducerService.update(producerToUpdate);
        //ProducerService.save(producer);
        //ProducerService.delete();
        List<Producer> producers = ProducerService.findAll();
        System.out.println(producers);
    }
}
