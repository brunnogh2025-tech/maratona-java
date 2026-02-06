package maratonajava.javacore.ZZFstreams.test;

import maratonajava.javacore.ZZFstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> lNPriceLess4 = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels){
            if(lightNovel.getPrice() <= 4){
                lNPriceLess4.add(lightNovel.getTitle());
            }
            if(lNPriceLess4.size() >= 3){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(lNPriceLess4);

    }
}
