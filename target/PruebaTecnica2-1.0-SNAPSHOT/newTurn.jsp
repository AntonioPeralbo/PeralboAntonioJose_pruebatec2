

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba Tecnica</title>
    </head>
    <body>
        <h2>Registrar tramite</h2>
        <form action="TurnSv" method="POST">
            <label for="name">Nombre:</label>
            <select id="name" name="name" > <!-- optamos por un select para que unicamente deba seleccionar una opcion y no tenga que escribir nada. -->
                <option value="renovacion DNI">renovacion DNI</option>
                <option value="renovacion Pasaporte">renovacion Pasaporte</option>
                <option value="cambio de padron">cambio de padron</option>
                <option value="otras consultas">otras consultas</option>
            </select>
            <br>
            <label for="date">Fecha:</label>
            <input type="date" name="date" required>
            <br>
            <label for="status">Estado</label>
            <select id="status" name="status" ><!-- Aparece como preselecionado en espera puesto que los turnos deben comenzar asi. -->
                <option value="en-espera">En Espera</option>
                <option value="ya-atendido">Ya antendido</option><!-- Añadimos este campo por si se debiera crear de forma excepcional algun turno ya realizado sin haberlo registrado -->
            </select>
            <br>
            <input type="submit" value="Registrar">
        </form>

    </body>
</html>
