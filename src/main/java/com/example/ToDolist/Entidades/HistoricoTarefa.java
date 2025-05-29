package com.example.ToDolist.Entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class HistoricoTarefa {
    @Id
    private int id;
    @Column(nullable = false, unique = true)
    private int idTarefa;
    @Column
    private Date dataModificacao;

   @OneToOne
   @JoinColumn(name = "tarefa_id")  // Esta será a FK na tabela HistoricoTarefa
    private Tarefas tarefa;

    @OneToMany(mappedBy = "historicoTarefa")
private List <Interacao> interacoes;

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
    public Date getDataModificacao() {
        return dataModificacao;
    }
    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
    
}
