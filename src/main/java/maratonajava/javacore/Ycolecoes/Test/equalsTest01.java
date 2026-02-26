package maratonajava.javacore.Ycolecoes.Test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class equalsTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("1ABC1","iPhone");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
    }
}
