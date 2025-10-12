package com.br.pdvpostocombustivel.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Preco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private BigDecimal valor;

    private LocalDate dataAlteracao;

    private LocalTime horaAlteracao;

    protected Preco() {}

    public Preco(BigDecimal valor, LocalDate dataAlteracao, LocalTime horaAlteracao) {
        this.valor = valor;
        this.dataAlteracao = dataAlteracao;
        this.horaAlteracao = horaAlteracao;
    }

    // getters
    public BigDecimal getValor(){
        return valor;
    }
    public LocalDate getDataAlteracao(){
        return dataAlteracao;
    }

    public LocalTime getHoraAlteracao(){
        return horaAlteracao;
    }
    public Long getId(){
        return id;
    }

    // setters
    public void setValor (BigDecimal valor){
        this.valor = valor;
    }
    public void setDataAlteracao (LocalDate dataAlteracao){
        this.dataAlteracao = dataAlteracao;
    }
    public void setHoraAlteracao (LocalTime horaAlteracao){
        this.horaAlteracao = horaAlteracao;
    }
    public void setId(Long id){
        this.id = id;
    }
}
