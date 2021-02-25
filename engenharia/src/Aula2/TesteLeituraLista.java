package Aula2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class TesteLeituraLista {

	public static void main(String[] args) throws Exception{
		File f = new File("C:/tmp2/lista.txt");
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream objIn = new ObjectInputStream(fin);
		List<String> obj = (List<String>)objIn.readObject();
		for(String nome : obj) {
			System.out.println(nome);
		}

	}

}
