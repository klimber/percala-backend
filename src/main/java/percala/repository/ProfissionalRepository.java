package percala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import percala.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
	
	boolean existsByCpf(String cpf);

}
