package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logica.Client;
import com.mycompany.pruebatecnica2.logica.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/NewTurnSV")
public class NewTurnSV extends HttpServlet {
    Controller contr = new Controller();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //solicitamos por parametro el atributo dni 
        String dni = request.getParameter("dni");
        Client client = null;
        
        // realizamos una busqueda en la bbdd para comprobar que se corresponde con un cliente ya creado
        List <Client> lista = contr.showAllClients(); 
        for (Client filtrerClient : lista) {
            if (filtrerClient.getDni().equals(dni)){
            client = filtrerClient;
            }
            
        }
        
        if (client == null) {
            // sino se corresponde con ninguno mandamos de vuelta a la pagina de inicio
            response.sendRedirect("index.jsp");
        } else {
            // si coincide lo guardamos y enviamos a la pagina de crear el turno donde se asocia al cliente que hemos introducido
            HttpSession misesion = request.getSession();
            misesion.setAttribute("client", client);
            response.sendRedirect("newTurn.jsp");
        }
          

        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
