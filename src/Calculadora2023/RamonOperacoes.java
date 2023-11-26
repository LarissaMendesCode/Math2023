package Calculadora2023;

public class RamonOperacoes {

	//Instaciar objetos
	Soma objLarissa = new Soma();


	public double CalcularRaizQuadrada(double numero){
	return Math.sqrt(objLarissa.modulo(numero));
	}

	public double CalcularRaizCubica(double numero){
	return Math.cbrt(objLarissa.modulo(numero));
	}
}
