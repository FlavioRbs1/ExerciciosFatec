package Manipulacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class leArquivos {

	public static void main(String[] args) throws Exception {
		File f = new File("C:/tmp2/teste.txt");
		FileOutputStream fout = new FileOutputStream(f);

	}

}
