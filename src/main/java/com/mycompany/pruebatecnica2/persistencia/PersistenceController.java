package com.mycompany.pruebatecnica2.persistencia;

import com.mycompany.pruebatecnica2.logica.Client;
import com.mycompany.pruebatecnica2.logica.Turn;
import com.mycompany.pruebatecnica2.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    ClientJpaController clientJPA = new ClientJpaController();
    TurnJpaController turnJPA = new TurnJpaController();

    // metodos para clase usar en la entidad cliente
    
    
    public void createCliente(Client client) {
        clientJPA.create(client);
    }

    public List<Client> showAllClients() {
        return clientJPA.findClientEntities();
    }
// metodos para clase usar en la entidad turno
    
    public List<Turn> showAllTurn() {
        return turnJPA.findTurnEntities();
    }

    public void createTurn(Turn turn) {
        turnJPA.create(turn);
    }

    public void editStatus(Turn turn) {
        try {
            turnJPA.edit(turn);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Turn findTunr(int id) {
        return turnJPA.findTurn(id);
    }

    public void deleteTurn(int id) {
        try {
            turnJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
