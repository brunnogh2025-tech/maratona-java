package projeto_biblioteca0902;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.function.Function;

import static projeto_biblioteca0902.RepositorioLivro.*;

public class LivroService{
    static void cadastro(String titulo, String genero, String autor, int ano, int mes, int dia) {
        String tituloCap = capitalize(titulo);
        String generoCap = capitalize(genero);
        String autorCap = capitalize(autor);
        saveRepositorio(new Livro(tituloCap, generoCap, autorCap, LocalDate.of(ano,mes,dia)));
    }

    static void listar() {
        getRepositorioDeLivros().stream().sorted(Comparator.comparing(Livro::getId)).forEach(System.out::println);
    }

    static void empresta(String title) {
        String emprestaLivroCap = capitalize(title);
        if (getRepositorioDeLivros().stream().anyMatch(l -> l.gettitulo().equals(emprestaLivroCap))) {
            getRepositorioDeLivros().stream().filter(l -> l.gettitulo().equals(emprestaLivroCap)).forEach(livro -> saveEmprestado(livro));
            getRepositorioDeLivros().removeIf(l -> l.gettitulo().equals(emprestaLivroCap));
        } else {
            System.out.println("Não temos este livro na biblioteca.");
        }
    }
    static void devolve(String title) {
        String devolveLivroCap = capitalize(title);
        if (getLivrosEmprestados().stream().anyMatch(livro -> livro.gettitulo().equals(devolveLivroCap))) {
            getLivrosEmprestados().stream().filter(livro -> livro.gettitulo().equals(devolveLivroCap)).forEach(livro -> saveRepositorio(livro));
            getLivrosEmprestados().removeIf(livro -> livro.gettitulo().equals(devolveLivroCap));
        } else {
            System.out.println("Você não pode devolver um livro que não foi emprestado.");
        }
    }

    static <R> void busca(String busca, BuscaLivro<R> buscaLivro) {
        String buscaCap = capitalize(busca);
        if (getRepositorioDeLivros().stream().anyMatch(livro -> buscaLivro.busca(livro).equals(buscaCap))) {
            getRepositorioDeLivros().stream().filter(livro -> buscaLivro.busca(livro).equals(buscaCap)).forEach(System.out::println);
        } else {
            System.out.println("Este livro não esta catalogado");
        }
    }
    static <R> void buscaId(Long busca, BuscaLivro<R> buscaLivro) {
        if (getRepositorioDeLivros().stream().anyMatch(livro -> buscaLivro.busca(livro).equals(busca))) {
            getRepositorioDeLivros().stream().filter(livro -> buscaLivro.busca(livro).equals(busca)).forEach(System.out::println);
        } else {
            System.out.println("Este livro não esta catalogado");
        }
    }
    static String capitalize(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }


}



