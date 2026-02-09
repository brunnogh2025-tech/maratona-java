package maratonajava.javacore.ZZFstreams.test;

import java.io.File;
import java.io.IOException;
import java.lang.foreign.MemoryLayout;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    static void main(String[] args) {
        //Stream de ints
        IntStream cont = IntStream.rangeClosed(1,50)
                .filter(n -> n % 2 == 0);
        cont.forEach(i -> System.out.print(i + " "));
        System.out.println();

        //Stream de Strings
        Stream<String> cdz = Stream.of("Eleve","O","Cosmo","No seu coração")
                .map(String::toUpperCase);

        cdz.forEach(s -> System.out.print(s + " "));
        System.out.println();

        int num[] = {1,2,3,4,5} ;
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        File file = new File("file.txt");
        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            lines.filter(l -> l.contains("Java"))
                    .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
