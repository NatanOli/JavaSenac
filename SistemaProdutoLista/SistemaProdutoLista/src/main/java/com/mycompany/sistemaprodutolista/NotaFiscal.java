/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaprodutolista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.print.attribute.standard.JobImpressions;
import javax.swing.JOptionPane;

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
        //%s = substituir o nome do produto
        //%d = numero de caracteris
        if (produto.getNome().length() > 20) {
            String mensagemErro = String.format("O Produto %s não foi adiciona pois contem mais que %d caracteres", produto.getNome(), 20);
            throw new NomeProdutoInvalidoException(mensagemErro);
        } else {
            this.produtos.add(produto);

        }
    }

    public void removerProdutoPorNome(String nome) {
        //produtos.remove(1);
        //modo clean
        boolean produtoFoiRemovido = this.produtos.removeIf(prod -> prod.getNome() == nome);
        if (!produtoFoiRemovido) {
            String mensagemErro = String.format("O Produto %s não foi removido pois não foi encontrado", nome);
            throw new ProdutoNaoEncontradoException(mensagemErro);
        }
    }

//modo simples
//        if (!this.produtos.removeIf(prod -> prod.getNome() == nome)) {
//            throw new ProdutoNaoEncontradoException("O Produto %s não foi removido pois não foi encontrado ");
//    }for (int i = 0; i < this.produtos.size(); i++) {
//           if (this.produtos.get(i).getNome() == nome) {
//                this.produtos.equals(this.produtos.get(i));
    
    
    public Produto getProdutoPorNome(String nome) {
        String mensagemErro = String.format("O produto %s não foi encontrado", nome);
        return this.produtos.stream().filter(p -> p.getNome().equals(nome)).
                findAny().orElseThrow(() -> new ProdutoNaoEncontradoException(mensagemErro));
    }
    //usando foreach
//        String mensagemErro = String.format("O produto %s não foi encontrado", nome);
//        for (Produto produto : this.produtos) {
//            if (produto.getNome().equalsIgnoreCase(nome)) {
//                return produto;
//            }
//        }
//   throw new ProdutoNaoEncontradoException(mensagemErro);
// }

    public boolean possuiProdutoPorNome(String nome) {
        for (Produto produto : this.produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
//        return this.produtos.stream().anyMatch(produtos -> produtos.getNome().equals(nome));
    }

    public List<Produto> getProdutosOrdenadosPorNome() {
        Comparator<Produto> comparator = (obj1, obj2) -> obj1.getNome().compareTo(obj2.getNome());
        Collections.sort(produtos, comparator);
        return this.produtos;
    }

    public List<Produto> getProdutosOrdenadosPorPreco() {
        Comparator<Produto> comparator = (obj1, obj2) -> obj1.getPreco().compareTo(obj2.getPreco());
        Collections.sort(produtos, comparator);
        return this.produtos;
    }
    public List<Produto> getProdutos() {
        return this.produtos;

    }
}
