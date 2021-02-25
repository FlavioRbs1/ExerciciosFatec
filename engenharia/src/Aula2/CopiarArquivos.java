package Aula2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopiarArquivos {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("C:/nome/nome.txt");
		int data = input.read();
		while(data != -1 ) {
			System.out.println(data);
		}
		}
	}


