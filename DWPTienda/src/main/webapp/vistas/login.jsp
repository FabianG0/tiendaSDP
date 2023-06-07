<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
     <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>InicioSesion</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/style_login.css">
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
</head>

<body>
  <div class="wrapper">
    <img src="<%= request.getContextPath() %>/Imagenes/logo_big.png">
    <form action="<%= request.getContextPath() %>/LoginServlet" method="post" id="formulario">
       <div class="field email">
          <div class="input-area">
             <input type="text" name="email" placeholder="Correo Electrónico" required>
             <i class="icon fas fa-user"></i>
          </div>
       </div>
       <div class="field password">
          <div class="input-area">
             <input type="password" name="password" id="" placeholder="Contraseña" required>
             <i class="icon fas fa-lock"></i>
          </div>
       </div>
       <input type="submit" name="submit" value="Iniciar Sesión">
    </form>
  </div>
</body>

</html>