<%@page import="com.app.modelo.Producto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insertar Productos</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/style_formulario.css">
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
                        <a href="<%= request.getContextPath() %>/ProveedorServlet?accion=proveedores">
                            <i class='bx bx-group icon'></i>
                            <span class="text nav-text">Proveedores</span>
                        </a>
                    </li>

                </ul>
            </div>

            <div class="bottom-content">
                <a href="<%= request.getContextPath() %>/vistas/login.jsp">
                    <a href="#">
                        <i class='bx bx-log-out icon' ></i>
                        <span class="text nav-text">Cerrar Sesión</span>
                    </a>
                </li>
            </div>
        </div>
    </nav>
    
    <section class="home">
        <div class="text"><i class='bx bx-package icon'></i> Nuevo Producto</div>
        <div class="container">
            <div class="content">
              <form action="<%= request.getContextPath() %>/ProductosServlet" id="formulario" mehtod="post">
                <div class="user-details">
                <p style="margin-bottom:22px;">A continuación ingresa la información a cambiar en el siguiente formulario y da clic en el botón <b>Aceptar</b>.</p>
                <% Producto producto = (Producto) request.getAttribute("producto"); %>
                <div class="input-box">
                    <small></small>
                  </div>
                  <div class="input-box">
                  </div>
                    <input type="text" style="display:none" placeholder="Ingresa el nombre del producto" id="producto" name="Id_producto" value="<%=producto.getId_producto()%>">
                  <div class="input-box">
                    <span class="details">Producto <span class="required">*</span></span>
                    <input type="text" placeholder="Ingresa el nombre del producto" id="producto" name="producto" value="<%=producto.getProducto()%>" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Descripción <span class="required">*</span></span>
                    <input type="text" placeholder="Ingresa la descripcion" id="descripcion" name="descripcion" value="<%=producto.getDescripcion()%>" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Categoría <span class="required">*</span></span>
                    <select id="categoria" name="categoria" required>
                      <option value="1">Frutas y verduras</option>
                      <option value="2">Panadería</option>
                      <option value="3">Bebidas</option>
                    </select>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Existencias <span class="required">*</span></span>
                    <input type="number" placeholder="Ingresa el numero de existencias" id="existencias" name="existencia" value="<%=producto.getExistencia()%>" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Precio <span class="required">*</span></span>
                    <input type="number" step="0.01"placeholder="Ingresa el precio" id="precio" name="precio" value="<%=producto.getPrecio_venta()%>" required>
                    <small></small>
                  </div>
                  <div class="input-box">
                    <span class="details">Imagen <span class="required">*</span></span>
                    <input type="file" name="imagen" accept="image/*" name="imgaen">
                    <small></small>
                  </div>
                </div>
                <div class="button">
                  <input type="submit" name="btn_t1" id="btn_t1" value="Aceptar">
                </div>
              </form>
            </div>
          </div>
    </section>
  </body>
</html>