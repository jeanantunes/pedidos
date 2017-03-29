package br.com.spring.examples.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Jean Antunes on 28/03/17.
 */
@Entity
public class Produto {

    @Id
    private String gtin;

    private String nome;

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
