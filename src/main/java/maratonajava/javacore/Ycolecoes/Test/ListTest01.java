package maratonajava.javacore.Ycolecoes.Test;


import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //1.5
        List<String> nomes2 = new ArrayList<>();
        nomes.add("William");
        nomes.add("DevDojo");
        nomes.add("Suane");
        nomes.remove(2);
        nomes2.add("Suane");
        nomes2.add("Academy");
        nomes.addAll(nomes2);
        int size = nomes.size();
        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
            nomes.add("Suane");
        }
        System.out.println(nomes);

        List<Integer> numeros= new ArrayList<>();
        numeros.add(1);

    }
}
