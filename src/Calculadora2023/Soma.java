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
    
    		//Método implementado por Jonas
    		//
       
    String numeroDecimalParaBinario(int decimal) {
		//Variáveis para Operação
		int quociente = 0;
		int resto;
		int dividendo = decimal;	
		String binario = "";	
		
		//Operação
		do{
			resto = (dividendo % 2);
			
			quociente = (dividendo - resto) / 2;
				
			dividendo = (quociente); // 27
			
			binario = resto + binario;
						
		}while(dividendo >= 1);
		return binario;
	}
}





