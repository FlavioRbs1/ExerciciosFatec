package Exercicio1;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 Implemente um programa que leia 20 números e armazene-os em um vetor. Peça ao usuário
que digite um número qualquer dos 20 digitados e faça uma busca seqüencial neste vetor
antes de ordená-lo. Mostre ao usuário a posição em que este número foi encontrado e a
quantidade de vezes que o FOR foi executado para encontrar o número. Depois ordene este
vetor e realize novamente a busca seqüencial e mostre novamente os resultados.
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
