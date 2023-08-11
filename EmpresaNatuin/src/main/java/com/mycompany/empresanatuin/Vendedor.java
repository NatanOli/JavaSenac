/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresanatuin;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario {
    
    public double bonusVendas;
    
    @Override
    public double calcularSalarioTotal(){
    return this.Salario + bonusVendas;
    }
    
}
