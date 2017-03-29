package br.com.spring.examples.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Jean Antunes on 23/03/17.
 */
@Entity
public class Precos {

    @Id
    private Integer id;

    private String cnpj;

    private Double preco;

    private Integer quantidade_minima;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade_minima() {
        return quantidade_minima;
    }

    public void setQuantidade_minima(Integer quantidade_minima) {
        this.quantidade_minima = quantidade_minima;
    }
}
