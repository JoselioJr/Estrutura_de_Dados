/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.josephus;

/**
 *
 * @author joseliojr
 */
public class Dados {
    int numero;
    String nome;
    String telefone;
    String endereco;
    String cpf;
    
    Dados(int numero, String nome, String telefone, String endereco, String cpf){
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getCpf(){
        return cpf;
    }
}
