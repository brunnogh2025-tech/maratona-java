package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest03 {
    static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        printConsultaCachorro(animais);
        printConsultaAnimal(animais);

    }
    private static void printConsulta(List<? extends Animal> animals){
                                    //WildCard
        for (Animal animal : animals){
            animal.consulta();
        }
        //animals.add(new Cachorro());
        //Ao usar o WildCard com extends, é proíbido adicionar elementos à lista
    }
    private static void printConsultaCachorro(List<? super Cachorro> animals){
        for (Object o : animals){
            if(o instanceof Cachorro){
                Cachorro dog = (Cachorro) o;
                dog.consulta();
            }
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals){
        for (Object o : animals){
            if(o instanceof Animal){
                ((Animal) o).consulta();
            }
        }
        /*Ao usar o WildCard com super, é permitido adicionar elementos à lista,
        * visto que o Java vai ter certeza que os objetos a serem adicionados
        * serão de classe filhas do tipo da lista.*/
    }
}

