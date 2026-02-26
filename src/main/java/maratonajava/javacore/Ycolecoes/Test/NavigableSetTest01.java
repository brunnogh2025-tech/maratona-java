package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;
import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone phone1, Smartphone phone2) {
        return phone1.getMarca().compareTo(phone2.getMarca());
    }
}
class SmartphoneSerialNumberComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone phone1, Smartphone phone2) {
        return phone1.getSerialNumber().compareTo(phone2.getSerialNumber());
    }
}
public class NavigableSetTest01 {
    static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        set.add(new Smartphone("123", "Nokia"));
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaByPriceComparator());
        mangas.add(new Manga(5,"Attack on Titan",19.9));
        mangas.add(new Manga(1,"Berserk",9.5));
        mangas.add(new Manga(4,"Hellsing Ultimate",3.2));
        mangas.add(new Manga(3,"Pokemon",11.20));
        mangas.add(new Manga(2,"Dragon Ball Z",2.99));

        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21,"Yuyu Hakusho", 3.2, 5);
        System.out.println("---------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
    }
}
