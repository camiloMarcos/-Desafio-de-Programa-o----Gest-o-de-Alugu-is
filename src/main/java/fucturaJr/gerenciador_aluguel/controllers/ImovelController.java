package fucturaJr.gerenciador_aluguel.controllers;

import fucturaJr.gerenciador_aluguel.dtos.ImovelDTO;
import fucturaJr.gerenciador_aluguel.models.Imovel;
import fucturaJr.gerenciador_aluguel.services.ImovelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;
    @Autowired
    private ModelMapper modelMapper;


    @PostMapping
    public ResponseEntity <ImovelDTO> save(@RequestBody ImovelDTO imovelDTO) {
        Imovel novoImovel = imovelService.save(modelMapper.map(imovelDTO, Imovel.class));
        return ResponseEntity.ok().body(modelMapper.map(novoImovel, ImovelDTO.class));
    }

}



