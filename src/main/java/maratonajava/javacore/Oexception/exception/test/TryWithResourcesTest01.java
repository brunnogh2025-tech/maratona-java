package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        //Try with Resources fecha os arquivos na ordem de
        //inserção oposta
        try(Leitor2 leitor2 = new Leitor2();
            Leitor1 leitor1 = new Leitor1()){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
