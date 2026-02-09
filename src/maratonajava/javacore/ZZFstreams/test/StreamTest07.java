package maratonajava.javacore.ZZFstreams.test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest07 {
    static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);
        integers.stream()
                .reduce(Integer::sum)//Somará todos os números
                .ifPresent(System.out::println);

        integers.stream()
                .reduce((x,y) -> x + y)//Somará todos os números
                .ifPresent(System.out::println);

        integers.stream()
                .reduce((x,y) -> x * y)
                .ifPresent(System.out::println);

        System.out.println(integers.stream()
                .reduce(Integer::max));




    }
}
