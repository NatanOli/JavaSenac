/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula4;

/**
 *
 * @author Aluno
 */
public class Cachorro {

    public int tamanho;

    public Cachorro(int tamanho) {
        this.tamanho = tamanho;
    }

    public void latir() { //metodo void não vai retornar nada
        if (this.tamanho > 70) {
            System.out.println("woof woof!");
        } else if (this.tamanho > 8) {
            System.out.println("Ruff ruff1");
        } else {
            System.out.println("Yip Yip!");
        }
    }

    public int pegarTamanho() {
        return this.tamanho;
    }
}
