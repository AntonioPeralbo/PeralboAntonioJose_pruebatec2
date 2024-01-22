

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba Tecnica</title>
    </head>
    <body>
        <h1>Gestion Tramites del Gobierno</h1>
        <h3>Alta Usuario</h3>
        <p>Para dar de alta su usuario en la plataforma debe rellenar todos los campos</p>
        <div>
            <h4>Crear Usuario</h4>
            <form action="ClientSv" method="POST">
                <label for="nombre">Nombre:</label>
                <input type="text" name="name" required>
                <br>
                <label for="nombre">Apellido:</label>
                <input type="text" name="lastName" required>
                <br>
                <label for="nombre">DNI:</label>
                <input type="text" name="dni" required>
                <br>
                <input type="submit" value="Registrar Usuario">
            </form>
        </div>
    </body>
</html>
