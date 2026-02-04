package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentavelService<T>{
    private List<T> objetosDisponiveis;
    public RentavelService(List<T> availableObjects) {
        this.objetosDisponiveis = availableObjects;

    }


    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponível....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: "+t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto "+t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
    }
}
