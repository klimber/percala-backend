package percala.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Especialidade insereEspecialidade(@RequestParam("especialidade") String especialidade) {

		return especialidadeRepository.save(new Especialidade(especialidade));

	}

	@ApiOperation("Busca todas as especialidades")
	@GetMapping("/especialidade")
	public List<Especialidade> buscaEspecialidades() {

		return especialidadeRepository.findAll();

	}
}
