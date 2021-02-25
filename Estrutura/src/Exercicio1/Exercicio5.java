package Exercicio1;

import javax.swing.JOptionPane;

/*/
 Implemente um programa que receba do usu�rio um n�mero qualquer N. as seguintes
fun��es recursivas:
a. Para mostrar os n�meros de 1 at� N
b. Para mostrar os n�meros de N at� 1
 */

public class Exercicio5 {
	static int j=1;

	public static void main(String[] args) {
		int N = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));
		System.out.print("Mostre os n�meros de 1 at� N:");
		System.out.print(FuncaoA(N));
		System.out.println();
		System.out.print("Mostre os n�meros de N at� 1:");
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


