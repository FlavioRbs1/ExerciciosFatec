package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MeuServlet")
public class MeuServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		Date data = new Date();
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		out.println(data);
		
		String StrNome = req.getParameter("NOME");
		if(StrNome == null) {
			out.print("<h2>informe um nome</h2>");
			
		}else {
			out.print("<h2>O nome é: </h2>"+StrNome);
		}
		
		
		
		
	}

}
