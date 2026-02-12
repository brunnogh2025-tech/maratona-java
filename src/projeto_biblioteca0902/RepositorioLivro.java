package projeto_biblioteca0902;

import java.util.ArrayList;
import java.util.List;

public class RepositorioLivro {
    static List<Livro> repositorioDeLivros = new ArrayList<>(List.of(
            new Livro("PERCY JACKSON","FANTASIA",1L),
            new Livro("HARRY POTTER","FANTASIA",2L),
            new Livro("O EXORCISTA","TERROR",3L),
            new Livro("CHAPEUZINHO VERMELHO","INFANTIL",4L),
            new Livro("HAMLET","DRAMA",5L)
    ));
    static void save(Livro livro){
        if (repositorioDeLivros != null) {
            livro.setId(repositorioDeLivros.getLast().getId() + 1);
        } else {
            livro.setId(1L);
        }
        repositorioDeLivros.add(livro);
    }
}
