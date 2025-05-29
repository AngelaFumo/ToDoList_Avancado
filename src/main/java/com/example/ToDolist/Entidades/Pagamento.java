package com.example.ToDolist.Entidades;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pagamento {
    @Id
    private int id;
    @Column(nullable = false, unique = true)
    private int idUser;
    @Column(nullable = false)
    private BigDecimal valor;
    @Column(nullable = false)
    private MPagamento metodo;
    @Column(nullable = false)
    private Date dataPagamento;

    @ManyToOne
    @JoinColumn(name= "pagamento_fk")
    private Usuario usuario;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public MPagamento getMetodo() {
        return metodo;
    }
    public void setMetodo(MPagamento metodo) {
        this.metodo = metodo;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
}
