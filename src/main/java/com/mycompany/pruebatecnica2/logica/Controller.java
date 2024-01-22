package com.mycompany.pruebatecnica2.logica;

import com.mycompany.pruebatecnica2.persistencia.PersistenceController;
import java.util.List;

public class Controller {

    PersistenceController controlPersis = new PersistenceController();
// metodos para clase usar en la entidad cliente

    public void createCliente(Client cliente) {//crear
        controlPersis.createCliente(cliente);
    }

    public List<Client> showAllClients() {//mostrar todos
        return controlPersis.showAllClients();
    }

// metodos para clase usar en la entidad cliente
    public void createTurn(Turn turn) { //crear
        controlPersis.createTurn(turn);
    }

    public List<Turn> showAllTurn() {//mostrar todos
        return controlPersis.showAllTurn();
    }

    public void editStatus(Turn turn) {//Editar estado
        controlPersis.editStatus(turn);
    }

    public Turn findTurn(int id) {//Buscar un turno
        return controlPersis.findTunr(id);
    }

    public void deleteTurn(int id) {// eliminar
        controlPersis.deleteTurn(id);
    }

}
