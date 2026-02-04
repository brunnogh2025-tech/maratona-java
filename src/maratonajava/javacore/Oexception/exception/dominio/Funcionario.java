package maratonajava.javacore.Oexception.exception.dominio;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException{
        /*O metodo salvar, proveniente da classe Pessoa, quando é
        sobrescrito, não obriga a colocar o lançamento das exceções
        que estão no metodo original de pessoa.*/

        /*Não é permitido colocar em métodos de classes filhas throws que
        * lançam superclasses ou classes mães das que foram lançadas
        * no metodo original.
        *
        * Exemplos:
        *   Não poderia lançar a classe Exception
        * neste metodo, já que é a classe mãe de todas as exceções
        * que foram lançadas no metodo original, e que na verdade,
        * é mãe ou pai de todas as classes;
        *   E nem poderia lançar a classe IOException dentro
        * deste metodo, já que IOException é pai da classe
        * FileNotFoundException, que foi lançada no metodo original.*/
        System.out.println("Salvando funcionário");
    }
}
