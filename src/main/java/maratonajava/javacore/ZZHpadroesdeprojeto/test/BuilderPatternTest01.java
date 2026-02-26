package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("William")
                .lastName("Suane")
                .userName("viradonojiraya")
                .email("william.suane@devdojo.academy")
                .build();
        System.out.println(build);
    }
}
