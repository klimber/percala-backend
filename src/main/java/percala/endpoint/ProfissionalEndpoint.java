package percala.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Profissional insereProfissional(@RequestParam("nome") String nome, @RequestParam("cpf") String cpf) {

		return profissionalRepository.save(new Profissional(nome, cpf));

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
