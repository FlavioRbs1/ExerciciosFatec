package Manipulacao;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeCaracter {

	public static void main(String[] args) throws IOException {
		File f = new File("C:/windows/setupact.log");
		FileReader fr = new FileReader(f);
		int i = 0;
		while (i != -1) {
			i = fr.read();
			if(i!=1) {
				System.out.print((char)i);
			}
			
			
		}
		
		fr.close();

	}

}
