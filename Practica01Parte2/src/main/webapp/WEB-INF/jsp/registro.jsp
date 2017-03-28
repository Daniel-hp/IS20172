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
        <h1>Regístrate</h1>
        <hr>
        <form method="GET" action="/Clase1/reg">
            <input id="nombre" name="nombre" type="text" placeholder="nombre"><br>
            <input id="carrera" name="carrera" type="text" placeholder="carrera"><br>
            Fecha de nacimiento<br>
            <input id="fecha" name="fecha" type="date" placeholder="fecha"><br>
            <input id="correo" name="correo" type="email" placeholder="correo"><br>
            <input id="pass" name="pass" type="password" placeholder="pass"><br>
            <button>Aceptar</button>
        </form>
        <br><hr>
    </body>
</html>
