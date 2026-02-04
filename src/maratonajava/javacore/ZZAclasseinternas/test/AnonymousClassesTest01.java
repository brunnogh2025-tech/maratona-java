package maratonajava.javacore.ZZAclasseinternas.test;


class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    static void main(String[] args) {
        Animal animal = new Animal(){
            /*
            * Classes anônimas são instanciadas por um breve período,
            * e logo depois deixam de existir.
            */
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
