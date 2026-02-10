package projeto_biblioteca0902;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String genero;

    public Livro(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String gettitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(genero, livro.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero);
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'';
    }
}
