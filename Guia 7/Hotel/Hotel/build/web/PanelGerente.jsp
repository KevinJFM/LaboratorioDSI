<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel del Gerente</title>
    </head>
    <body>
        <div><h1>Sistema de Hotel</h1></div>
        <%-- Directiva Page --%>
        <% String usuario =  request.getParameter("tfUsuario");%>
        <div><h2><strong>Bienvenido, Gerente <%= usuario %> !</strong></h2></div>
        
        <%-- Directiva Include --%>
        <div><h3>Men&uacute; de opciones</h3></div>
        <div>
            <%@include file="MenuGerente.jsp" %>
        </div>
        <div>            
            <%@include file="Footer.html" %>
        </div>  
    </body>
</html>
