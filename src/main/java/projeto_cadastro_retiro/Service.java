package projeto_cadastro_retiro;

import java.util.List;

public class Service {
    public static void save(String nome, int idade, String telefone){
        Repositorio.save(nome,idade,telefone);
    }
    public static void delete(int id){
        Repositorio.delete(id);
    }
    public static void update(int id, String nome, int idade, String telefone){
        Repositorio.update(id,nome,idade,telefone);
    }
    public static List<Participante> consulta(){
        return Repositorio.consulta();
    }
}
