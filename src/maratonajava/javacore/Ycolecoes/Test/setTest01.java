package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setTest01 {
    static void main(String[] args) {
        //Set<Manga> mangas = new HashSet<>();
        Set<Manga> mangas = new LinkedHashSet<>();
        //No LinkedHashSet, a ordem de inserção é mantida na lista, com a
        //ordem dos mangas segundo suas IDs sendo 5, 1, 4, 3, 2, exatamente
        //como escrito abaixo.
        mangas.add(new Manga(5,"Attack on Titan",19.9,0));
        mangas.add(new Manga(1,"Berserk",9.5,5));
        mangas.add(new Manga(4,"Hellsing Ultimate",3.2,0));
        mangas.add(new Manga(3,"Pokemon",11.20,2));
        mangas.add(new Manga(2,"Dragon Ball Z",2.99,0));
        mangas.add(new Manga(2,"Dragon Ball Z",2.99,0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
