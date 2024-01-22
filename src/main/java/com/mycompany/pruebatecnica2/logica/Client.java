
package com.mycompany.pruebatecnica2.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //usamos int al ser una prueba tecnina y no requerir de un uso muy alto de ejemplos. 
   @Column(name = "Nombre")
    private String name;
   @Column(name = "Apellido")
   private String lastName;
   
    private String dni;// utilizamos como string una variable que sera numérica ya que no necesitaremos usar operaciones aritmeticas con ella.

@OneToMany  (mappedBy = "client")     
private List<Turn> turns;
    
    public Client() {
    }

    public Client(String name, String lastName, String dni,Client client ) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
       this.turns = turns;
    }

    public List<Turn> getTurns() {
        return turns;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", dni=" + dni +  '}';
    }
    


    
}
