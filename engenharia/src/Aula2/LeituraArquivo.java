package Aula2;



import java.io.*;
import java.lang.module.FindException;

import javax.swing.JOptionPane;


public class LeituraArquivo {

	public static void main(String[] args) {
		File f = new File("C:/tmp2/nooe.txt");
		try {
			FileReader fr = new FileReader(f);
			int i = 0;
			while(i != -1) {
				i = fr.read();
				if (i != -1) {
					System.out.print((char)i);
				}
				
			}
			fr.close();
			
			}
			catch(FindException e) 
			{
			
				
			}
			
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		
	}
}
			


