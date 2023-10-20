/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.sistemaprodutolista.Livro;
import com.mycompany.sistemaprodutolista.NotaFiscal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aluno
 */
public class NotaFiscalTest {
    
    @Test
    void quandoValidoCalcularValorTotal_DeveRetornarSucesso(){
        //Arrange
        double valor1 = 50;
        double valor2 = 100;
        //Act
        double resultado = calcularValorTotal(double valor1 + double valor2);
        //Asserts
        Assertions.assertEquals(150, resultado);
        
    }
    @Test
    void quandoAdicionarProdutoValido_DeveTerSucesso(){
        //Arrange
        NotaFiscal notaFiscal = new NotaFiscal();
        Livro useACabecaJava = new Livro("Use a cabeça! Java", 65, 5);
        
        //Act
        notaFiscal.adicionarProduto(useACabecaJava);
        //Assert
        Assertions.assertEquals(1, notaFiscal.get);
        
    }
}
