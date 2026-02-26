package projeto_biblioteca0902;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Livro{
    // TODO adicionar o ID
    private String titulo;
    private Long id;
    private String genero;
    private String autor;
    private String dataLancamento;
    private Boolean emprestado = false;

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Livro(String titulo, String genero, String autor, LocalDate dataLancamento, Long id) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.dataLancamento = dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.id = id;
    }
    public Livro(String titulo, String genero, String autor, LocalDate dataLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.dataLancamento = dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String gettitulo() {
        return titulo;
    }

    public Long getId() {return id;}

    public String getGenero() {
        return genero;
    }

    public Boolean getEmprestado() {
        return emprestado;
    }

    public String getDataLancamento() {return dataLancamento;}

    public String getAutor() {return autor;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(genero, livro.genero) && Objects.equals(id, livro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, id);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", id=" + id +
                '}';


    }
}
