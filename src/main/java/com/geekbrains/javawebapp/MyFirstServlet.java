package com.geekbrains.javawebapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyFirstServlet", urlPatterns = "/MyFirstServletResults.html")
public class MyFirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        String lastName = req.getParameter("lastName");
        String firstName = req.getParameter("firstName");
        String patronymic = req.getParameter("patronymic");
        String birthDay = req.getParameter("birthDay");
        String townShip = req.getParameter("townShip");

        out.printf("<table border = \"1\">" +
                "<tr><td>Last name</td><td>" + lastName + "</td></tr>" +
                "<tr><td>Name</td><td>" + firstName + "</td></tr>" +
                "<tr><td>Patronymic</td><td>" + patronymic +"</td></tr>" +
                "<tr><td>Birth day</td><td>" + birthDay + "</td></tr>" +
                "<tr><td>Township</td><td>" + townShip + "</td></tr>" +
                "</table>");
        out.close();
    }
}
