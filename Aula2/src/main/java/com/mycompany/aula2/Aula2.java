
package com.mycompany.aula2;

import java.util.Scanner;

public class Aula2 {

    /*
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite o valor de pi: ");
       double pi = scanner.nextDouble();
       
       System.out.println("Digite o valor do raio: ");
       double raio = scanner.nextDouble();
       
       
       System.out.println("O valor de um circulo é: " + (pi*(raio*raio)));
    }
}
public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite 1 número: ");
       int numero = scanner.nextInt();
       
       System.out.println("Digite outro número: ");
       int numero2 = scanner.nextInt();
       
       
       if (numero > numero2){
           System.out.println("O maior valor é o digito " + numero);
       }else if(numero < numero2){
           System.out.println("O maior valor é o digito " + numero2);
       }else if (numero==numero2){
           System.out.println("Os valores são iguais "+numero +" e "+ numero2);
       }
        
       }*/
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite o valor de X: ");
       double x = scanner.nextDouble();
       System.out.println("Digite o valor de y: ");
       double y = scanner.nextDouble();
      
       System.out.println("Qual operação você deseja? \n 1 = soma. \n 2 = subtração. \n 3 = multiplicação. \n 4 = divisão");
       
        int conta = scanner.nextInt();
     
       switch(conta){
           case 1 : 
               double soma = (x + y);
           System.out.println("O valor da operação é: "+ soma);
            break;
            
           case 2: 
               double subtração = (x - y);
           System.out.println("O valor da operação é: "+ subtração);
           break;
           
           case 3: 
               double multiplicação = (x * y);
           System.out.println("O valor da operação é: "+ multiplicação);
           break;
           
           case 4: 
               double divisão = (x / y);
           System.out.println("O valor da operação é: "+ divisão);
           break;
           
           default:
               System.out.println("Informação inválida");
       }
          
       //System.out.println("O valor da operação é: "+ operacao);
}

    private static void soma(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void subtração(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void multiplicação(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void divisão(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


               

