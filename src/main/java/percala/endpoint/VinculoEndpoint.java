package percala.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import percala.model.Vinculo;
import percala.repository.VinculoRepository;

@RestController
public class VinculoEndpoint {

	@Autowired
	private VinculoRepository vinculoRepository;

	@ApiOperation("Adiciona um vínculo")
	@PostMapping("/vinculo")
	public Vinculo insereVinculo(@RequestParam("matricula") Long matricula,
			@RequestParam("profissionalId") Long profissionalId, @RequestParam("especialidadeId") Long especialidadeId,
			@RequestParam("cargaHoraria") Long cargaHoraria) {
		return vinculoRepository.save(new Vinculo(matricula, profissionalId, especialidadeId, cargaHoraria));
	}
	
	@ApiOperation("Busca um vinculo pela matrícula")
	@GetMapping("/vinculo/{matricula}")
	public Vinculo mostraVinculo(@PathVariable("matricula") Long matricula) {
		
		return vinculoRepository.getOne(matricula);
		
	}

	@ApiOperation("Busca todos os vínculos")
	@GetMapping("/vinculo")
	public List<Vinculo> buscaVinculos() {

		return vinculoRepository.findAll();

	}

}
