package maratonajava.javacore.ZZEinjecaodedependencias.test;

import java.util.List;

public class InjecaoDeDependenciascomLambda {
    static void main(String[] args) {
        new MigracaoUsuario2(new FileRead2(), new BdWriter2()).migrar();
    }
}

class MigracaoUsuario2{
    //Injecao de dependencias significa que uma classe depende de outras para que seus metodos ou atributos funcionem
    FileRead2 reader;
    BdWriter2 writer;

    public MigracaoUsuario2(FileRead2 reader, BdWriter2 writer) {
        this.reader = reader;
        this.writer = writer;
    }

    void migrar(){
        //Ler usuarios de A
        List<User2> users = reader.reader(() -> List.of(new User2("email","Username","password")));
        //Escrever usuarios em B
        writer.writer(users,(List<User2> list) -> System.out.println(list));


    }
}
record User2(String email, String username, String password){

}
@FunctionalInterface
interface Reader2<T>{
    abstract List<T> read();
}
@FunctionalInterface
interface Writer2<T>{
    abstract void write(List<T> itens);
}
class FileRead2<R>{
    public List<R> reader(Reader2<User2> reader) {
        System.out.println("Lendo usuários...");
        List<R> result = (List<R>) reader.read();
        return result;
    }
}
class BdWriter2{
    public void writer(List<User2> users, Writer2<User2> writer){
        System.out.println("Escrevendo usuarios no banco");
        writer.write(users);
    }
}
