/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeunitariocalculadora;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Util {

    public static int converterStringParaInt(String stringASerConvertida) {
        return Integer.parseInt(stringASerConvertida);
    }
    
    public static List<String> ordenarLista(List<String> lista) {
        Collections.sort(lista);
        
        return lista;
    }

    public static boolean validarPessoa(Pessoa pessoa) {
        //teste1
        if (pessoa.getNome().length() > 15) {
            return false;
        }
        //teste2
        else if (pessoa.getIdade() < 18) {
            return false;
        }
        //teste3 cenário feliz
        return true;
    }
}