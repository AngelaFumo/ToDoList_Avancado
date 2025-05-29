package com.example.ToDolist.Entidades;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Permissoes {
    @Id
    private int id;
    @Column(nullable = false)
    private int limite_tarefa;
    @OneToOne(cascade = jakarta.persistence.CascadeType.ALL)
    @JoinColumn(name = "idUser_fk")
    private Usuario idUser;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
    public int getLimite_tarefa() {
        return limite_tarefa;
    }
    public void setLimite_tarefa(int limite_tarefa) {
        this.limite_tarefa = limite_tarefa;
    }
    public Usuario getIdUser() {
        return idUser;
    }
    public void setIdUser(Usuario idUser) {
        this.idUser = idUser;
    }
    
}
