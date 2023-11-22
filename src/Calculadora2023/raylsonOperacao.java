package Calculadora2023;

public class raylsonOperacao {
	
	Soma objmodulo = new Soma();
	
	// Método que retorno um número ao outro
	public void potenciacao(double num1, double num2) {
		if(num2 > 0) {
			// int expoente = objmodulo.truncar(num2);
			Double expoente = num2;
    	System.out.println("A potência de " + num1 + " elevado a potência " + expoente + " é: " + Math.pow(num1, expoente.intValue()));
    } else {System.out.println("nao foi possivel calcular"); }
    
    }
	
	// Método que retorna ao quadrado do número
	public double numQuadrado(double base) {
    	return Math.pow(base, 2);	
    	
    }
	
}
