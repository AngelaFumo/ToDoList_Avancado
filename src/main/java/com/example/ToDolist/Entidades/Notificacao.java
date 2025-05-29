package com.example.ToDolist.Entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Notificacao {
    @Id
    private int id;
   @ManyToOne
    @JoinColumn(name = "idUser_fk")
    private Usuario usuario;
    @Column(nullable = false)
    private int idTarefa;
    @Column
    private String mensagem;
    @Column
    private Date dataEnvio;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdTarefa() {
        return idTarefa;
    }
    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public Date getDataEnvio() {
        return dataEnvio;
    }
    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
    
}
