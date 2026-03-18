package projeto_cadastro_retiro;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Participante {
    private int id;
    private String nome;
    private int idade;

}
