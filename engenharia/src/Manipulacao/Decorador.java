package Manipulacao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decorador {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:/WINDOWS/WindowsUpdate.log");
		InputStreamReader Input = new InputStreamReader(fis);
		BufferedReader buf = new BufferedReader(Input);
		System.out.println(Input);

	}

}
