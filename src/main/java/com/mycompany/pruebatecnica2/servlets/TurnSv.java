package com.mycompany.pruebatecnica2.servlets;

import com.mycompany.pruebatecnica2.logica.Client;
import com.mycompany.pruebatecnica2.logica.Controller;
import com.mycompany.pruebatecnica2.logica.Turn;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TurnSv")
public class TurnSv extends HttpServlet {

    Controller contr = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Extraemos de la tabla tunos los elementos 
        List<Turn> list = contr.showAllTurn();
        //solicitamos por parametro los filtros que vamos a aplicar
        LocalDate date = LocalDate.parse(request.getParameter("date"));
        String status = request.getParameter("status");
        //aplicamos los filtros
        List<Turn> streamList = list.stream()
                .filter(list2 -> list2.getDate().equals(date))
                .collect(Collectors.toList());
        List<Turn> statusList = streamList.stream()
                .filter(list3 -> list3.getStatus().equals(status))
                .collect(Collectors.toList());

        // el resultado lo utilizamos para crear la tabla en el jsp
        HttpSession misesion = request.getSession();
        misesion.setAttribute("list", statusList);

        response.sendRedirect("showTurns.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //solicitamos por parametro los atributos que vamos a setear
        String name = request.getParameter("name");
        LocalDate date = LocalDate.parse(request.getParameter("date"));
        String status = request.getParameter("status");
        HttpSession misesion = request.getSession();

        // asociamos el cliente que se indica por parametro al turno que vamos a crear.
        Client client = (Client) misesion.getAttribute("client");

        // creacion del objeto y seteo de atributos
        Turn turn = new Turn();

        turn.setName(name);
        turn.setDate(date);
        turn.setStatus(status);
        turn.setClient(client);
        contr.createTurn(turn);

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
