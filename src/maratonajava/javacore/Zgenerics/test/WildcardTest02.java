package maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        //printConsulta(cachorros);
        //printConsulta(gatos);

        /*O Java não vai conseguir rodar a aplicação por conta que
        * ele não sabe que a lista cachorros e a lista gatos
        * tem Generics de tipos/classes filhas de Animal,
        * e então, ao fazer o metodo printConsulta,
        * que só aceita uma lista de <Animal>, o Java não sabe
        * que as listas cachorros e gatos são de tipos filhos de
        * Animal.*/

    }
    private static void printConsulta(List<Animal> animals){
        for (Animal animal : animals){
            animal.consulta();
        }
          animals.add(new Cachorro());
    }
}
