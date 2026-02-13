package maratonajava.javacore.Rclassesutilitarias.LocalDate;

import java.time.LocalDate;

public class LocalDateTest01 {
    static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate dataNascimento = LocalDate.of(2008,8,20);
        System.out.println(dataNascimento);

        LocalDate dataFutura = dataNascimento.plusDays(10);
        System.out.println("Data de retorno: "+dataFutura);

        LocalDate dataPassada = hoje.minusDays(25);
        System.out.println("Há 25 dias atrás foi o dia "+dataPassada);

        LocalDate proximosAnos = hoje.plusYears(10);
        System.out.println("10 anos a frente é: "+proximosAnos);

        LocalDate anosAnteriores = hoje.minusYears(5);
        System.out.println("5 anos atrás é: "+anosAnteriores);
        //----------------------------------------------------------
    }
}
