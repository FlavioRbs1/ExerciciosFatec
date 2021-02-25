package Aula2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;

public class Le {

	public static void main(String[] args) throws Exception {
		File f = new File("C:/tmp2/hello.pdf");
	//	FileInputStream fin = new FileInputStream(f);
	//	ObjectInputStream ObjIn = new ObjectInputStream(fin);
		FileReader fr = new FileReader(f);
		
		System.out.println(fr);
		

	}

}
