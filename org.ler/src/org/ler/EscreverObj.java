package org.ler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class EscreverObj {

	public static void main(String[] args) throws Exception {
		String sair = "sair";
		int num = 1;
		String s = null;
		File f = new File("C:/tmp2/teste.txt");
		FileWriter fw = new FileWriter(f);
		
		while(num != 0) {
			
			s = JOptionPane.showInputDialog("Informe ");
			if(s.equalsIgnoreCase(sair)) {
				num = 0;
			}
			fw.write(s+" ");
			System.out.println();
			fw.flush();
		}
		fw.close();
	}

}
