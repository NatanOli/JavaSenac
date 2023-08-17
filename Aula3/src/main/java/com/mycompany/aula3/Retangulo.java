/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author Aluno
 */
public class Retangulo extends Forma {

    public int comprimento;
    public int altura;

    public Retangulo(int comprimento, int altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = comprimento * altura;
    }
}
