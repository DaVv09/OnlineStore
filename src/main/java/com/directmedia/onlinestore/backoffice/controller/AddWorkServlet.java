package com.directmedia.onlinestore.backoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

import javax.servlet.RequestDispatcher;
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

        try {
            // recuperation des donnée du formulaire
            String title = req.getParameter("title");
            int releaseDate = Integer.parseInt(req.getParameter("release"));
            String genre = req.getParameter("genre");
            String mainArtistName = req.getParameter("mainArtist");
            String summary = req.getParameter("summary");

            // vérification doublons
            for (Work work : Catalogue.listOfWorks) {
                if (work.getTitle().equals(title) && work.getRelease() == releaseDate && work.getGenre().equals(genre) && work.getMainArtist().getName().equals(mainArtistName) && work.getSummary().equals(summary)) {
                    throw new IOException();
                }
            }
            Work work = new Work();
            work.setTitle(title);
            work.setRelease(releaseDate);
            work.setGenre(genre);
            work.setMainArtist(new Artist(mainArtistName));
            work.setSummary(summary);
            Catalogue.listOfWorks.add(work);
            req.setAttribute("nouvelleOeuvre", work);
            RequestDispatcher disp=null;
            disp = req.getRequestDispatcher("/SucessAddWork");
            //disp = req.getRequestDispatcher("/test");
            disp.forward(req, resp);
        } catch (IOException | NumberFormatException e) {
            RequestDispatcher disp = req.getRequestDispatcher("/failureAddWork");
            disp.forward(req, resp);
        }
    }
}


