package percala.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;

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
public class Turno extends Entidade{
	
	@NotNull
	@ApiModelProperty(name="Matrícula do profissional escalado", required=true)
	private Long matricula;
	
	@NotNull
	@ApiModelProperty(name="Data e horário de início do turno", required=true)
	private LocalDateTime inicio;
	
	@NotNull
	@ApiModelProperty(name="Duração do turno", required=true)
	private LocalDateTime duracao;

}
