/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.sistema.bancario.adm.model.domain;

/**
 *
 * @author Vinicius
 */
public class Agencia {
    
    private Long idAgencia;
    private String codigoAgencia;
    private String cidade;
    private  String logradouro;
    private String numero;
    private String cep;
    
    public Agencia() {
        
    }

    public void setIdAgencia(Long idAgencia) {
        this.idAgencia = idAgencia;
    }

    public void setCodigoAgencia(String codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getIdAgencia() {
        return idAgencia;
    }

    public String getCodigoAgencia() {
        return codigoAgencia;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }
    
    
}
