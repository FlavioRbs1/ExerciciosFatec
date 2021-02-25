package Manipulacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravaNome {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/nome/nome.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("Flavio Ribeiro");
		fw.flush();
		fw.close();

	}

}
