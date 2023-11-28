package Calculadora2023;

public class DivisaoMatheus {

     /* Método implementado por Matheus
        * @param num1 e num2 são os números que serão divididos
        * @return o resultado da divisão
     */

    public double divisao(double num1, double num2) {
        double resultado;
        resultado = num1 / num2;
        return resultado;}

    /* 2º Método implementado por Matheus
        * @param trocando o resultado da divisão para inteiro
        * @return o resultado da divisão em inteiro
     */
    public int divisaoInteiro(double num1, double num2) {
        double resultado;
        resultado = num1 / num2;
        int resultadoInteiro = (int) resultado;
        return resultadoInteiro;
    }
    }
