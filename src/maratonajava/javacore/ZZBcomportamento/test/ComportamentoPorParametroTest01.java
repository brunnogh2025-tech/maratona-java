package maratonajava.javacore.ZZBcomportamento.test;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("green",2011),
                new Car("black",1998),
                new Car("red",2019)
        );
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println("-----------------------");
        System.out.println(filterByYearBefore(cars,2015));

    }
    private static List<Car> filterCarByColor(List<Car> cars,String color){
        List<Car> colorCars = new ArrayList<>();
        for(Car car : cars){
            if (car.getColor().equals(color)){
                colorCars.add(car);
            }
        }
        return colorCars;
    }
    private static List<Car> filterByYearBefore(List<Car> cars,int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
