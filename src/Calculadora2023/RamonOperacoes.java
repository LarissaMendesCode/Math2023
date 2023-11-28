package Calculadora2023;

public class RamonOperacoes {

	//Instaciar objetos
	Soma objLarissa = new Soma();


	public double CalcularRaizQuadrada(double numero) {
		return Math.sqrt(objLarissa.modulo(numero));
	}

	public double CalcularRaizCubica(double numero) {
		return Math.cbrt(objLarissa.modulo(numero));
	}

	/*Metodo
	 * @param num1 e num2 são os números que serão divididos
	 * @return o resultado da divisão
	 */
	double CalcularRaizQuarta(double numero) {
		return Math.pow(numero, 1.0 / 4.0);
	}

}
