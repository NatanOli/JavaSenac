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

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double calcularValorTotal() {
        //for ou arrays
        double precoTotal = 0;
        for (Produto produto : this.produtos) {
            precoTotal += produto.getPrecoTotal();
            //+= é pega o valor que já está nele "precoTotal" e já duplica para o calculo
        }
        return precoTotal;
    }

    public void exibirProdutos() {
        for (Produto produto : this.produtos) {
            produto.exibirInformacoes();
            System.out.println("");
        }
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);

    }

    public void removerProdutoPorNome(String nome) {
        //produtos.remove(1);
        this.produtos.removeIf(prod -> prod.getNome() == nome);
    }
//    }for (int i = 0; i < this.produtos.size(); i++) {
//           if (this.produtos.get(i).getNome() == nome) {
//                this.produtos.equals(this.produtos.get(i));

    public Produto getProdutoPorNome(String nome) {
        for (Produto produto : this.produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public boolean possuiProdutoPorNome(String nome) {
        for (Produto produto : this.produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
            return false;
    }
    public 
}
        

