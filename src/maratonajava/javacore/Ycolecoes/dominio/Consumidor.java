package maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor implements Comparable<Consumidor>{
    private Long id;
    private String nome;

    public Consumidor(String name) {
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
        this.nome = name;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Consumidor consumer) {
        return this.getNome().compareTo(consumer.getNome());
    }
}
