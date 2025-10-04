package fucturaJr.gerenciador_aluguel.dtos;

import fucturaJr.gerenciador_aluguel.models.Inquilino;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class InquilinoDTO {

    @Autowired
    private ModelMapper modelMapper;

    private Integer id;
    private String nome;    //---------------> OBRIGATÓRIO
    private String email;   //--------------->  NAO OBRIGATÓRIO

    public InquilinoDTO() {}

    public InquilinoDTO(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public InquilinoDTO (Inquilino inquilino){
        this.id = inquilino.getId();
        this.nome = inquilino.getNome();
        this.email = inquilino.getEmail();
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
