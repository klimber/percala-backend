package percala.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import percala.model.Profissional;
import percala.repository.ProfissionalRepository;

@RestController
public class ProfissionalEndpoint {

	@Autowired
	private ProfissionalRepository ProfissionalRepository;

	@PostMapping("/profissional")
	public Profissional insereProfissional(@RequestParam("nome") String nome, @RequestParam("cpf") Long cpf) {

		return ProfissionalRepository.save(new Profissional(nome, cpf));

	}
	
	@GetMapping("/profissional/{id}")
	public Profissional mostraProfissional(@RequestParam("id") Long id) {
		
		return ProfissionalRepository.getOne(id);
	}

}
