package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WorkAddedSuccessServlet", urlPatterns = {"/addFailure"})
public class WorkAddedFailureServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        out.print("<html>");
        out.print(" <head>");
        out.print("<title>Erreur</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("Une erreur est survenue, l’oeuvre n’a pas été ajoutée <a href=\"home\">retour vers la page d'accueil</a> ");
        out.print("</body>");
        out.print("</html>");
    }
}

