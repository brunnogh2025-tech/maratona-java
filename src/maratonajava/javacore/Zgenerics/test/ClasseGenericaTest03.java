package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.dominio.Carro;
import maratonajava.javacore.Zgenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Canoa")));
        RentavelService<Carro> carroRentavelService = new RentavelService<>(carrosDisponiveis);
        RentavelService<Barco> barcoRentavelService = new RentavelService<>(barcosDisponiveis);
        Barco barco = barcoRentavelService.buscarObjetoDisponivel();
        System.out.println("-----------------------");
        barcoRentavelService.retornarObjetoAlugado(barco);
    }
}
