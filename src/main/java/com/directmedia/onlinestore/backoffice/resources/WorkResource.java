package com.directmedia.onlinestore.backoffice.resources;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Set;

@Path("/work")
public class WorkResource {

    @Produces(MediaType.APPLICATION_JSON)
    @GET

    public Set<Work> liste() {
        if (Catalogue.listOfWorks.isEmpty()) {

            Work lucyInTheSky = new Work("Lucy in the Sky");
            Artist nataliePortman = new Artist("Natalie Portman");
            lucyInTheSky.setMainArtist(nataliePortman);
            lucyInTheSky.setGenre("Drame");
            lucyInTheSky.setRelease(2020);
            lucyInTheSky.setSummary("Une jeune femme, engagée comme nounou de deux orphelins, est convaincue que le manoir dans lequel ils vivent est hanté. Adaptation de la nouvelle Le Tour d'écrou écrite par Henry James.");

            Work badBoysForLife = new Work("Bad boys for life");
            Artist willSmith = new Artist("Will Smith");
            badBoysForLife.setMainArtist(willSmith);
            badBoysForLife.setGenre("comédie");
            badBoysForLife.setRelease(2020);
            badBoysForLife.setSummary("Les Bad Boys Mike Lowrey et Marcus Burnett se retrouvent pour résoudre une ultime affaire.");

            Work theTurning = new Work("The turning");
            Artist mackenzieDavis = new Artist("Mackenzie Davis");
            theTurning.setMainArtist(mackenzieDavis);
            theTurning.setGenre("drame");
            theTurning.setRelease(2020);
            theTurning.setSummary("Une jeune femme, engagée comme nounou de deux orphelins, est convaincue que le manoir dans lequel ils vivent est hanté. Adaptation de la nouvelle Le Tour d'écrou écrite par Henry James.");

            Catalogue catalogue = new Catalogue();
            catalogue.listOfWorks.add(lucyInTheSky);
            catalogue.listOfWorks.add(badBoysForLife);
            catalogue.listOfWorks.add(theTurning);

        }
        return Catalogue.listOfWorks;
    }

    @POST
    public Response add(@FormParam("title") String title, @FormParam("release") int release, @FormParam("genre") String genre, @FormParam("mainArtist") String mainArtist, @FormParam("summary") String summary) {
        Work work = new Work(title);
        //correction
        /* boolean success = true;
        try {
            work.setRelease(release);
        } catch (NumberFormatException nfe) {
            success = false;
        }*/
        work.setRelease(release);
        work.setRelease(release);
        work.setGenre(genre);
        Artist newArtist = new Artist(mainArtist);
        work.setMainArtist(newArtist);
        work.setSummary(summary);
        Catalogue.listOfWorks.add(work);
        return Response.status(201).build();
        //correction
        //return Response.status(Response.Status.CREATED).build();

    }


}
