package percala.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

}
