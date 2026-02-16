package projeto_biblioteca0902;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RepositorioLivro{
    private static List<Livro> repositorioDeLivros = new ArrayList<>(List.of(
            new Livro("PERCY JACKSON","FANTASIA","Rick Riodan", LocalDate.of(2005,7,1),1L),
            new Livro("HARRY POTTER E A PEDRA FILOSOFAL","FANTASIA","", LocalDate.of(1997,6,26),2L),
            new Livro("O EXORCISTA","TERROR","WILLIAM PETTER BLATTY",LocalDate.of(1971,5,5),3L),
            new Livro("1984","DISTOPIA","GEORGE ORWELL",LocalDate.of(1949,6,8),4L),
            new Livro("DOM QUIXOTE","ROMANCE","MIGUEL DE CERVANTES SAAVEDRA",LocalDate.of(1605,1,16),5L)
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
