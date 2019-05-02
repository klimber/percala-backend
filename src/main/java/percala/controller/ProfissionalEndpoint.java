package percala.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import percala.model.Profissional;

@RestController
public class ProfissionalEndpoint {
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/profissional")
	public Profissional insereProfissional(@RequestParam(value="nome", defaultValue="João") String nome, @RequestParam(value="cpf", defaultValue="00000000000") Long cpf) {
		return new Profissional(counter.incrementAndGet(), nome, cpf);
	}

}
