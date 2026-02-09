package maratonajava.javacore.ZZFstreams.test;

import maratonajava.javacore.ZZFstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Overlord",3.99),
            new LightNovel("Violet Evergarder",5.99),
            new LightNovel("No Game No Life",2.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Fullmetal Alchemist",5.99),
            new LightNovel("Monogatari",4.00)
    ));
    static void main(String[] args) {


        //AnyMatch no exemplo abaixo, vai retornar true se existe um
        //LightNovel com o preço maior que 8.
        System.out.println(lightNovels.stream()
                .anyMatch(ln -> ln.getPrice() > 8));


        //AllMatch no exemplo abaixo, vai retornar truese todos os
        //LightNovels tem o preço maior que 8.
        System.out.println(lightNovels.stream()
                .allMatch(ln -> ln.getPrice() > 8));


        //noneMatch no exemplo abaixo, vai retornar true se nenhum dos
        //LightNovels tem o preço maior que 8.
        System.out.println(lightNovels.stream()
                .noneMatch(ln -> ln.getPrice() > 8));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny() //Retorna o 1º LightNovel que encontrar com preço > 3
                .ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                //.max retorna o LightNovel com maior preço dos que estão acima de 3,
                //enquanto o .min retorna o menor.
                .ifPresent(System.out::println);
    }
}
