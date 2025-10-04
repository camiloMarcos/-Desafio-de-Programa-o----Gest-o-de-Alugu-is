package fucturaJr.gerenciador_aluguel.services;

import fucturaJr.gerenciador_aluguel.models.Aluguel;
import fucturaJr.gerenciador_aluguel.repositories.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    public Aluguel save (Aluguel aluguel) {
       // Lógica para criar um aluguel
        return aluguelRepository.save(aluguel);
    }
}
