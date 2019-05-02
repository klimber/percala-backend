package percala.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import percala.model.Profissional;

@RestController
public class ProfissionalEndpoint {
	
	@RequestMapping("/profissional")
	public Profissional insereProfissional(@RequestParam(value="nome", defaultValue="João") String nome, @RequestParam(value="cpf", defaultValue="00000000000") Long cpf) {
		return new Profissional(nome, cpf);
	}

}
