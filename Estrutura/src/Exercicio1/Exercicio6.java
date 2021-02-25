package Exercicio1;

import java.util.Random;

/*
 * Implemente um programa que crie um vetor A de 10 posições, um vetor B de 10 posições e um
vetor C com 10 posições. Receba os valores para o vetor A e vetor B. Faça as seguintes
operações com os vetores:
• Vetor C = vetor A + vetor B
• Vetor C = vetor A - vetor B
• Vetor C = vetor A * vetor B
• Vetor C = vetor A / vetor B
 */

public class Exercicio6 {
	static int c = 0;
	public static void main(String[] args) {
		int[] vetor = new int[10];
		Random ran = new Random();
		int c=0;
		for(int i=0;i<10;i++) {
			int a = ran.nextInt(10);
			int b = ran.nextInt(3);
			Soma(a,b);
			Subtrair(a,b);
			Multiplicar(a,b);
			Dividir(a,b);
			System.out.println();
		}
		
	}
	public static void Soma(int A, int B) {
		c = A+B;
		System.out.println(c+" = "+A+" + "+B);
		
	}	
	public static void Subtrair(int A, int B) {
		c = A-B;
		System.out.println(c+" = "+A+" - "+B);
	}
	public static void Multiplicar(int A, int B) {
		c = A*B;
		System.out.println(c+" = "+A+" * "+B);
	}
	public static void Dividir(int A, int B) {
		if(B == 0) {
			String c = (String) "Indeterminado";
			 System.out.println(c+" = "+A+" / "+B);
		}else {
		c = A/B;
		System.out.println(c+" = "+A+" / "+B);
		}
	}

}
