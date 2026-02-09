package projeto_biblioteca0902;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaTest {
    private static List<Livro> repositorioDeLivros = new ArrayList<>(List.of(
            new Livro("Percy Jackson","Fantasia"),
            new Livro("Harry Potter","Fantasia"),
            new Livro("O Exorcista","Terror"),
            new Livro("Chapeuzinho Vermelho","Infantil"),
            new Livro("Hamlet","Drama")
    ));
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
                    "\nEncerrar o programa: pressione 6");

            int i = teclado.nextInt();

            teclado.nextLine();
        if(i == 1){
            System.out.println("Título: ");
            String titulo = teclado.nextLine();

            System.out.println("Gênero: ");
            String genero = teclado.nextLine();

            repositorioDeLivros.add(new Livro(titulo,genero));
            repositorioDeLivros.stream().forEach(System.out::println);
        }
        }
    }
}
