package fucturaJr.gerenciador_aluguel.models;

import jakarta.persistence.*;
import org.springframework.aot.generate.GeneratedTypeReference;

@Entity
@Table
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;   //obrigatório
    private String endereco;    //não é obrigatório
    private double valorAluguel;
    private boolean aluguelPago;

    public Imovel() {
    }

    public Imovel(Integer id, String descricao, String endereco,
                  double valorAluguel, boolean aluguelPago) {
        this.id = id;
        this.descricao = descricao;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.aluguelPago = aluguelPago;
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