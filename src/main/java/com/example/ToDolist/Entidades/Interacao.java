package com.example.ToDolist.Entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Interacao {
    @Id
    private int id;
    @Column(nullable = false, unique = true)
    private int idUser;
    @Column
    private String Sugestao;
    @Column
    private Date dataInteracao;

     @ManyToOne
@JoinColumn(name = "historico_tarefa_id")
private HistoricoTarefa historicoTarefa;


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

     public String getSugestao() {
         return Sugestao;
     }

     public void setSugestao(String sugestao) {
         Sugestao = sugestao;
     }

     public Date getDataInteracao() {
         return dataInteracao;
     }

     public void setDataInteracao(Date dataInteracao) {
         this.dataInteracao = dataInteracao;
     }



}
