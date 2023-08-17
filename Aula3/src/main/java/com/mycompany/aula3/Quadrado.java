/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula3;

/**
 *
 * @author Aluno
 */
public class Quadrado extends Forma {

    public int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        this.area = lado * lado;
    }
}
