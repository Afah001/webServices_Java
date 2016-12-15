<%-- 
    Document   : index.jsp
    Created on : 15-dic-2016, 17:28:51
    Author     : Anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    </head>
    <body>
        <h1>Aplicacion web</h1>
        
        <form action="servletDatos?action=envioDatos" method="post">
            
            Nombre <input name="nombre" type="text" >
            Edad    <input name="edad" type="number" >
            
            <input value="Enviar" type="submit" >
            
        </form>
        
        <%  if (request.getParameter("action")!=null) { %>
            
            <script>
                    //tomar valores de java a javaScript
                    var saludo="<%= (String)request.getAttribute("saludo") %> ";
                    var mayorEdad="<%= (String)request.getAttribute("mayorEdad") %> ";
                  
                    alert(saludo+" "+mayorEdad);
                    
            </script>
           
            
        <%   } %>
        
    </body>
</html>
