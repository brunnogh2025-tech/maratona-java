package maratonajava.javacore.ZZBcomportamento.interfaces;
import maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anônimas, funções, concisa
    boolean test(Car car);
    //(parâmetro) -> <expressão>
    //(Car car)   -> <car.getColor("verde")
}

