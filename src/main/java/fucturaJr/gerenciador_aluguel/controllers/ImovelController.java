package fucturaJr.gerenciador_aluguel.controllers;

import fucturaJr.gerenciador_aluguel.models.Imovel;
import fucturaJr.gerenciador_aluguel.services.ImovelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;
    @Autowired
    private ModelMapper modelMapper;


    @PostMapping("/save")
    public Imovel save(@RequestParam Integer id, @RequestBody Imovel imovel) {
        Imovel novoImovel = imovelService.save(id, imovel);
        return novoImovel;
    }

}



