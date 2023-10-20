/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.testeunitariocalculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Aluno
 */
public class CalculadoraTest {
    
    @Test
    public void quandoSomar_DeveTerSucesso(){
        double soma = Calculadora.somar(2, 5);
        Assertions.assertEquals(7, soma);
    }
@Test
    public void quandoSubtrair_deveTerSucesso() {
        // arrange
        double valor1 = 20;
        double valor2 = 2;

        // act
        double resultado = Calculadora.subtrair(valor1, valor2);

        // assert
        Assertions.assertEquals(18, resultado);
    }

    @Test
    public void quandoMultiplicar_deveTerSucesso() {
        // arrange
        double valor1 = 50;
        double valor2 = 4;

        // act
        double resultado = Calculadora.multiplicar(valor1, valor2);

        // assert
        Assertions.assertEquals(200, resultado);
    }

    @Test
    public void quandoDividir_deveTerSucesso() {
        // arrange
        double valor1 = 100;
        double valor2 = 2;

        // act
        double resultado = Calculadora.dividir(valor1, valor2);

        // assert
        Assertions.assertEquals(50, resultado);
    }

}
