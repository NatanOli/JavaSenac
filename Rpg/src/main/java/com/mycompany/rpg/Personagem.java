/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

import static java.lang.reflect.Array.get;

/**
 *
 * @author Aluno
 */
public class Personagem {

    private String Nome;
    private double danoAtaque;
    private double Vida;

    public Personagem(String Nome, double danoAtaque, double Vida) {
        this.Nome = Nome;
        this.danoAtaque = danoAtaque;
        this.Vida = Vida;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(double danoAtaque) {
        this.danoAtaque = danoAtaque;
    }

    public double getVida() {
        return Vida;
    }

    public void setVida(double Vida) {
        this.Vida = Vida;
    }

    public void atacar(Personagem atacante) {
        if (this.Vida <= 0) {
            System.out.println("Personagem já está morto, não pode atacar");
        } else {
            // atacante.Vida = atacante.Vida - this.danoAtaque;
            atacante.receberAtaque(danoAtaque);
        }
    }

    public void receberAtaque(double danoDoAtaque) {
        if (this.danoAtaque >= this.Vida) {
        

        }

    }
}