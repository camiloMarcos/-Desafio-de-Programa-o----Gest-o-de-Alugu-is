package fucturaJr.gerenciador_aluguel.controllers;

import fucturaJr.gerenciador_aluguel.dtos.InquilinoDTO;
import fucturaJr.gerenciador_aluguel.models.Inquilino;
import fucturaJr.gerenciador_aluguel.services.InquilinoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inquilinos")
public class InquilinoController {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private InquilinoService inquilinoService;

    @PostMapping()
    public ResponseEntity<InquilinoDTO> save(@RequestBody InquilinoDTO inquilinoDTO) {
       Inquilino inquilino = inquilinoService.save(modelMapper.map(inquilinoDTO, Inquilino.class));
               return ResponseEntity.ok().body(modelMapper.map(inquilino, InquilinoDTO.class));



    }
}
