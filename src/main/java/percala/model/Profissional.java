package percala.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Profissional {
	
	private Long id;
	
	private String nome;
	
	private Long cpf;
	
}
