


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PruebaTecnica</title>

    </head>
    <body>
        <h1>Gestion de Tramites del Gobierno</h1>

        <h2>Alta Usuario</h2> 

        <p>Para dar de alta pulse en el siguiente botón</p>
        <form action="NewClientSv" method="POST">
            <input type="submit" value="Nuevo Usuario" name="nuevo" />
            <h2>Nuevo Tramite</h2>
        </form>        
        <p>Introduzca el DNI para comernzar con el alta del trámite</p>
        <form action="NewTurnSV" method="GET">
            <label for="dni">DNI Usuario:</label>
            <input type="text" name="dni" required>
            <input type="submit" value="Enviar">
        </form>
        <h2>Flitro</h2>
        <p>Rellene los siguientes campos para realizar el filtro</p>
        <form action="TurnSv" method="GET">
            <label for="nombre">Fecha:</label>
            <input type="date" name="date" required>
            <br>
            <label for="nombre">Estado</label>
            <select id="nombre" name="status" >
                <option value="en-espera">En Espera</option>
                <option value="ya-atendido">Ya antendido</option>
            </select>
            <input type="submit" value="Mostrar" name="mostrar" />
        </form>
        <h2>Editar estado</h2>
    </form>        
    <p>Introduzca el turno que desea actualizar a "Ya atendido"</p>
    <form action="EditStatusSv" method="POST">
        <label for="turn">Turno que desea actualizar:</label>
        <input type="text" name="turn" required>
        <input type="submit" value="Enviar">
    </form>
     <h2>Eliminar trámite</h2>
    <form action="DeleteTurnSV" method="POST">
        <label for="turn">Trámite que desea eliminar</label>
        <input type="text" name="turn" required>
        <input type="submit" value="Enviar">
    </form>
     
</body>
</html>
