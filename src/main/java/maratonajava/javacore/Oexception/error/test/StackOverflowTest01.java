package maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }

}
