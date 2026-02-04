package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponível....");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: "+barco);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }
    public void retornarBarcoAlugado(Barco car){
        System.out.println("Devolvendo barco "+car);
        barcosDisponiveis.add(car);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(barcosDisponiveis);
    }
}
