/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula5;

/**
 *
 * @author Aluno
 */
public class Aula5 //Petshop//
{

    public static void main(String[] args) {
        //criação do objeto cachorro
        Cachorro cachorro = new Cachorro();
        cachorro.NOME = "Toby";
        System.out.println("Nome do cachorro: "+ cachorro.NOME);
        //chamando o método interagir do cachorro
        cachorro.interagir();
        
        Gatos gato = new Gatos();
        gato.NOME = "Duda";
        System.out.println("Nome do GATO: "+ gato.NOME);
        gato.interagir();

    }
}
