package fucturaJr.gerenciador_aluguel.dtos;

import fucturaJr.gerenciador_aluguel.models.Imovel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ImovelDTO {

    @Autowired
    private ModelMapper modelMapper;

    private Integer id;
    private String descricao;   //--------------->  obrigatório
    private String endereco;    //--------------->  não é obrigatório
    private double valorAluguel;
    private boolean aluguelPago;

    public ImovelDTO() {}

    public ImovelDTO(Integer id, String descricao, String endereco,
                     double valorAluguel, boolean aluguelPago) {
        this.id = id;
        this.descricao = descricao;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.aluguelPago = aluguelPago;
    }

    public ImovelDTO(Imovel imovel) {
        this.id = imovel.getId();
        this.descricao = imovel.getDescricao();
        this.endereco = imovel.getEndereco();
        this.valorAluguel = imovel.getValorAluguel();
        this.aluguelPago = imovel.isAluguelPago();
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public boolean isAluguelPago() {
        return aluguelPago;
    }
    public void setAluguelPago(boolean aluguelPago) {
        this.aluguelPago = aluguelPago;
    }
}
