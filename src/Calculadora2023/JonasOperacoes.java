package Calculadora2023;

public class JonasOperacoes {
	
	Soma ObjSoma = new Soma();

	//Muntiplicação
	 public double multiplicacao(double fator1, double fator2) {
		 return fator1 * fator2;
	 }
	  
	 //Hipotenusa
	 public double Hipotenusa(double catetoOposto, double catetoAdjacente) {
		 return Math.sqrt(ObjSoma.soma(Math.pow(ObjSoma.modulo(catetoOposto), 2), Math.pow(ObjSoma.modulo(catetoAdjacente), 2)));
	 }
}
