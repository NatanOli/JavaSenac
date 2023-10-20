/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.testeunitariocalculadora.Pessoa;
import com.mycompany.testeunitariocalculadora.Util;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aluno
 */
public class UtilTest {

    //teste1
    @Test
    void quandoValidarUmaPessoaComNomeInvalido_DeveRetornarFalse() {
        //Arrange
        Pessoa pessoa = new Pessoa("Natan de Oliveira", 31);

        //Act
        boolean resultado = Util.validarPessoa(pessoa);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //teste2
    @Test
    void quandoValidarUmaPessoaComIdadeInvalido_DeveRetornarFalse() {
        //Arrange
        Pessoa pessoa = new Pessoa("Natan de Oliveira", 17);

        //Act
        boolean resultado = Util.validarPessoa(pessoa);

        //Assert
        Assertions.assertFalse(resultado);
    }

    //teste3
    @Test
    void quandoValidarUmaPessoaValida_DeveRetornarTrue() {
        //Arrange
        Pessoa pessoa = new Pessoa("Natan", 25);

        //Act
        boolean resultado = Util.validarPessoa(pessoa);

        //Assert
        Assertions.assertTrue(resultado);
    }

    @Test
    void quandoPassarStringValida_DeveRetornarInteiro() {
        //Arrange
        String valor = "5";
        int resultadoEsperado = 5;
        //Act 
        int resultado = Util.converterStringParaInt(valor);
        //Assert
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    //testando exceptions
    void quandoPassarStringInvalido_DeveJogarException() {
        //Arrange
        String valor = "f1";
        String resultadoEsperado = "For input string: \"f1\"";
        //Act 
        NumberFormatException resultado = assertThrows(NumberFormatException.class, () -> Util.converterStringParaInt(valor));
        //Assert
        Assertions.assertEquals(resultadoEsperado, resultado.getMessage());
    }

    @Test

            
        void quandoPassarUmaLista_DeveRetornarAMesmaOrdenado() {
        //Arrange
        List<String> lista = new ArrayList();
        lista.add("Douglas");
        lista.add("Natan");
        lista.add("Jamaica");
        //Act
        List<String> resultado = Util.ordenarLista(lista);
        //Assert
        Assertions.assertEquals("Douglas", resultado.get(0));
        Assertions.assertEquals("Jamaica", resultado.get(1));
        Assertions.assertEquals("Natan",resultado.get(2));

    }
}
