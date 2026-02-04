package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5,"Attack on Titan",19.9,0));
        mangas.add(new Manga(1,"Berserk",9.5,5));
        mangas.add(new Manga(4,"Hellsing Ultimate",3.2,0));
        mangas.add(new Manga(3,"Pokemon",11.20,2));
        mangas.add(new Manga(2,"Dragon Ball Z",2.99,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//           Manga manga = mangaIterator.next();
//            if(manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
