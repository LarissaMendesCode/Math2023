package Calculadora2023;

import java.util.Scanner;

public class Calculadora2023 {

    public static void main(String[] args) {
    	//Variáveis
        double num1, num2, resultado, modulo;
        
        //Instancias
        JonasOperacoes JonasOp = new JonasOperacoes();
        raylsonOperacao objRaylson = new raylsonOperacao();  // Adicionado aqui

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
         subsavio subtracao = new subsavio();
         resultado = subtracao.subtrair(num1, num2);
         System.out.println("A subtração é: " + resultado);
        // Multiplicação
         //Jonas >> Multiplicação
        System.out.println("A Multiplicação é: " + JonasOp.multiplicacao(num1, num2));
        

        // Divisão

               
        //Jonas >> Hipotenusa
        System.out.println("A Hipotenusa dos lados A = " + num1 + " e B = " + num2 + " é = " + JonasOp.Hipotenusa(num1, num2));
        
        //Potenciação
        
        //Jonas >> Binário
        Double somaResul = resultado;
        System.out.println("O resultado inteiro da soma em binário é: " + somalarissa.numeroDecimalParaBinario(somaResul.intValue()));
        
        //Savio >>  Área do retângulo
         if (num1*num2<0){
            System.out.println("O cálculo da área do retângulo é: " + num1 * num2*-1);
        }
        else {
            System.out.println("O cálculo da área do retângulo é: " + num1 * num2);
        }

        //Raylson >> Área do círculo
        objRaylson.AreaCirculo(num1, num2);  // Adicionado aqui
    }
}
