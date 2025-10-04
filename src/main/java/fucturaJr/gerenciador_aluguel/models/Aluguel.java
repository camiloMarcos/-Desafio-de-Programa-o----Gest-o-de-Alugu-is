package fucturaJr.gerenciador_aluguel.models;

import jakarta.persistence.*;

@Entity
@Table(name = "alugueis")
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valor;
    private String dataVencimento;
//  private bollean status; // pago, pendente, atrasado

//  private Long idImovel;
//  private Long idInquilino;

    public Aluguel() {}

    public Aluguel(Double valor, String dataVencimento) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
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
