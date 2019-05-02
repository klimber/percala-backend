package percala.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
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
public class Vinculo {
	
	@Id
	@NotNull
	@ApiModelProperty(name="Matrícula do Profissional", required=true)
	@Column(unique=true)
	private Long matricula;
	
	@NotNull
	@ApiModelProperty(name="ID do profissional deste vínculo", required=true)
	private Long profissionalId;
	
	@NotNull
	@ApiModelProperty(name="ID da especialidade do vínculo", required=true)
	private Long especialidadeId;
	
	@NotNull
	@ApiModelProperty(name="Carga Horária neste vínculo", required=true)
	private Long cargaHoraria;
}
