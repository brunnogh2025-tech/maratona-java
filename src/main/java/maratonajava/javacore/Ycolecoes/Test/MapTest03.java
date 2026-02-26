package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5,"Attack on Titan",19.9);
        Manga manga2 = new Manga(1,"Berserk",9.5);
        Manga manga3 = new Manga(4,"Hellsing Ultimate",3.2);
        Manga manga4 = new Manga(3,"Pokemon",11.20);
        Manga manga5 = new Manga(2,"Dragon Ball Z",2.99);

        List<Manga> mangaConsumidorList = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,mangaConsumidorList);
        consumidorManga.put(consumidor2,mangaConsumidorList2);
        for (Map.Entry<Consumidor,List<Manga>> entry : consumidorManga.entrySet()){
            System.out.print(entry.getKey().getNome() + " comprou ");
            for(Manga manga : entry.getValue()){
                System.out.print("| " + manga.getNome() + " | ");
            }
            System.out.println();
        }
    }
}
