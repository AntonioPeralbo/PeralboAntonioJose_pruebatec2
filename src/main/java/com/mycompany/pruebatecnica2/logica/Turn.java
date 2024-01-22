package com.mycompany.pruebatecnica2.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Turn implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column( name = "Nombre")
     private String name;
    @Column( name = "fecha")
    private LocalDate date;
     @Column( name = "Estado")
    private String status;
     
    // asociamos la tabla con la tabla cliente a traves de este atributo
   @ManyToOne
     @JoinColumn(name = "client")
     private Client client;

    public Turn() {
    }

    public Turn(String name, LocalDate date, String status  ) {
        this.name = name;
        this.date = date;
        this.status = status;
        
        this.client = client;
    }

   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Turn{" + "id=" + id + ", name=" + name + ", date=" + date + ", status=" + status + ", client=" + client + '}';
    }
     
     
     

}
