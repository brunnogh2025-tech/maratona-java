package maratonajava.javacore.ZZFstreams.test;

import maratonajava.javacore.ZZFstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest08 {
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

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(pr -> pr > 3)
                .sum();

        System.out.println(sum);
    }
}
