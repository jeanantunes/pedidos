package br.com.spring.examples.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Jean Antunes on 23/03/17.
 */

@Entity
public class Fornecedor {

    @Id
    private Integer id;

    private String cnpj;

    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
