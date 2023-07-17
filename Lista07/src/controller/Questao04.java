package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {
		int [] a =  new int [8];
		int [] b = new int [8];
		
		for (int i = 0; i < 8; i++) {
			 
			a [i] = Teclado.lerInt("Informe um número");
			b [i] = a[i] * 3;
			
		}//fim do for
		for (int i = 0; i < 8; i++) {
			
		System.out.println(a[i] + " X 3 = " + b[i]);
		}
	}

}
