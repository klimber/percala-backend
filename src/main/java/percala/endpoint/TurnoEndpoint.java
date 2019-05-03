package percala.endpoint;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import percala.model.Turno;
import percala.repository.TurnoRepository;

@RestController
public class TurnoEndpoint {

	@Autowired
	private TurnoRepository turnoRepository;

	@PostMapping("/turno")
	@ApiOperation("Adiciona um turno na escala")
	public Turno insereTurno(@RequestBody @Valid Turno turno) {

		return turnoRepository.save(turno);

	}
	
	@GetMapping("/turno")
	@ApiOperation("Retorna a lista de turnos")
	public List<Turno> buscaTurnos(){

		return turnoRepository.findAll();
				
	}

}
