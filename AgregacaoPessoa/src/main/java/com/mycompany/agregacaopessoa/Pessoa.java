/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agregacaopessoa;

/**
 *
 * @author Aluno
 */
public class Pessoa {

    private String nome;
    private int idade;
    private Cachorro cachorro;
    private Gato gato;
    private Carro carro;
    private Moto moto;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public void imprimirInformacoesPessoais() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public void imprimirPets() {
        System.out.println("Cachorro:");
        this.cachorro.imprimirInformacoes();
        System.out.println("");
        System.out.println("Gato:");
        this.gato.imprimirInformacoes();
    }

    public void imprimirVeiculos() {
        System.out.println("Carro:");
        this.carro.imprimirInformacoes();
        System.out.println("");
        System.out.println("Moto");
        this.moto.imprimirInformacoes();
    }
}
