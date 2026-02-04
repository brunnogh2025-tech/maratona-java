package maratonajava.javacore.ZZAclasseinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        new OuterClassesTest01().new Inner();
        inner.printOuterClassAtribute();
    }
}
