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
	 //RamonImplementação
	 public void DoubleToHex(double num1, double num2) {
			Double varHex = ObjSoma.modulo(ObjSoma.soma(num1, num2));
			System.out.println("O valor em Hexadecimal do inteiro do resultado da soma dos valores recebido é: " + "\u0030" + Integer.toHexString(varHex.intValue()).toUpperCase());
		}


	//método implementado Larissa
	//trucar o resultado da multiplicação
	public int nomeMétodo(double variável) {
		Double num = variável;
		return num.intValue();
	}
	}
