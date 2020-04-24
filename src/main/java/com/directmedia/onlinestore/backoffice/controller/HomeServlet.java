package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        out.print("<html>");
        out.print(" <head>");
        out.print("<title>Back-Office HomeServlet</title>");
        out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.print("</head>");
        out.print("<body>");
        out.print("Bonjour "+req.getSession().getAttribute("admin")+"<br/>");
        out.print("<a href=\"add-work-form.html\">Ajouter une oeuvre au catalogue</a><br/>");
        out.print("<a href=\"catalogue\">voir le  catalogue</a>");
        out.print("</body>");
        out.print("</html>");
    }
}


