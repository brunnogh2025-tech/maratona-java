package maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Integer id;
    private String nome;
    private Double preco;
    private int quantidade;

    public Manga(Integer id, String name, double price) {
        Objects.requireNonNull(id, "Id não pode ser null");
        Objects.requireNonNull(name, "Name não pode ser null");
        this.id = id;
        this.nome = name;
        this.preco = price;
    }
    public Manga(Integer id, String name, double price, int quantity) {
        this(id,name,price);
        this.quantidade = quantity;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public int compareTo(Manga manga) {
//        if(this.id < manga.id){
//            return -1;
//        }
//        else if(this.id.equals(manga.id)){
//            return 0;
//        }
//        else{
//            return 1;
//        }
//        return this.nome.compareTo(manga.nome);

          //Metodo compareTo() só é possivel porque
          //o id faz parte da classe Wrapper Long,
          //o que não ocorreria se o id fosse um
          //tipo primitivo de int.
          return this.nome.compareTo(manga.nome);
    }
}
