package Exercicio1;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 Implemente um programa que leia 20 n�meros e armazene-os em um vetor. Pe�a ao usu�rio
que digite um n�mero qualquer dos 20 digitados e fa�a uma busca seq�encial neste vetor
antes de orden�-lo. Mostre ao usu�rio a posi��o em que este n�mero foi encontrado e a
quantidade de vezes que o FOR foi executado para encontrar o n�mero. Depois ordene este
vetor e realize novamente a busca seq�encial e mostre novamente os resultados.
 */

public class Exercicio7 {
	static Random ran = new Random();
	static int i = 0;
	
	public static void main(String[] args) {
		int [] vetor = new int[20];
		Carrega(i);
		int num=Integer.parseInt(JOptionPane.showInputDialog("Informe um numero de 1 a 20:"));
		Procura(i,num);
	}
	public static int Carrega(int i) {
		for(i=0;i<20;i++) {
			i = ran.nextInt(20);
			System.out.println(i);
		}
		return i;
	}
	public static void Procura(int i,int num) {
		for(i=0;i<20;i++) {
			
			System.out.println(i);
		}
	}
	
}
