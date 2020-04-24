package com.directmedia.onlinestore.backoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddWorkServlet", urlPatterns = {"/add-work"})
public class AddWorkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();


        Work work=new Work();
        work.setTitle(req.getParameter("title"));
        work.setRelease(Integer.parseInt(req.getParameter("release")));
        work.setGenre(req.getParameter("genre"));
        work.setMainArtist(new Artist(req.getParameter("mainArtist")));
        work.setSummary(req.getParameter("summary"));
        Catalogue.listOfWorks.add(work);


        resp.setContentType("text/html;charset=UTF-8");
        out.print("<html>");
        out.print(" <head>");
        out.print("<title>Nouvelle oeuvre ajoutée</title>");
        out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div>nouvelle oeuvre ajoutée avec succes avec l'id: "+Work.getLastId()+"</div><br/>");
        out.print("<a href=\"home\">retour a la page d'accueil</a>");
        out.print("</body>");
        out.print("</html>");
    }
}


