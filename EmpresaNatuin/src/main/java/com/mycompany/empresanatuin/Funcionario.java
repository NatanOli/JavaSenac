/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresanatuin;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
class Funcionario {
    public String nome;         
    public LocalDate dataNascimento;           
    public double Salario;
    
    public double calcularSalarioTotal(){
    return this.Salario;
    }
}
