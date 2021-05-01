<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href= "https://stackpath.bootstrapcdn,com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384- ggOyR0iXCbMQv3Xipma34MD+dh/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonimous">
</head>
<style>
      .margen{
        margin-top:5%;
      }
</style>
<body>
  <div class="container">
      <div class="row margen">
        <div class="col-md-12">
          <div class="panel panel-default sombra">
            <div class="panel-body">
               <div class="centrar">
                 <form action="ControllerAcceso" method="post">
                   <label>USER</label>
                   <input class="form-control" type="text" name="user" placeholder="Escribe tu Usuario">
                   <br>
                   <label>PASS</label>
                   <input class="form-control" type="password" name="pass" placeholder="Escribe tu Contra">
                   <br>
                   <input class="btn btn-success" type="submit" value="Enviar Datos">
                 </form>
                </div>
               </div>
              </div>
            </div>
          </div>
        </div>
  

</body>
</html>