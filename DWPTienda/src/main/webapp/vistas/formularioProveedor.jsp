<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert Productos</title>
    <link rel="stylesheet" href="css/style_formulario.css">
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
    <nav class="sidebar close">
        <header>
            <div class="image-text">
                <span class="image">
                    <img src="<%= request.getContextPath() %>/Imagenes/logo.png" alt="">
                </span>

                <div class="text logo-text">
                    <span class="name">Tienda</span>
                    <span class="profession">DSPPrincipal</span>
                </div>
            </div>
        </header>

        <div class="menu-bar">
            <div class="menu">
                <ul class="menu-links">

                    <li class="nav-link">
                        <a href="<%= request.getContextPath() %>/ProductosServlet?accion=inventario">
                            <i class='bx bx-package icon' ></i>
                            <span class="text nav-text">Inventario</span>
                        </a>
                    </li>

                    <li class="nav-link">
                        <a href="<%= request.getContextPath() %>/vistas/proveedores.jsp">
                            <i class='bx bx-group icon'></i>
                            <span class="text nav-text">Proveedores</span>
                        </a>
                    </li>

                </ul>
            </div>

            <div class="bottom-content">
                <li class="">
                    <a href="#">
                        <i class='bx bx-log-out icon' ></i>
                        <span class="text nav-text">Cerrar Sesión</span>
                    </a>
                </li>
            </div>
        </div>
    </nav>

    <section class="home">
        <div class="text"><i class='bx bx-group icon'></i> Nuevo Proveedor</div>
        <div class="container">
            <div class="content">
              <form action="#" id="formulario">
                <div class="user-details">
                <p style="margin-bottom:22px;">A continuación ingresa la información solicitada en el siguiente formulario y da clic en el botón <b>Aceptar</b>.</p>
                <div class="input-box">
                    <small></small>
                  </div>
                  <div class="input-box">
                  </div>
                  <div class="input-box">
                    <span class="details">Nombre <span class="required">*</span></span>
                    <input type="text" placeholder="Ingresa el nombre" id="nombre" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Apellido Paterno <span class="required">*</span></span>
                    <input type="text" placeholder="Ingresa el apellido paterno" id="apellido_paterno" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Apellido Materno <span class="required">*</span></span>
                    <input type="text" placeholder="Ingresa el apellido materno" id="apellido_materno" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Empresa <span class="required">*</span></span>
                    <input type="text" placeholder="Ingresa el nombre de la empresa" id="empresa" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Dirección <span class="required">*</span></span>
                    <input type="text" placeholder="Ingresa la dirección" id="direccion" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Teléfono <span class="required">*</span></span>
                    <input type="text" placeholder="Ingresa el teléfono" id="telefono" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Correo Electrónico <span class="required">*</span></span>
                    <input type="email" placeholder="Ingresa el correo electrónico" id="correo_electronico" required>
                    <small></small>
                  </div>
                </div>
                <div class="button">
                  <input type="submit" name="btn_t2" id="btn_t2" value="Aceptar">
                </div>
              </form>
            </div>
          </div>
    </section>
  </body>
</html>