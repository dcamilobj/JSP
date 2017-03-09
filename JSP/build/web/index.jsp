<%-- 
    Document   : other
    Created on : 8/03/2017, 08:45:08 AM
    Author     : camilo
--%>

<%@page import="com.udea.model.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer JSP</title>
    </head>
    <body>
         <%
            String nombreCompleto="";
            Persona p = new Persona();
            p.setNombre("Camilo");
            p.setApellido("Bedoya");
            String s=p.getNombre();
            request.setAttribute("persona", p);
        %>
        <form name="DRAI" method="post" action="Guardar">
         <%out.println("<h1>Bienvenido " +p.getNombre()+" "+p.getApellido()+"</h1>"); %>
        <input type="number" name="cedula" placeholder="Ingrese su cédula"/>
        <input type="submit" name="enviar"/>
        </form>
    </body>
            

</html>
