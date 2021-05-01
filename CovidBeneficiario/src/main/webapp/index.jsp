<%@page languaje="java" contenttype="text//html; charset-utf-8"
pageEconding="utf-8"%> 
<html>
<meta charset="utf-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/min.css" >
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate/4.1.1/animate/css/min.css" >
      <link rel="stylesheet" href="CSS/estiloindex.css">
<body>
<h2>Hello World!</h2>
</body>
<div class="logo">
   <center>
   <img class="logo" src="img/logo_GOES2.png" alt="">
   </center>
</div>
<div class="container animate_animate_backInDawn">
   <div class="row justify-content-center align-items-center vh-100">
     <div class="offset col-md-8 bg-light border border-succes rounded">
       <form action="ControllerAcceso" method="post">
         <div class="contenedor">
           <h5 aling="center"> Consulta quien de tu familia es el beneficiario del apoyo 
           economico para la alimentacion
           </h5>
           <center>
               <label class="label">Covid-19</label>
           </center>
           <div class="input-group mt-5 mb-5">
              <span class="input-group-text far fa-2x fa-address-card"></span>
               <input class="form-control" type="number" name="DUI"
               placeholder="Ingresa tu Documento Unico de Identidad" min="0" required>
               <button class="btn btn-success" type="submit">Consultar</button>
           </div>
         </div>
       </form>
     </div>
   </div>
</div>
</html>
