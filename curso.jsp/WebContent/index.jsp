<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bem vindo ao curso JSP</h1>
	<%="seu sucesso garantido" %>
	
	<form action="ReceberNome.jsp">
	  <input type="text id="nome" name="nome">
	  <input type="submit" value = "Enviar"></input>
	</form>
	<%! int cont = 2;
		
		public int retorna(int n){
			return n*3;			
			}
		%>
		
	<%= cont %>
	<br/>
	<%= retorna(258)%>
	
</body>
</html>