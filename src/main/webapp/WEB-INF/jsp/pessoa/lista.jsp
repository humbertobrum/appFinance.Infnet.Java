<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastro de Pessoas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h3>Pessoas: ${listagem.size()}</h3>

	  <h4><a href="/adicionarPessoa">Nova Pessoa</a></h4>
  
	  <table class="table table-striped">
	    <thead>
	      <tr>
	   		<th>ID</th>
		    <th>Nome</th>
		    <th>Documento</th>
		    <th>Idade</th>
		    <th></th>
	      </tr>
	    </thead>
	    <tbody>
		  <c:forEach var="item" items="${listagem}">
		      <tr>
				<td>${item.id}</td>
			    <td>${item.nome}</td>
			    <td>${item.cpf}</td>
			    <td>${item.idade}</td>
		        <td><a href="/pessoa/${item.id}/excluir">excluir</a></td>
		      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>