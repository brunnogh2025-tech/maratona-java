package projeto_cadastro_retiro;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    static void main(String[] args) {
        //Service.save("Marcelo",11,"(18) 95055-1234");
        //Service.delete(1);
        //Service.update(2,"Diogo",11,"(18) 98555-4400");
        //System.out.println(Service.consultaNome("Marcelo"));
        //Repositorio.getMetaDados();
        System.out.println(Service.consultaId(2));
        System.out.println(Service.consulta());
    }
}
