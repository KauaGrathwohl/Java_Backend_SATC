package org.exercicios.Entrega_06.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransferenciaDto implements Serializable {

    private Long id;
    private BigDecimal valor;
    private LocalDateTime dataTransferencia;
    private String contaOrigem;
    private String nomeBeneficiario;
    private String cpfBeneficiario;
    private String banco;
    private String agencia;
    private String contaDestino;

    public TransferenciaDto() {
        this.id = 1L;
        this.valor = new BigDecimal("123.45");
        this.dataTransferencia = LocalDateTime.now();
        this.contaOrigem = "012345-1";
        this.nomeBeneficiario = "João de Almeida";
        this.cpfBeneficiario = "123.587.968-87";
        this.banco = "Caixa";
        this.agencia = "123";
        this.contaDestino = "541230-2";
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getDataTransferencia() {
        return dataTransferencia;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public String getCpfBeneficiario() {
        return cpfBeneficiario;
    }

    public String getBanco() {
        return banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
