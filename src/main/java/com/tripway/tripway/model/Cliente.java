package com.tripway.tripway.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity // Indica que esta classe é uma entidade JPA e será mapeada para uma tabela no banco
@Table(name = "clientes") // Especifica o nome da tabela no banco de dados

public class Cliente {

        @Id // Indica que este campo é a chave primária
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura a geração automática de IDs pelo banco (AUTO_INCREMENT no MySQL)
        private Long idCliente;

        @Column(nullable = false) // Indica que a coluna não pode ser nula
        private String nome;

        @Column(nullable = false)
        private String sobrenome;

        @Column(nullable = false, unique = true, length = 14) // Unique para CPF
        private String cpf;

        @Column(length = 20)
        private String telefone;

        @Column(unique = true)
        private String email;

        @Column(columnDefinition = "TEXT") // Define o tipo de coluna como TEXT no banco
        private String endereco;

        @Column(name = "data_cadastro")
        private LocalDateTime dataCadastro;

        // Construtor padrão (necessário para JPA)
        public Cliente() {
        }

        // Construtor com todos os campos (exceto id e data_cadastro, que são gerados)
        public Cliente(String nome, String sobrenome, String cpf, String telefone, String email, String endereco) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.email = email;
            this.endereco = endereco;
            this.dataCadastro = LocalDateTime.now(); // Define a data de cadastro ao criar o objeto
        }

        // Getters e Setters (muito importantes para JPA e para acessar os dados)
        public Long getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(Long idCliente) {
            this.idCliente = idCliente;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public LocalDateTime getDataCadastro() {
            return dataCadastro;
        }

        public void setDataCadastro(LocalDateTime dataCadastro) {
            this.dataCadastro = dataCadastro;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "idCliente=" + idCliente +
                    ", nome='" + nome + '\'' +
                    ", sobrenome='" + sobrenome + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", email='" + email + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", dataCadastro=" + dataCadastro +
                    '}';
        }
    }
