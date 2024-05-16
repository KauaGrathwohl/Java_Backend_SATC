package org.exercicios.Entrega_06.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class UsuarioDto implements Serializable {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String tipoConta;
    private String senha;

    public UsuarioDto() {
        this.nome = "Rafael";
        this.cpf = "012.345.789-98";
        this.dataNascimento = LocalDate.parse("1995-10-15");
        this.email = "rafael@email.com";
        this.tipoConta = "Pessoa fisica";
        this.senha = "123456";
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
