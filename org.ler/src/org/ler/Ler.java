package org.ler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ler {

	public static void main(String[] args) throws IOException {
		File f = new File("C:/tmp2/teste.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		
		String texto = "";
		while (bfr.ready()){
			texto += bfr.readLine();			
		}
		System.out.println(texto);
		bfr.close();

	}

}
