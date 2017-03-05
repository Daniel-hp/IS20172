<%-- 
    Document   : inicio
    Created on : 20/02/2017, 11:08:36 PM
    Author     : jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h1>Inicia Sesión</h1>
        <hr>
        <form method="GET" action="/Clase1/ini">
            <input id="correo" name="correo" type="email" placeholder="Correo">
            <br>
            <input id="pass" name="pass" type="password" placeholder="Contraseña"><br>
            <button>Aceptar</button>
            <br>
            <button>Registrarse</button>
        </form>
        <br><hr>
    </body>
</html>