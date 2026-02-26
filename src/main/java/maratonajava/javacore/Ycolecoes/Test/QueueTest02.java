package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaByPriceComparator());
        Manga manga1 = new Manga(5,"Attack on Titan",19.9);
        Manga manga2 = new Manga(1,"Berserk",9.5);
        Manga manga3 = new Manga(4,"Hellsing Ultimate",3.2);
        Manga manga4 = new Manga(3,"Pokemon",11.20);
        Manga manga5 = new Manga(2,"Dragon Ball Z",2.99);

        mangas.add(manga1);
        mangas.add(manga2);
        mangas.add(manga3);
        mangas.add(manga4);
        mangas.add(manga5);

        for (Manga manga : mangas){
            System.out.println(manga);

        }
        System.out.println("----------------------------------");
        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
