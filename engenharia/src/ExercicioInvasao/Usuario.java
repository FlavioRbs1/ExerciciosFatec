package ExercicioInvasao;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Usuario {

	public static void main(String[] args) throws Exception {
		
		Socket cliente = new Socket("localhost",6000);
		InputStream in = cliente.getInputStream();
		OutputStream out = cliente.getOutputStream();
		OutputStreamWriter ouw = new OutputStreamWriter(out);
		ouw.write("Cliente se conectando no servidor...");
		int key = 0;
		while (key != 27) {
			key = in.read();
			System.out.print((char)key);
		}
		
		out.close();
		cliente.close();

	}

}
