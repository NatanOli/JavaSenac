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
//        Cachorro cachorro = new Cachorro("Toby", 10);
//        System.out.println("Nome do cachorro: "+ cachorro.nome + "\n" + "idade do dog: " + cachorro.idade);
//        //chamando o método interagir do cachorro
//        cachorro.interagir();
//        
//        Gatos gato = new Gatos("", 3);
//        System.out.println("Nome do GATO: "+ gato.nome);
//        gato.interagir();
//        
        Ave ave = new Ave ("", 2, 15,"amarela");
        System.out.println ("nome da Ave: " + ave.nome + "\n" +"idade: " +ave.idade + "\n" + "Tamanho do Bico: " + ave.tamanhoDoBico + "\n" + "Cor das Asas: " +ave.corDasAsas);
        ave.interagir();
    }
}
