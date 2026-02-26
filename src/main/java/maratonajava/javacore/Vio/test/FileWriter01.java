package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)){
            fw.write("O DevDojo e lindo, e o melhor curso do Brasillllllllll\nContinuando na proxima linha\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
