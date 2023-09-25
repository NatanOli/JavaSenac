/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author Natan
 */
public class Personagem {

    private String Nome;
    private double danoAtaque;
    private double Vida;
    private final double VIDA_MINIMA = 0;

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

    public void atacar(Personagem vitima) {
        if (this.Vida <= VIDA_MINIMA) {
            System.out.println("Personagem" +this.Nome + " já está morto, não pode atacar");
        } else {
            // atacante.Vida = atacante.Vida - this.danoAtaque;
            vitima.receberAtaque(this);
        }
    }

    public void receberAtaque(Personagem atacante) {
        double vidaFinal = this.Vida - atacante.danoAtaque;
        if (vidaFinal < VIDA_MINIMA) {
            this.Vida = VIDA_MINIMA;
        }else{
            this.Vida = vidaFinal;
        

        }

    }
}