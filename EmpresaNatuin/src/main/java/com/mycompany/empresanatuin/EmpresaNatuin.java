/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresanatuin;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class EmpresaNatuin {

    public static void main(String[] args) {
       //objeto - tipo Gerente, variavel - tipo gerente(nome do gerente)
    Gerente marcos = new Gerente();
    marcos.nome = "Marcos";
    marcos.Salario = 4500;
    marcos.dataNascimento = LocalDate.now();
    
    double salarioGerente = marcos.calcularSalarioTotal();
    
    System.out.println("Salario Gerente " + salarioGerente);
    System.out.println("Nome Gerente " + marcos.nome);
    System.out.println("Nome Idade " + marcos.dataNascimento);

    Vendedor jose = new Vendedor();
    jose.nome = "Jose";
    jose.Salario = 2500;
    jose.dataNascimento =  LocalDate.now();
    jose.bonusVendas = 300;
    
    double salarioVendedor = jose.calcularSalarioTotal();
    
    System.out.println("Salario Vendedor " + salarioVendedor);
    System.out.println("Nome Vendedor " + jose.nome);
    System.out.println("Nome Idade " + jose.dataNascimento);
    }
}
