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
public class Animal {

    //atributo
    public String nome;
    public int idade;
    public String ALIMENTACAO;
    
    public Animal(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
        
    }
    

    //metodo -todos metodos na classe mãe vai ser necessário nas filhas.
    public void interagir() {
    }
    public String getNOME(){
        return null;
    }
    
   }

