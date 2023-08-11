/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula4;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    public final String NOME; //constantes dentro da classe
    public final int IDADE; 
    public final String ESPECIE_RACA = "Humana"; 
    //public = todas as outras classes podem acessar esse atributo
    //private = somente a própria classe pode acessar
    public String cursoAtual;
    
    public Pessoa (String nome, int idade) { //CONSTRUTOR DA CLASSE
        this.NOME = nome;
        this.IDADE = idade;
    }
    
}
