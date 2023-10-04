/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaprodutolista;

/**
 *
 * @author Aluno
 */
public class Produto {

    private String nome;
    private Double preco;
    private Double imposto;

    public Produto(String nome, Double preco, Double imposto) {
        this.nome = nome;
        this.preco = preco;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getPrecoTotal() {
        //double getPrecoTotal = this.preco + this.imposto;
       // System.out.println(" Preço total do produto: " + getPrecoTotal);
        return this.preco + this.imposto;
        
        //ou 
        //double getPrecoTotal = this.preco + this.imposto;
        //return getPrecoTotal;
    }

    public void exibirInformacoes() {
        System.out.println("Tipo produto: " + this.getClass().getSimpleName());
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Imposto: " + this.imposto);

    }
}
