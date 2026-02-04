package maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    static void main(String[] args) {
        try{
            divisao(1,0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;

    }
}
