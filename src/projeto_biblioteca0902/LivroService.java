package projeto_biblioteca0902;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.function.Function;

import static projeto_biblioteca0902.RepositorioLivro.*;

public class LivroService implements Function {
    static void cadastro(String titulo, String genero, String autor, int ano, int mes, int dia) {
        String tituloUp = titulo.toUpperCase();
        String generoUp = genero.toUpperCase();
        String autorUp = autor.toUpperCase();
        saveRepositorio(new Livro(tituloUp, generoUp, autorUp, LocalDate.of(ano,mes,dia)));
    }

    static void listar() {
        getRepositorioDeLivros().stream().sorted(Comparator.comparing(Livro::getId)).forEach(System.out::println);
    }

    static void empresta(String title) {
        String emprestaLivroUp = title.toUpperCase();
        if (getRepositorioDeLivros().stream().anyMatch(l -> l.gettitulo().equals(emprestaLivroUp))) {
            getRepositorioDeLivros().stream().filter(l -> l.gettitulo().equals(emprestaLivroUp)).forEach(livro -> saveEmprestado(livro));
            getRepositorioDeLivros().removeIf(l -> l.gettitulo().equals(emprestaLivroUp));
        } else {
            System.out.println("Não temos este livro na biblioteca.");
        }
    }
    static void devolve(String title) {
        String devolveLivroUp = title.toUpperCase();
        if (getLivrosEmprestados().stream().anyMatch(livro -> livro.gettitulo().equals(devolveLivroUp))) {
            getLivrosEmprestados().stream().filter(livro -> livro.gettitulo().equals(devolveLivroUp)).forEach(livro -> saveRepositorio(livro));
            getLivrosEmprestados().removeIf(livro -> livro.gettitulo().equals(devolveLivroUp));
        } else {
            System.out.println("Você não pode devolver um livro que não foi emprestado.");
        }
    }

    static void busca(String busca, Function function) {
        String buscaUp = busca.toUpperCase();
        if (getRepositorioDeLivros().stream().anyMatch(livro -> function.apply(livro).equals(buscaUp))) {
            getRepositorioDeLivros().stream().filter(livro -> function.apply(livro).equals(buscaUp)).forEach(System.out::println);
        } else {
            System.out.println("Este livro não esta catalogado");
        }
    }

    @Override
    public Object apply(Object o) {
        return null;
    }
}



