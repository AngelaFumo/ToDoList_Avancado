package com.example.ToDolist.Entidades;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Usuario {
    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "idUser")
    private Permissoes idPermissoes;

    @ManyToMany
    @JoinTable(
        name = "usuario_tarefa",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "tarefa_id")
    )
     private List<Tarefas> tarefas; 

    @Column(nullable = false, length = 60)
    private String nome;
    @Column( nullable = false)
    private String senha;
    @Column( nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private TipoUser tipo;
    @Column(nullable = false)
    private Date data_criacao;

    @OneToMany(mappedBy = "usuario")  // nome do atributo da outra classe
private List<Notificacao> notificacao;


    @OneToMany(mappedBy = "usuario")
    private List<Pagamento> produtos;

    @OneToMany(mappedBy="usuario")
    private List <Pagamento> pagamento_fk;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "notificacao_id")
    private Permissoes permissao;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public TipoUser getTipo() {
        return tipo;
    }
    public void setTipo(TipoUser tipo) {
        this.tipo = tipo;
    }
    public Date getData_criacao() {
        return data_criacao;
    }
    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }
   

}
