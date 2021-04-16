<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(document).ready(function){
	$.post('ControllerMostrarInformacion',{
		
	},function(response){
		let datos = JSON.parse(response);
		console.log(datos);
		for tabla = document.getElementById('tablaDatos');
		for (let item of datos){
			
			tabla.innerHTML +=
				<tr>
			<td>${item.idUsuario}</td>
			<td>${item.Usuario}</td>
			<td>${item.Pass}</td>
			<td> <a href="ControllerMostrarInformacion?IdUsuario=${item.idUsuario}""&Eliminar=btne" class="btn btn-danger"Eliminar <a> 
			<a href ="ControllerMostrarInformacion" class="btn btn-warning">ACTUALIZAR</a>
			</tr>
			</td>
			
		}
	});
});
</script>
<h1>WELCOME</h1>

<table class="table table-dark table-striped" id="tablaDatos">
<thead>
<th>IdUsuario</th>
<th>Usuario</th>
<th>Password</th>
<th>ACCIONES</th>
</thead>

</table>
</body>
</html>