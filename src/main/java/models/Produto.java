package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author brunomonteiro
 */

@Entity
public class Produto implements Serializable {
    
    @Id
    private Long id;
    private String nome;
    private double valor;
    private Tipo tipo;

    public Produto() {
    }

    public Produto(Long id, String nome, Double valor, Tipo tipo) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
