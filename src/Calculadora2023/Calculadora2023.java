package Calculadora2023;

import java.util.Scanner;



public class Calculadora2023 {

    public static void main(String[] args) {
        double num1, num2, resultado, modulo;

        System.out.println("Digite o primeiro número: " );
        Scanner input= new Scanner (System.in);
        num1=input.nextDouble();

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

        // Multiplicação

        // Divisão

    }

}
