package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logica.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteTurnSV")
public class DeleteTurnSV extends HttpServlet {

    Controller contr = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        // solicitamos por parametro el turno que se desea borrar y a traves del metodo deleteTurn lo eliminamos de la base de datos
        int id = Integer.parseInt(request.getParameter("turn"));
        contr.deleteTurn(id);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
