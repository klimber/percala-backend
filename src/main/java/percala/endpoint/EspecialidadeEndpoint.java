package percala.endpoint;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import percala.model.Especialidade;
import percala.repository.EspecialidadeRepository;

@RestController
public class EspecialidadeEndpoint {

	@Autowired
	private EspecialidadeRepository especialidadeRepository;

	@ApiOperation("Adiciona uma especialidade")
	@PostMapping("/especialidade")
	public Especialidade insereEspecialidade(@RequestBody @Valid Especialidade especialidade) {

		return especialidadeRepository.save(especialidade);

	}
	
	@ApiOperation("Busca uma especialidade pelo id")
	@GetMapping("/especialidade/{id}")
	public Especialidade mostraEspecialidade(@PathVariable("id") Long id) {

		return especialidadeRepository.getOne(id);
		
	}

	@ApiOperation("Busca todas as especialidades")
	@GetMapping("/especialidade")
	public List<Especialidade> buscaEspecialidades() {

		return especialidadeRepository.findAll();

	}
}
