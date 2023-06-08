<%@page import="java.util.ArrayList"%>
<%@page import="com.app.modelo.Producto"%>
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
        <div class="text"><i class='bx bx-package icon'></i> Inventario</div>

        <div class="add_button"><a href="<%= request.getContextPath() %>/vistas/formularioProductos.jsp"><button type="submit" class="Agregar">Nuevo Producto</button></a></div>
		
            <table class="table-data">
                <tr class="data names">
                    <th class="data-title">Imagen</th>
                    <th class="data-title">Clave</th>
                    <th class="data-title">Producto</th>
                    <th class="data-title">Descripcion</th>
                    <th class="data-title">Categoria</th>
                    <th class="data-title">Existencias</th>
                    <th class="data-title">Precio</th>
                    <th class="data-title"></th>
                    <th class="data-title"></th>
                </tr>
                <% ArrayList<Producto> productos =  (ArrayList<Producto>) request.getAttribute("productos");
                	if(productos != null){
	               		for( Producto p: productos){%>
	               		<tr>
	               			<td></td>	
				            <td class="data-list"><%= p.getId_producto()%></td>
				            <td class="data-list"><%= p.getProducto()%></td>
				            <td class="data-list"><%= p.getDescripcion()%></td>
				            <td class="data-list"><%= p.getId_categoria()%></td>
				            <td class="data-list"><%= p.getExistencia()%></td>
				            <td class="data-list"><%= p.getPrecio_venta()%></td>
				            <td class="data-list" > <button type="submit" class="Editar">Editar</button> </td>
                    		<td class="data-list" > <a href="<%= request.getContextPath() %>/ProductosServlet?accion=delete&id_producto=<%=p.getId_producto()%>"><button type="submit" class="Eliminar">Eliminar</button></a> </td>
				        </tr>
               		<%}}%>
            </table>  
    </section>
</body>
</html>