package Calculadora2023;

public class Soma {

    public double soma(double num1, double num2) {
        double resultado;
        resultado = num1+num2;
        return resultado;
    }
    public double modulo (double resultado) {
        if (resultado<0)
        {
       double modulo = resultado*(-1);
       return modulo;}
        else
        {double modulo = resultado*(1);
            return modulo;}
}


}





