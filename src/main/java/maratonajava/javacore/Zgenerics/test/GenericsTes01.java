package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTes01 {
    static void main(String[] args) {
        //Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String s : lista){
            System.out.println(s);
        }
        add(lista, new Consumidor("Midoriya"));
        for (String s : lista){
            System.out.println(s);
            /*Saída: Exceção ClassCastException.
            * O Java permitiu adicionar objetos do
            * tipo Consumidor na lista, mesmo tendo
            * o generics definido como String, mas
            * ao refazer o mesmo foreach de antes,
            * deu erro justamente por o último onjeto
            * não ser String.
            * */
        }
    }
    private static void add(List list, Consumidor consumer){
       list.add(consumer);
    }
}
