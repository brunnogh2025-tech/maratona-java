package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
