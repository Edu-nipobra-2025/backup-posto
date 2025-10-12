package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contato")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String telefone;
    private String email;
    private String endereco;

    protected Contato() {}

    public Contato(String telefone, String email, String endereco){
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }
    public Long getId(){
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setId(Long id){
        this.id = id;
    }
}
