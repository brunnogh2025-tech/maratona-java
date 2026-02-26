package maratonajava.javacore.ZZFstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Widnei Suane","Catarina Santos","Sandy Carolina");
        List<String> developers = List.of("William","David","Harisson");
        List<String> students = List.of("Edipo","Gustavo Lima","Gustavo Mendes","Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo){
            for (String person : people){
                System.out.println(person);
            }
        }
        //flatMap sera utilizado quando for preciso tirar um atributo de dentro de uma condição aninhada
        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
