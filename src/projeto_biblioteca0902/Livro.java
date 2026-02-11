package projeto_biblioteca0902;

import java.util.Objects;

public class Livro {
    // TODO adicionar o ID
    private String titulo;
    private Long id;
    private String genero;

    public Livro(String titulo, String genero, Long id) {
        this.titulo = titulo;
        this.genero = genero;
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Livro(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String gettitulo() {
        return titulo;
    }

    public Long getId() {return id;}

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
