package Aula2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Grava {

	public static void main(String[] args) throws Exception{
		String texto [] = {"Hello Word","Ola mundo"};
		List<String> teste = Arrays.asList(texto);
		File f = new File("C:/tmp2/Hello.txt");
		FileOutputStream out = new FileOutputStream(f);
		ObjectOutputStream objOut = new ObjectOutputStream(out);
	//	String teste = JOptionPane.showInputDialog("Insira um Texto");
		objOut.writeObject(teste);
		objOut.close();

	}

}
