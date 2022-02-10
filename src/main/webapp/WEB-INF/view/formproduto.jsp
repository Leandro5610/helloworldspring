<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input,label{
	display: block;
}
html {
	background-color: aqua;
}
form {
	margin-right: auto;
	margin-left: auto;
}

</style>
</head>
<body>
	<h1>Formulário de cadastro de produto</h1>
	
	
            <form action="salvarProduto">
                <h2 class="titulo">Cadastrar</h2>
                <label for="">Nome</label>
                <input type="text" name="nome"	value="${produto.nome }" >
                <label for="">Data de Validade</label>
                <input type="date" name="dataValidade" value="${produto.dataValidade.time }">
                <label for="">Preço</label>
                <input type="text" name="preco" step="0.1" value="${produto.preco }">
                <label for="">Estoque</label>
                <input type="number" name= "estoque" value="${produto.estoque }">
                <label for="">Tipo De Produto</label>
               	<select name="tipoProduto">
               		<c:forEach items="${tipos }" var="t">
               			<option value="${t}">${t.toString() }</option>
               		</c:forEach>
               	</select>
               	<button type="submit">Cadastrar</button>
            </form>
            
        
</body>
</html>