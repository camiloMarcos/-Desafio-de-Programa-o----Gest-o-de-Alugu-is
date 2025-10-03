package fucturaJr.gerenciador_aluguel.services;

import fucturaJr.gerenciador_aluguel.models.Imovel;
import fucturaJr.gerenciador_aluguel.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public Imovel save(Imovel imovel) {
        imovel.setId(null);
        return imovelRepository.save(imovel);


    }
}
