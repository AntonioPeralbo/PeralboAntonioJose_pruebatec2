package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logica.Client;
import com.mycompany.pruebatecnica2.logica.Controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ClientSv")
public class ClientSv extends HttpServlet {

    Controller contr = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//seteamos a traves de los datos obtenidos por parametro los atributos de la entidad cliente para usar el metodo create y generar el dato en la base de datos
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String dni = request.getParameter("dni");

        Client client = new Client();

        client.setName(name);
        client.setLastName(lastName);
        client.setDni(dni);
        System.out.println(client.getName());
        contr.createCliente(client);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
