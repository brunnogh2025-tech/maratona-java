package maratonajava.javacore.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] integersArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integersArray));

        System.out.println("-------------------------");

        Integer[] numerosArray = {1, 2, 3};
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        //Resultado: os 2 souts retornam a mesma lista com os mesmo valores, pois há uma conexão entre arrayToList e numerosArray
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        System.out.println("-------------------------");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        //Resultado: Com a declaração feita instanciando o objeto de ArrayList, os 2 souts retornaram valores diferentes
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(numerosList);


    }
}
