package com.mycompany.aula5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Ave extends Animal{
    public String corDasAsas;
    public int tamanhoDoBico;
    
    public Ave(String nome,int idade, int tamanhoDoBico, String corDaAsas ){
        super (nome = "dada",idade);
        
        this.tamanhoDoBico = tamanhoDoBico;
        this.corDasAsas = corDaAsas;
        
    }
        

    @Override
    public void interagir() {
        System.out.println("co co");
    }

    public String getNOME() {
        return null;
    }
    
}
