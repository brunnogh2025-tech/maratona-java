package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5,"Attack on Titan",19.9));
        mangas.add(new Manga(1,"Berserk",9.5));
        mangas.add(new Manga(4,"Hellsing Ultimate",3.2));
        mangas.add(new Manga(3,"Pokemon",11.20));
        mangas.add(new Manga(2,"Dragon Ball Z",2.99));

        MangaByIdComparator mbic = new MangaByIdComparator();
        Collections.sort(mangas,mbic);
        for (Manga manga:mangas){
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(2,"Dragon Ball Z",2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mbic));
    }
}
