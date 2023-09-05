/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.agregacaopessoa;

/**
 *
 * @author Aluno
 */
public class AgregacaoPessoa {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Junior", 6, "Pinscher");
        cachorro.imprimirInformacoes();
        Gato gato = new Gato("Dobby", 1,"Sphynx");
        gato.imprimirInformacoes();

        Carro carro = new Carro("Honda", "Fit");
        carro.imprimirInformacoes();
        Moto moto = new Moto("Honda", "CG");
        moto.imprimirInformacoes();

        Pessoa pessoa = new Pessoa("Guilherme", 24);
        pessoa.setCachorro(cachorro);
        pessoa.setGato(gato);
        pessoa.setCarro(carro);
        pessoa.setMoto(moto);

        pessoa.imprimirInformacoesPessoais();
        pessoa.imprimirPets();
        pessoa.imprimirVeiculos();
    }
}
