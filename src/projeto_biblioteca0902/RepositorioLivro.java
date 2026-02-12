package projeto_biblioteca0902;

import java.util.ArrayList;
import java.util.List;

public class RepositorioLivro {
    private static List<Livro> repositorioDeLivros = new ArrayList<>(List.of(
            new Livro("PERCY JACKSON","FANTASIA",1L),
            new Livro("HARRY POTTER","FANTASIA",2L),
            new Livro("O EXORCISTA","TERROR",3L),
            new Livro("CHAPEUZINHO VERMELHO","INFANTIL",4L),
            new Livro("HAMLET","DRAMA",5L)
    ));
    private static List<Livro> livrosEmprestados = new ArrayList<>();
    public static List<Livro> getRepositorioDeLivros() {
        return repositorioDeLivros;
    }

    public static List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    static void saveRepositorio(Livro livro){
        if (!livro.getEmprestado()) {
            if (!getRepositorioDeLivros().isEmpty()) {
                if (getLivrosEmprestados().isEmpty() || getRepositorioDeLivros().getLast().getId() > getLivrosEmprestados().getLast().getId()) {
                    livro.setId(getRepositorioDeLivros().getLast().getId() + 1);
                } else {
                    livro.setId(getLivrosEmprestados().getLast().getId() + 1);
                }
            } else {
                livro.setId(1L);
            }
        }
        livro.setEmprestado(false);
        getRepositorioDeLivros().add(livro);
    }
    static void saveEmprestado(Livro livro){
        livro.setEmprestado(true);
        livrosEmprestados.add(livro);
    }

}
