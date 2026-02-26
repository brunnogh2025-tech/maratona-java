package maratonajava.javacore.Ycolecoes.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        //No PriotityQueue, o menor item da lista é sempre o
        //primeiro a ser removido.
        System.out.println(fila);
        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
