package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AuthenticationServlet", urlPatterns = {"/login"})
public class AuthenticationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // recupération des infos de connexion du formulaire login.html
        String user = req.getParameter("username");
        String pass = req.getParameter("password");



        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        out.print("<html>");
        out.print(" <head>");
        out.print("<title>Authentification correcte</title>");
        out.print("</head>");
        out.print("<body>");



        if (user.equals("michel") && pass.equals("123456")||user.equals("caroline") && pass.equals("abcdef")) {
            // recupération de l'ID session
            HttpSession session=req.getSession();
            session.setAttribute("admin",user);


            out.print("<a href=\"home\">acceder au panel admin</a>");

        } else {

            out.print(" <head>");
            out.print("<title>Page de login admin</title>");
            out.print("</head>");
            out.print("<div> login / mdp erroné  </div><br/>");
            out.print("<a href=\"login.html\">ré-essayer de s'identifié</a>");

        }
        out.print("</body>");
        out.print("</html>");

    }
}


