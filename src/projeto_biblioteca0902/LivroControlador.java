package projeto_biblioteca0902;




import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                        "\nBuscar um livro: pressione 5" +
                        "\nEncerrar o programa: pressione 6");

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
                    System.out.println("Dia: ");
                    int dia = teclado.nextInt();

                    System.out.println("Mês: ");
                    int mes = teclado.nextInt();

                    System.out.println("Ano: ");
                    int ano = teclado.nextInt();
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
                    System.out.println("Deseja buscar livro(s) por: " +
                            "\nTítulo: pressione 1" +
                            "\nGênero: pressione 2" +
                            "\nID: pressione 3" +
                            "\nData: pressione 4" +
                            "\nAutor: pressione 5");
                    int op = teclado.nextInt();
                    teclado.nextLine();
                    if(op == 1){
                        System.out.println("Qual livro deseja buscar? ");
                        String buscaLivro = teclado.nextLine();
                        busca(buscaLivro,Livro::gettitulo);
                    } else if (op == 2) {
                        System.out.println("Qual gênero deseja buscar? ");
                        String buscaLivro = teclado.nextLine();
                        busca(buscaLivro,Livro::getGenero);
                    } else if (op == 3) {
                        System.out.println("Qual livro deseja buscar? ");
                        Long buscaLivro = teclado.nextLong();
                        buscaId(buscaLivro,Livro::getId);
                    } else if (op == 4) {
                        System.out.println("Data de lancamento: ");
                        System.out.println("Dia: ");
                        int dia = teclado.nextInt();

                        System.out.println("Mês: ");
                        int mes = teclado.nextInt();

                        System.out.println("Ano: ");
                        int ano = teclado.nextInt();
                        LocalDate data = LocalDate.of(ano,mes,dia);
                        String novaData = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        busca(novaData,Livro::getDataLancamento);
                    } else if (op == 5) {
                        System.out.println("Qual autor deseja buscar? ");
                        String buscaLivro = teclado.nextLine();
                        busca(buscaLivro,Livro::getAutor);
                    } else {
                        System.out.println("Inválido, só podem números de 1 a 5");
                    }
                } else if (i == 6) {
                    System.out.println("Encerrando o programa...");
                    break;
                }else {
                    System.out.println("Inválido, só são permitidos números de 1 a 6.");
                }
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Resposta inválida, voce não pode enviar um valor em texto/decimal aonde pede uma resposta numérica inteira.");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

}
