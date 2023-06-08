<%@page import="com.app.modelo.Proveedor"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Diseño De Sistemas</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/estilo.css">
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
                        <a href="<%= request.getContextPath() %>/ProveedorServlet?accion=proveedores">>
                            <i class='bx bx-group icon'></i>
                            <span class="text nav-text">Proveedores</span>
                        </a>
                    </li>

                </ul>
            </div>

            <div class="bottom-content">
                <li class="">
                    <a href="<%= request.getContextPath() %>/vistas/login.jsp">
                        <i class='bx bx-log-out icon' ></i>
                        <span class="text nav-text">Cerrar Sesión</span>
                    </a>
                </li>
            </div>
        </div>
    </nav>

    <section class="home">
        <div class="text"><i class='bx bx-group icon'></i> Proveedores</div>

            <div class="add_button"><a href="<%= request.getContextPath() %>/vistas/formularioProveedor.jsp"> <button type="submit" class="Agregar">Nuevo Proveedor</button></a> </div>

            <table class="table-data">
                <tr class="data names">
                    <th class="data-title">Representante</th>
                    <th class="data-title">Empresa</th>
                    <th class="data-title">Direccion</th>
                    <th class="data-title">Telefono</th>
                    <th class="data-title">Correo Electronico</th>
                    <th class="data-title" style="width: 1%;"></th>
                    <th class="data-title" style="width: 1%;"></th>
                  </tr>
                  <% ArrayList<Proveedor> proveedores =  (ArrayList<Proveedor>) request.getAttribute("Proveedores");
                	if(proveedores != null){
	               		for( Proveedor p: proveedores){ %>
	               				<tr>
				            <td class="data-list"><%= p.getRepresentante()%></td>
				            <td class="data-list"><%= p.getEmpresa()%></td>
				            <td class="data-list"><%= p.getDireccion()%></td>
				            <td class="data-list"><%= p.getTelefono()%></td>
				            <td class="data-list"><%= p.getCorreo_electronico()%></td>
				            <td class="data-list" > <a href="<%= request.getContextPath() %>/ProveedorServlet?accion=update&id_proveedor=<%=p.getId_proveedor()%>"><button type="submit" class="Editar">Editar</button></a> </td>
                    		<td class="data-list" > <a href="<%= request.getContextPath() %>/ProveedorServlet?accion=delete&id_proveedor=<%=p.getId_proveedor()%>"><button type="submit" class="Eliminar">Eliminar</button></a> </td>
				        </tr>
               		<%}}%>
            </table>  
    </section>
</body>
</html>