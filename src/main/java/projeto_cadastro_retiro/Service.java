package projeto_cadastro_retiro;

import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class Service {
    public static void save(String nome, int idade, String telefone){
        if (idade >= 10 && idade <= 18) {
            Repositorio.save(nome, idade, telefone);
        }else {
            System.out.println("Só pessoas com idade entre 10 e 18 anos podem ser cadastradas");
        }
    }
    public static void delete(int id){
        if(id >= 1){
            Repositorio.delete(id);
        }
        else{
            System.out.println("Erro: IDs com número igual ou abaixo de 0 não existem, digite um número positivo.");
        }
    }
    public static void update(int id, String nome, int idade, String telefone){
        if (id >= 1)
            Repositorio.update(id,nome,idade,telefone);
        else{
            System.out.println("Erro: IDs com número igual ou abaixo de 0 não existem, digite um número positivo.");
        }
    }
    public static List<Participante> consultaNome(String name){
        return Repositorio.consultaNome(name);
    }
    public static List<Participante> consultaId(int ident) {
        if (ident < 1) {
            System.out.println("Erro: IDs com número igual ou abaixo de 0 não existem, digite um número positivo.");
        } return Repositorio.consultaId(ident);
    }
    public static List<Participante> consulta(){
        return Repositorio.consulta();
    }
    public static void getMetaDados(){
        Repositorio.getMetaDados();
    }


}

