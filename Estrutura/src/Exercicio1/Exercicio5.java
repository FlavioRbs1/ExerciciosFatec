package Exercicio1;

import javax.swing.JOptionPane;

/*/
 Implemente um programa que receba do usuário um número qualquer N. as seguintes
funções recursivas:
a. Para mostrar os números de 1 até N
b. Para mostrar os números de N até 1
 */

public class Exercicio5 {
	static int j=1;

	public static void main(String[] args) {
		int N = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));
		System.out.print("Mostre os números de 1 até N:");
		System.out.print(FuncaoA(N));
		System.out.println();
		System.out.print("Mostre os números de N até 1:");
		System.out.print(FuncaoB(N));

	}
	public static int FuncaoA(int A) {
		if(j == A) {
			return A;
		}
		System.out.print(j+" ");
		j++;
		return FuncaoA(A);
	}
	public static int FuncaoB(int B) {
		if(B > 1) {
			System.out.print(B+" ");
			return FuncaoB(B-1);
		}		
		return 1;
		 
	}
}


