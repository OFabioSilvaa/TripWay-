package com.tripway.tripway.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pacotes_viagem")

public class PacoteViagem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idPacote;

        @Column(nullable = false)
        private String nomePacote;

        @Column(columnDefinition = "TEXT")
        private String descricao;

        @Column(name = "preco_total", precision = 10, scale = 2)
        private BigDecimal precoTotal;

        @Column(name = "data_partida")
        private LocalDate dataPartida;

        @Column(name = "data_retorno")
        private LocalDate dataRetorno;

        @Column(name = "id_destino_principal")
        private Long idDestinoPrincipal; // Por enquanto, apenas um ID de destino

        @Column(name = "status_pacote", length = 50)
        private String statusPacote;

        // Construtor padrão
        public PacoteViagem() {
            this.statusPacote = "Disponível";
        }

        // Construtor com campos
        public PacoteViagem(String nomePacote, String descricao, BigDecimal precoTotal, LocalDate dataPartida, LocalDate dataRetorno, Long idDestinoPrincipal) {
            this.nomePacote = nomePacote;
            this.descricao = descricao;
            this.precoTotal = precoTotal;
            this.dataPartida = dataPartida;
            this.dataRetorno = dataRetorno;
            this.idDestinoPrincipal = idDestinoPrincipal;
            this.statusPacote = "Disponível";
        }

        // Getters e Setters
        public Long getIdPacote() {
            return idPacote;
        }

        public void setIdPacote(Long idPacote) {
            this.idPacote = idPacote;
        }

        public String getNomePacote() {
            return nomePacote;
        }

        public void setNomePacote(String nomePacote) {
            this.nomePacote = nomePacote;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public BigDecimal getPrecoTotal() {
            return precoTotal;
        }

        public void setPrecoTotal(BigDecimal precoTotal) {
            this.precoTotal = precoTotal;
        }

        public LocalDate getDataPartida() {
            return dataPartida;
        }

        public void setDataPartida(LocalDate dataPartida) {
            this.dataPartida = dataPartida;
        }

        public LocalDate getDataRetorno() {
            return dataRetorno;
        }

        public void setDataRetorno(LocalDate dataRetorno) {
        }

        public Long getIdDestinoPrincipal() {
            return idDestinoPrincipal;
        }

        public void setIdDestinoPrincipal(Long idDestinoPrincipal) {
            this.idDestinoPrincipal = idDestinoPrincipal;
        }

        public String getStatusPacote() {
            return statusPacote;
        }

        public void setStatusPacote(String statusPacote) {
            this.statusPacote = statusPacote;
        }

        @Override
        public String toString() {
            return "PacoteViagem{" +
                    "idPacote=" + idPacote +
                    ", nomePacote='" + nomePacote + '\'' +
                    ", descricao='" + descricao + '\'' +
                    ", precoTotal=" + precoTotal +
                    ", dataPartida=" + dataPartida +
                    ", dataRetorno=" + dataRetorno +
                    ", idDestinoPrincipal=" + idDestinoPrincipal +
                    ", statusPacote='" + statusPacote + '\'' +
                    '}';
        }
    }
