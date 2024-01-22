

<%@page import="com.mycompany.pruebatecnica2.logica.Turn"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba Tecnica</title>
    </head>
    <body>
 <h1>Lista de Tramites</h1>

        <table id="tablaTramites" width="100%" cellspacing="0" border="1">
            <thead>
                <tr>
                    <th>Número de turno</th>
                    <th>Nombre</th>
                    <th>Fecha</th>
                    <th>Estado</th>
                    <th>Nombre Usuario</th>
                    <th>Apellido Usuario</th>
                    <th>DNI Usuario</th>
                </tr>
            </thead>
            
            
            <%
                List<Turn> list = (List) request.getSession().getAttribute("list");
             %>
             <!-- Recorremos la lista creada en el servlet para mostrar los atributos tanto del turno como del cliente asociado -->
             <tbody>
                 <% for (Turn turn : list) {%>
                 <tr>
                     <td><%=turn.getId()%></td>
                     <td><%= turn.getName()%></td>
                     <td><%=turn.getDate()%></td>
                     <td><%=turn.getStatus()%></td>
                     <td><%=turn.getClient().getName()%></td>
                     <td><%=turn.getClient().getLastName()%></td>
                     <td><%=turn.getClient().getDni()%></td>
                 </tr>    
                 
                 <%}%>
                 
             </tbody>   
             
             <tfoot>
                <tr>
                    <th>Número de turno</th>
                    <th>Nombre</th>
                    <th>Fecha</th>
                    <th>Estado</th>
                    <th>Nombre Usuario</th>
                    <th>Apellido Usuario</th>
                    <th>DNI Usuario</th>
                </tr>
            </tfoot>

        </table>

    </body>
</html>
