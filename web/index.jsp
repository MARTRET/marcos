<%-- 
    Document   : index
    Created on : 26-10-2018, 20:46:06
    Author     : RLCR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesion/title>
    </head>
    <body>
        <form name="formulario" action="IniciarSesion" method="Post">
           
            <div style="width:600px; text-align: center;"> iniciar sesion;n</div> 
            <div style="width: 600px;"> 
                Nombre de ususario:razor3000;
                <input type="text" id="Usuario" name="txtUsuario" value="" />
            </div>
            
            <div style="width:600px;">
            Contraseña:razor3000;
            <input type="password" id="pass" name="pwdPass" value=""/>
            
            </div>
            
             <div style="widch:600px">   
                 <a href="registrar.jsp">Resgistrar</a>
                <input type="button" value="inicio de sesion"/>
                
    </body>
</html>
