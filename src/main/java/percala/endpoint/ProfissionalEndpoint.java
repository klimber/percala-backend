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
import percala.model.Profissional;
import percala.repository.ProfissionalRepository;

@RestController
public class ProfissionalEndpoint {

	@Autowired
	private ProfissionalRepository profissionalRepository;

	@ApiOperation("Adiciona um Profissional")
	@PostMapping("/profissional")
	public Profissional insereProfissional(@RequestBody @Valid Profissional profissional) {

		profissional.setCpf(profissional.getCpf().replace("[^0-9]", ""));
		return profissionalRepository.save(profissional);

	}
	@ApiOperation("Busca Profissional através do id")
	@GetMapping("/profissional/{id}")
	public Profissional mostraProfissional(@PathVariable("id") Long id) {

		return profissionalRepository.getOne(id);
		
	}

	@ApiOperation("Busca todos os profissionais")
	@GetMapping("/profissional")
	public List<Profissional> buscaProfissionais() {

		return profissionalRepository.findAll();

	}

}
