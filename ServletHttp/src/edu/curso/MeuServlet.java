package edu.curso;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servico")
public class MeuServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException{
		PrintWriter out = res.getWriter();
		out.println("<h1>Teste de Servlet<h1>");
//		String StrNome = req.getParameter("NOME");
//		if(StrNome == null) {
//			out.print("informe um nome");
//		}else {
//		out.println("O nome é "+StrNome);
//		}
		System.out.println();
		Date data = new Date();
		out.println(data);
	
	}

	
}
