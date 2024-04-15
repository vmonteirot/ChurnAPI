package com.challenge.churn.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String setor;
    @Column
    private int tamanho;
    @Column
    private String localizacao;
    @Column
    private Date dataContrato;
    @Column
    private double valorContrato;
    @Column
    private int interacoes;
    @Column
    private boolean statusChurn;

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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public int getInteracoes() {
        return interacoes;
    }

    public void setInteracoes(int interacoes) {
        this.interacoes = interacoes;
    }

    public boolean isStatusChurn() {
        return statusChurn;
    }

    public void setStatusChurn(boolean statusChurn) {
        this.statusChurn = statusChurn;
    }
}
