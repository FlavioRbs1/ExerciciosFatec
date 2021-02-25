package Exercicio1;

import javax.swing.JOptionPane;

/*
 Escreva um programa que solicite do usuário um valor N sendo este passado para uma
função denominada verNumPar que imprime somente os valores pares passado como
argumento de 1 até N. Para tanto, verNumPar chama uma outra função denominada
verPar que verifica se um número é par, se for deverá retornar 1 ou não neste caso
retorna 0.
 */

public class Exercicio2 {

	public static void main(String[] args) {
		int N = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero:"));
		verNumPar(N);

	}
	public static void verNumPar(int num) {
		JOptionPane.showMessageDialog(null, "Se par 1, se impar 0: "+verPar(num));		
	}
	public static int verPar(int num) {
		if(num % 2 == 0) {
			return 1;
		}
		return 0;
	}

}
