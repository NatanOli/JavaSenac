/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aula3;

/**
 *
 * @author Aluno
 */
public class Aula3 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(13.65);
        circulo.calcularArea();

        Retangulo retangulo = new Retangulo(10, 5);
        retangulo.calcularArea();

        Quadrado quadrado = new Quadrado(15);
        quadrado.calcularArea();

        System.out.println("A area do Circulo é: " + circulo.area);
        System.out.println("A area do Retangulo é: " + retangulo.area);
        System.out.println("A area do Quadrado é: " + quadrado.area);

    }
}
