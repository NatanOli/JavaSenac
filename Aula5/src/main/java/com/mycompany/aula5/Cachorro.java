/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;

/**
 *
 * @author Aluno
 */
public class Cachorro extends Animal{
    //atributos - os atributos foram isolados dentro da Class Animal
    //public String NOME;         
    //public int IDADE;           
    //public String ALIMENTACAO;  
    
    //métodos - comportamentos que vão realizar
    @Override
    public void interagir() {
        System.out.println("Cachorro late: Au au");
    }

    @Override
    public String getNOME() {
       return this.NOME;
    }
}
