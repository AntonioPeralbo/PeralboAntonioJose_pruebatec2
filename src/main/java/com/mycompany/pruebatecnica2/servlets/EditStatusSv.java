package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logica.Controller;
import com.mycompany.pruebatecnica2.logica.Turn;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditStatusSv")
public class EditStatusSv extends HttpServlet {

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
            throws ServletException, IOException { // utilizamos este metodo por el cual mediante una request utilizamos el parametro que nos facilita el usuario para realizar una busqueda en la base de datos. Una vez tenemos el turno , seteamos el cambio de estado.
        int id = Integer.parseInt(request.getParameter("turn"));
        Turn turnEdit = contr.findTurn(id);
        System.out.println(turnEdit);
        String newStatus = "ya-atendido";
        turnEdit.setStatus(newStatus);
        contr.editStatus(turnEdit);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
