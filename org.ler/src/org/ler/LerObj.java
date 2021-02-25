package org.ler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LerObj {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("C:/tmp2/teste.txt");
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		String s = (String) objin.readObject();
		
		System.out.println("String lida cdo arquivo:"+s);
		
		objin.close();
	}

}
