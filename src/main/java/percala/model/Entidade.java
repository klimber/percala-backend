package percala.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@MappedSuperclass
@Data
public class Entidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@ApiModelProperty(hidden=true)
	private Long id;

}
