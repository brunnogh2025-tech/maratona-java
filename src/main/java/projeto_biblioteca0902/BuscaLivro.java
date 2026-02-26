package projeto_biblioteca0902;
@FunctionalInterface
public interface BuscaLivro<R> {
    abstract R busca(Livro l);
}
