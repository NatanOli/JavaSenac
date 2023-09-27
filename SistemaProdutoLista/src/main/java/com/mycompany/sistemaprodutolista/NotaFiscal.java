/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaprodutolista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class NotaFiscal {

    private List<Produto> produtos = new ArrayList();
    private Iterable<Produto> calcularValorTotal;
    private Iterable<Produto> exibirProdutos;
    

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public double calcularValorTotal(){
        //for ou arrays
       for (Produto produtos : calcularValorTotal) {
           System.out.println("Valor total da Nota: " + produtos.getPrecoTotal() );
       } 
        return 0;
    }
    public void exibirProdutos(){
        for (Produto produtos : exibirProdutos){
            System.out.println("Nome: " + produtos.getNome() +" \n" + "Preço: " + produtos.getPreco() + "\n" + "Imposto: " + produtos.getImposto());
            System.out.println("");
        }
    }
    public void adicionarProduto(){
        
        
    }

}
