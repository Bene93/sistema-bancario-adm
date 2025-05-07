/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unincor.sistema.bancario.adm.model.domain;

import java.time.LocalDate;

/**
 *
 * @author Vinicius
 */
public class Cliente extends Pessoa{
    
      private long idCliente;
 
      
      
      public Cliente () {
      }

    public Cliente(long idCliente, String nome, String cpf, LocalDate dataNascimento) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    
    
    
    
}
      
