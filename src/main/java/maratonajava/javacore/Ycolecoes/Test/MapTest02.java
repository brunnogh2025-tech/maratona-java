package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        System.out.println(consumidor1);
        Manga manga1 = new Manga(5,"Attack on Titan",19.9);
        Manga manga2 = new Manga(1,"Berserk",9.5);
        Manga manga3 = new Manga(4,"Hellsing Ultimate",3.2);
        Manga manga4 = new Manga(3,"Pokemon",11.20);
        Manga manga5 = new Manga(2,"Dragon Ball Z",2.99);

        Map<Consumidor,Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga2);
        consumidorManga.put(consumidor2,manga3);
        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " Lê " + entry.getValue().getNome());
        }

    }
}
