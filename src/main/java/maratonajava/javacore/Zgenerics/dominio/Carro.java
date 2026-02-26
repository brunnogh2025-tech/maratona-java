package maratonajava.javacore.Zgenerics.dominio;

public class Carro {
    private String nome;

    public Carro(String name) {
        this.nome = name;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
