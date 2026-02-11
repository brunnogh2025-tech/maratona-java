package projeto_biblioteca0902;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*










ADICIONAR UM CAPITALIZE
TRATAR AS EXCECOES














 */
public class BibliotecaTest {
    private static List<Livro> repositorioDeLivros = new ArrayList<>(List.of(
            new Livro("PERCY JACKSON","FANTASIA"),
            new Livro("HARRY POTTER","FANTASIA"),
            new Livro("O EXORCISTA","TERROR"),
            new Livro("CHAPEUZINHO VERMELHO","INFANTIL"),
            new Livro("HAMLET","DRAMA")
    ));
    private static List<Livro> livrosEmprestados = new ArrayList<>();
    static void main(String[] args) {
        System.out.println("Seja bem-vindo(a) a biblioteca.");
        try(Scanner teclado = new Scanner(System.in)) {
            while (true) {
                System.out.println("O que você deseja: " +
                        "\nCadastrar um novo livro no repositório: pressione 1" +
                        "\nListar os livros existentes no momento dentro do repositório: pressione 2" +
                        "\nPegar emprestado um livro: pressione 3" +
                        "\nDevolver um livro que havia sido pego emprestado: pressione 4" +
                        "\nBuscar um livro pelo título: pressione 5" +
                        "\nBuscar livro(s) por genero: pressione 6" +
                        "\nEncerrar o programa: pressione 7");

                int i = teclado.nextInt();
                teclado.nextLine();
                if (i == 1) {
                    System.out.println("Título: ");
                    String titulo = teclado.nextLine();

                    System.out.println("Gênero: ");
                    String genero = teclado.nextLine();

                    titulo = titulo.toUpperCase();
                    genero = genero.toUpperCase();
                    repositorioDeLivros.add(new Livro(titulo, genero));
                } else if (i == 2) {
                    repositorioDeLivros.stream().forEach(System.out::println);
                } else if (i == 3) {
                    System.out.println("Digite o nome do livro que você quer: ");
                    String emprestaLivro = teclado.nextLine();
                    String emprestaLivroUp = emprestaLivro.toUpperCase();
                    if (repositorioDeLivros.stream().anyMatch(l -> l.gettitulo().equals(emprestaLivroUp))) {
                        repositorioDeLivros.stream().filter(l -> l.gettitulo().equals(emprestaLivroUp)).forEach(livro -> livrosEmprestados.add(livro));
                        repositorioDeLivros.removeIf(l -> l.gettitulo().equals(emprestaLivroUp));
                    } else {
                        System.out.println("Não temos este livro na biblioteca.");
                    }
                } else if (i == 4) {
                    System.out.println("Livro a ser devolvido: ");
                    String devolveLivro = teclado.nextLine();
                    String devolveLivroUp = devolveLivro.toUpperCase();
                    if (livrosEmprestados.stream().anyMatch(livro -> livro.gettitulo().equals(devolveLivroUp))) {
                        livrosEmprestados.stream().filter(livro -> livro.gettitulo().equals(devolveLivroUp)).forEach(livro -> repositorioDeLivros.add(livro));
                        livrosEmprestados.removeIf(livro -> livro.gettitulo().equals(devolveLivroUp));
                    } else {
                        System.out.println("Voce não pode devolver um livro que não foi emprestado.");
                    }
                } else if (i == 5) {
                    System.out.println("Qual livro deseja buscar? ");
                    String buscaLivro = teclado.nextLine();
                    String buscaLivroUp = buscaLivro.toUpperCase();
                    if (repositorioDeLivros.stream().anyMatch(livro -> livro.gettitulo().equals(buscaLivroUp))) {
                        repositorioDeLivros.stream().filter(livro -> livro.gettitulo().equals(buscaLivroUp)).forEach(System.out::println);
                    } else {
                        System.out.println("Este livro não esta catalogado");
                    }
                } else if (i == 6) {
                    System.out.println("Qual o gênero de livros a ser buscado?");
                    String buscaGenero = teclado.nextLine();
                    String buscaGeneroUp = buscaGenero.toUpperCase();
                    if (repositorioDeLivros.stream().anyMatch(livro -> livro.getGenero().contains(buscaGeneroUp))) {
                        repositorioDeLivros.stream().filter(livro -> livro.getGenero().equals(buscaGeneroUp)).forEach(System.out::println);
                    } else {
                        System.out.println("Não há livros catalogados com este gênero");
                    }
                } else if (i == 7) {
                    System.out.println("Encerrando o programa...");
                    break;
                } else {
                    System.out.println("Inválido, só são permitidos números de 1 a 7.");
                }

            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Resposta inválida, voce não pode enviar um valor em texto ou decimal aonde pede uma resposta numérica inteira.");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }




    }
}

