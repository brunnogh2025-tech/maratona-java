package maratonajava.javacore.ZZEinjecaodedependencias.test;

import java.io.FileReader;
import java.util.List;

public class AulaoInjecaoDeDependenciasApplication {
    static void main(String[] args) {
        new MigracaoUsuario(new FileRead(), new BdWriter()).migrar();
    }
}

class MigracaoUsuario{
    //Injecao de dependencias significa que uma classe depende de outras para que seus metodos ou atributos funcionem
    Reader<User> reader;
    Writer<User> writer;

    public MigracaoUsuario(Reader<User> reader, Writer<User> writer) {
        this.reader = reader;
        this.writer = writer;
    }

    void migrar(){
        //Ler usuarios de A
        List<User> users = reader.read();
        //Escrever usuarios em B
        writer.write(users);


    }
}
record User(String email, String username, String password){

}
interface Reader<T>{
    List<T> read();
}
interface Writer<T>{
    void write(List<T> itens);
}
class FileRead implements Reader<User> {
    public List<User> read() {
        System.out.println("Lendo usuarios do arquivo...");
        return List.of(new User("email","username","password"));
    }
}
class BdWriter implements Writer<User>{
    public void write(List<User> users){
        System.out.println("Escrevendo usuarios no banco");
        System.out.println(users);
    }
}