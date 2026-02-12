package projeto_biblioteca0902;

import java.util.Comparator;

import static projeto_biblioteca0902.RepositorioLivro.*;

public class LivroService {
    static void cadastro(String titulo, String genero) {
        String tituloUp = titulo.toUpperCase();
        String generoUp = genero.toUpperCase();
        saveRepositorio(new Livro(tituloUp, generoUp));
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

    static void buscaTitulo(String title) {
        String buscaLivroUp = title.toUpperCase();
        if (getRepositorioDeLivros().stream().anyMatch(livro -> livro.gettitulo().equals(buscaLivroUp))) {
            getRepositorioDeLivros().stream().filter(livro -> livro.gettitulo().equals(buscaLivroUp)).forEach(System.out::println);
        } else {
            System.out.println("Este livro não esta catalogado");
        }
    }
    static void buscaGenero(String title) {

        String buscaGeneroUp = title.toUpperCase();
        if (getRepositorioDeLivros().stream().anyMatch(livro -> livro.getGenero().contains(buscaGeneroUp))) {
            getRepositorioDeLivros().stream().filter(livro -> livro.getGenero().equals(buscaGeneroUp)).forEach(System.out::println);
        } else {
            System.out.println("Não há livros catalogados com este gênero");
        }
    }
}
