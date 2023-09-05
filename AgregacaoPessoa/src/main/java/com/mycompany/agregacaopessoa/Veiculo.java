/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agregacaopessoa;

/**
 *
 * @author Aluno
 */
public class Veiculo {

    private String marca;
    private String nome;

    public Veiculo(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Marca: " + this.marca);
    }

}
