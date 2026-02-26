package maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    static void main(String[] args) {
        System.out.println(abreConexao());;
    }
    private static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechando recurso liberado pela SO.");
        }
        return null;
    }
}
