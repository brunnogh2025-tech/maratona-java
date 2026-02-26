package maratonajava.javacore.QString;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo");
        System.out.println(sb);
    }
}
