package fucturaJr.gerenciador_aluguel.dtos;

import fucturaJr.gerenciador_aluguel.models.Aluguel;

public class AluguelDTO {

    private Long id;
    private Double valor;
    private String dataVencimento;

    public AluguelDTO() {}

    public AluguelDTO(Long id, Double valor, String dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public AluguelDTO(Aluguel aluguel) {
        this.id = aluguel.getId();
        this.valor = aluguel.getValor();
        this.dataVencimento = aluguel.getDataVencimento();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
