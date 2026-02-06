package maratonajava.javacore.Vio.test.FileReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("O Devdojo é lindo, é o melhor curso do Brasillllllllllllll\nContinuar na próxima linha\n");
            bw.newLine();
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
