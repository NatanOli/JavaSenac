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
    private double preco;
    private double imposto;

    public Produto(String nome, double preco, double imposto) {
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getPrecoTotal() {
        //double getPrecoTotal = this.preco + this.imposto;
       // System.out.println(" Preço total do produto: " + getPrecoTotal);
        return this.preco + this.imposto;
        
        //ou 
        //double getPrecoTotal = this.preco + this.imposto;
        //return getPrecoTotal;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Imposto: " + this.imposto);

    }
}
