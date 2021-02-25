package Aula2;

import java.io.*;

public class GravaArquivo {

	public static void main(String[] args) {
		File f = new File("C:/tmp2/nome.txt");
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("Flavio Ribeiro de barros da silva");
			fw.flush();
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
