package fucturaJr.gerenciador_aluguel.controllers;

import fucturaJr.gerenciador_aluguel.dtos.AluguelDTO;
import fucturaJr.gerenciador_aluguel.models.Aluguel;
import fucturaJr.gerenciador_aluguel.services.AluguelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {

    @Autowired
    private AluguelService aluguelService;
    @Autowired
    private ModelMapper modelMapper;


    @PostMapping
    public ResponseEntity<AluguelDTO> save(@RequestBody AluguelDTO aluguelDTO){
        Aluguel aluguel= aluguelService.save(modelMapper.map(aluguelDTO, Aluguel.class));
        return ResponseEntity.ok().body(modelMapper.map(aluguel, AluguelDTO.class));
    }


}
