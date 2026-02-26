package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;
import maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParâmetroTest02 {
    private static List<Car> cars = List.of(
            new Car("green",2011),
            new Car("black",1998),
            new Car("red",2019));
    static void main(String[] args) {
        List<Car> greenCars = filter(cars,(Car car) -> car.getColor().equals("green"));

    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for(Car car : cars){
            if (carPredicate.test(car)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
