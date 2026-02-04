package maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        //byte, short, int, long, float e double são inicializados com 0
        //char é inicializado com '\u0000'
        //boolean é inicializado com false
        // String é inicializado com null
        String[] itens = new String[3];
        itens[0] = "Goku";
        itens[1] = "Kurosaki";
        itens[2] = "Luffy";

        for(int i=0; i < itens.length; i++) {
            System.out.println(itens[i]);
        }
    }
}
