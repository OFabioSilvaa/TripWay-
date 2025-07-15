package com.tripway.tripway.model;

import jakarta.persistence.*;

@Entity
@Table(name = "destinos")
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDestino;

    @Column(name = "nome_cidade", nullable = false)
    private String nomeCidade;

    @Column(name = "nome_pais", nullable = false)
    private String nomePais;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    public Destino() {
    }

    public Destino(String nomeCidade, String nomePais, String descricao) {
        this.nomeCidade = nomeCidade;
        this.nomePais = nomePais;
        this.descricao = descricao;
    }

    public Long getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(Long idDestino) {
        this.idDestino = idDestino;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Destino{" +
                "idDestino=" + idDestino +
                ", nomeCidade='" + nomeCidade + '\'' +
                ", nomePais='" + nomePais + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}