package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Chevrolet";
        carro1.modelo = "Onix";
        carro1.ano = 2012;

        Carro carro2 = new Carro();
        carro2.nome = "Lamborghini";
        carro2.modelo = "SUV Urus";
        carro2.ano = 2018;

        System.out.println("Nome: " +carro1.nome+" | Modelo: "+carro1.modelo+" | Ano: "+carro1.ano);
        System.out.println("-----------------------------------------------");
        System.out.println("Nome: " +carro2.nome+" | Modelo: "+carro2.modelo+" | Ano: "+carro2.ano);
    }
}
