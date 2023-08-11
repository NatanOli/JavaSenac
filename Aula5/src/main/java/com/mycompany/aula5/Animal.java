/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula5;

/**
 *
 * @author Aluno
 */
    //Classe abstract vai ser apenas de modelos para as classes FILHAS, já que ANIMAL é genérico.
public abstract class Animal {
    //atributo
    public String NOME;         
    public int IDADE;           
    public String ALIMENTACAO;
    
    //metodo -todos metodos na classe mãe vai ser necessário nas filhas.
    public abstract void interagir();
    public abstract String getNOME();
    
   
}
