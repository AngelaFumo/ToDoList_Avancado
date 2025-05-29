package com.example.ToDolist.Entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Tarefas {
@Id   
private int id;

@ManyToMany(mappedBy = "tarefas")
private List<Usuario> usuarios;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "historico_id")  // Nome mais simples para a FK
private HistoricoTarefa historicoTarefa;
@Column
private String titulo;
@Column
private String categoria;
@Column
private Date dataDisparo;
@Column
private Estado estado;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getCategoria() {
    return categoria;
}
public void setCategoria(String categoria) {
    this.categoria = categoria;
}
public Date getDataDisparo() {
    return dataDisparo;
}
public void setDataDisparo(Date dataDisparo) {
    this.dataDisparo = dataDisparo;
}
public Estado getEstado() {
    return estado;
}
public void setEstado(Estado estado) {
    this.estado = estado;
}
}
