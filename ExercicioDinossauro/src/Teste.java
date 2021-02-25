import java.util.Scanner;

public class Teste {

	
	public static void main(String[]args) {

		int loop = 1;
		
		while(loop ==1) {
			menu();
		}

	}
	public static void menu() {

		Dinossauro skeep = new Dinossauro();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma característica\n(P)ular\n(C)orrer\nCo(M)er\n(A)tirar\nTomar(S)ol\nFicar na S(O)mbra");
		String chamada = scan.next(); 

		switch(chamada)
		{
		case "P": case "p":
			skeep.pular();
			break;
		case "C": case "c":
			skeep.correr();
			break;
		case "M": case "m":
			skeep.comer();
			break;
		case "A": case "a":
			skeep.atirar();
			break;
		case "S": case "s":
			skeep.tomarSol();
			break;
		case "O": case "o":
			skeep.ficarNaSombra();
			break;
		default:
			menu();

		}


	}


}


