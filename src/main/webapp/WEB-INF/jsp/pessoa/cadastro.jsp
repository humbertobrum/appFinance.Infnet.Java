<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Nova Pessoa</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Pessoa</h2>
	  <form action="/pessoa/incluir" method="post">
	  
	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" name="nome">
	    </div>
	    
	    <div class="form-group">
	      <label>E-mail:</label>
	      <input type="email" class="form-control" placeholder="Entre com o e-mail" name="email">
	    </div>
	    
	    <div class="form-group">
	      <label>CPF:</label>
	      <input type="text" class="form-control" placeholder="Entre com o CPF" name="cpf">
	    </div>
	    
	     <div class="form-group">
	      <label>Idade:</label>
	      <input type="number" class="form-control" placeholder="Entre com a Idade" name="idade">
	     </div>

	     <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>