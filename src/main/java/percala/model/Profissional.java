package percala.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class Profissional extends Entidade {
	
	private String nome;
	
	private Long cpf;
	
}
