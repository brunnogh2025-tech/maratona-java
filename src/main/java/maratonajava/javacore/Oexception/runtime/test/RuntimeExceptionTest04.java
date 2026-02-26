package maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    static void main(String[] args) {
        //Múltiplas exceções:
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        //Se possível, sempre deixar os catchs com tipos de exceções
        //mais genéricos pro final.
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        }catch (Exception e){
            //Neste catch vai acontecer a regra do polimorfismo, ou seja,
            //se o parâmetro e que é do tipo Exception, for instância de
            //alguma das classes filhas de Exception, vai realizar a ação
            //respectiva a determinada classe, como SQLException, ou FileNotFoundException.
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
