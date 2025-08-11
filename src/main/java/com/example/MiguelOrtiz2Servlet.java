package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MiguelOrtiz2")
public class MiguelOrtiz2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.print("<html><body>\n");
        out.print(
                "<h1>¡Hola profe, mi nombre es Miguel Angel Ortiz, actualmente voy en quinto semestre y me gusta leer!</h1>\n");
        out.print("</body></html>\n");
        out.flush();
    }
}
