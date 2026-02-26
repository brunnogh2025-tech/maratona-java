package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}
class MangaByPriceComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getPreco().compareTo(manga2.getPreco());
    }
}
public class MangaSortTest01 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5,"Attack on Titan",19.9));
        mangas.add(new Manga(1,"Berserk",9.5));
        mangas.add(new Manga(4,"Hellsing Ultimate",3.2));
        mangas.add(new Manga(3,"Pokemon",11.20));
        mangas.add(new Manga(2,"Dragon Ball Z",2.99));

        for(Manga manga:mangas){
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("-----------------------");
        for(Manga manga:mangas){
            System.out.println(manga);
        }
        System.out.println("-----------------------");
        Collections.sort(mangas, new MangaByIdComparator());
        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
