package projeto_biblioteca0902;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*









APRIMORAR BUSCA POR GENERO;
TRATAR AS EXCECOES














 */
public class BibliotecaTest {
    private static List<Livro> repositorioDeLivros = new ArrayList<>(List.of(
            new Livro("Percy Jackson","Fantasia"),
            new Livro("Harry Potter","Fantasia"),
            new Livro("O Exorcista","Terror"),
            new Livro("Chapeuzinho Vermelho","Infantil"),
            new Livro("Hamlet","Drama")
    ));
    private static List<Livro> livrosEmprestados = new ArrayList<>();
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seja bem-vindo(a) a biblioteca.");

        while (true){
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
            if(i == 1) {
               System.out.println("Título: ");
               String titulo = teclado.nextLine();

               System.out.println("Gênero: ");
               String genero = teclado.nextLine();

               repositorioDeLivros.add(new Livro(titulo, genero));
            } else if (i == 2) {
               repositorioDeLivros.stream().forEach(System.out::println);
            } else if (i == 3) {
                System.out.println("Digite o nome do livro que voce quer: ");
                String emprestaLivro = teclado.nextLine();
                if(repositorioDeLivros.stream()
                        .anyMatch(l -> l.gettitulo().equals(emprestaLivro))){
                    repositorioDeLivros.stream().filter(l -> l.gettitulo().equals(emprestaLivro)).forEach(livro -> livrosEmprestados.add(livro));
                    repositorioDeLivros.removeIf(l -> l.gettitulo().equals(emprestaLivro));
                }
                else{
                    System.out.println("Nao temos este livro na biblioteca.");
                }
            } else if (i == 4) {
                System.out.println("Livro a ser devolvido: ");
                String devolveLivro = teclado.nextLine();
                if(livrosEmprestados.stream().anyMatch(livro -> livro.gettitulo().equals(devolveLivro))){
                    livrosEmprestados.stream().filter(livro -> livro.gettitulo().equals(devolveLivro)).forEach(livro -> repositorioDeLivros.add(livro));
                    livrosEmprestados.removeIf(livro -> livro.gettitulo().equals(devolveLivro));
                }
                else {
                    System.out.println("Voce nao pode devolver um livro que nao foi emprestado.");
                }
            } else if (i == 5) {
                System.out.println("Qual livro deseja buscar? ");
                String buscaLivro = teclado.nextLine();
                if (repositorioDeLivros.stream().anyMatch(livro -> livro.gettitulo().equals(buscaLivro))) {
                    repositorioDeLivros.stream().filter(livro -> livro.gettitulo().equals(buscaLivro)).forEach(System.out::println);
                } else {
                    System.out.println("Este livro nao esta catalogado");
                }
            } else if (i == 6) {
                System.out.println("Qual o genero de livros a ser buscado?");
                String buscaGenero = teclado.nextLine();
                if(repositorioDeLivros.stream().anyMatch(livro -> livro.getGenero().contains(buscaGenero))){
                    repositorioDeLivros.stream().filter(livro -> livro.getGenero().contains(buscaGenero)).forEach(System.out::println);
                }
                else{
                    System.out.println("Nao ha livros catalogados com este genero");
                }
            } else if (i == 7) {
                    System.out.println("Encerrando o programa...");
                    break;
                }

            }




    }
}

