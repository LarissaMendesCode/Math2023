package Calculadora2023;

import java.util.Scanner;



public class Calculadora2023 {

    public static void main(String[] args) {
    	//Variáveis
        double num1, num2, resultado, modulo;
        
        //Instancias
        JonasOperacoes JonasOp = new JonasOperacoes();
        
        
        //Início
        System.out.println("Digite o primeiro número: " );
        Scanner input = new Scanner (System.in);
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número: " );
        num2=input.nextDouble();


        //Soma
        Soma somalarissa = new Soma ();
        resultado = somalarissa.soma(num1, num2);
        System.out.println("A soma é: " + resultado);

        Soma modulolarissa = new Soma ();
        modulo = somalarissa.modulo(resultado);
        System.out.println("O módulo é: " + modulo );

        //Subtração

        //Jonas >> Multiplicação
        System.out.println("A Multiplicação é: " + JonasOp.multiplicacao(num1, num2));
        

        // Divisão

               
        //Jonas >> Hipotenusa
        System.out.println("A Hipotenusa dos lados A = " + num1 + " e B = " + num2 + " é = " + JonasOp.Hipotenusa(num1, num2));
        
        //Potenciação
        
        //Jonas >> Binário
        Double somaResul = resultado;
        System.out.println("O resultado inteiro da soma em binário é: " + somalarissa.numeroDecimalParaBinario(somaResul.intValue()));
        
        
    }

}
