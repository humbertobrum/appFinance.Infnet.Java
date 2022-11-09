<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Nova Conta</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">

	<h2>Conta</h2>
	  <form action="/conta/incluir" method="post">
	  
	    <div class="form-group">
	      <label>Agencia:</label>
	      <input type="text" class="form-control" placeholder="Numero da agência" name="agencia">
	    </div>
	    
	    <div class="form-group">
	      <label>Conta:</label>
	      <input type="text" class="form-control" placeholder="Numero da conta" name="conta">
	    </div>
	    
	    <div class="form-group">
	      <label>Descrição:</label>
	      <input type="text" class="form-control" placeholder="Descrição" name="descricao">
	    </div>

	     <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
  
	</div>
</body>
</html>