package fucturaJr.gerenciador_aluguel.services;

import fucturaJr.gerenciador_aluguel.controllers.InquilinoController;
import fucturaJr.gerenciador_aluguel.models.Inquilino;
import fucturaJr.gerenciador_aluguel.repositories.InquilinoRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquilinoService {

    @Autowired
    private InquilinoRepository inquilinoRepository;


    public Inquilino save(Inquilino inquilino) {
        return inquilinoRepository.save(inquilino);

}

}
