package fucturaJr.gerenciador_aluguel.repositories;

import fucturaJr.gerenciador_aluguel.models.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository <Imovel, Integer> {
}
