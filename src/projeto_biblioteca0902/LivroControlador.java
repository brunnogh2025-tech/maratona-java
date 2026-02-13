package projeto_biblioteca0902;




import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import static projeto_biblioteca0902.LivroService.*;



public class LivroControlador {
    static void executar(){
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

                    System.out.println("Autor: ");
                    String autor = teclado.nextLine();

                    System.out.println("Data de lancamento: ");
                    System.out.println("Ano: ");
                    int ano = teclado.nextInt();

                    System.out.println("Mês: ");
                    int mes = teclado.nextInt();

                    System.out.println("Dia: ");
                    int dia = teclado.nextInt();
                    cadastro(titulo, genero, autor, ano, mes, dia);

                } else if (i == 2) {
                    listar();
                } else if (i == 3) {
                    System.out.println("Digite o nome do livro que você quer: ");
                    String emprestaLivro = teclado.nextLine();
                    empresta(emprestaLivro);
                } else if (i == 4) {
                    System.out.println("Livro a ser devolvido: ");
                    String devolveLivro = teclado.nextLine();
                    devolve(devolveLivro);
                } else if (i == 5) {
                    System.out.println("Qual livro deseja buscar? ");
                    String buscaLivro = teclado.nextLine();
                    busca(buscaLivro,);
                } else if (i == 6) {
                    System.out.println("Qual o gênero de livros a ser buscado?");
                    String buscaGenero = teclado.nextLine();
                    buscaGenero(buscaGenero);
                } else if (i == 7) {
                    System.out.println("Encerrando o programa...");
                    break;
                }else {
                    System.out.println("Inválido, só são permitidos números de 1 a 7.");
                }
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Resposta inválida, voce não pode enviar um valor em texto/decimal aonde pede uma resposta numérica inteira.");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}
