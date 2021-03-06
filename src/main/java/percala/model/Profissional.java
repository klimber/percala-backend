package percala.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Profissional extends Entidade {
	
	@NotNull
	@Length(min=2, max = 100)
	@ApiModelProperty(name="Nome do profissional", required=true)
	private String nome;
	
	@NotNull
	@CPF
	@Column(unique=true)
	@ApiModelProperty(name="CPF do profissional", required=true)
	private String cpf;
	
}
