package fucturaJr.gerenciador_aluguel.repositories;

import fucturaJr.gerenciador_aluguel.models.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
}
