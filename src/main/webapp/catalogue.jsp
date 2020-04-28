<%@ page import="com.directmedia.onlinestore.core.entity.Work" %>
<%@ page import="com.directmedia.onlinestore.core.entity.Artist" %>
<%@ page import="com.directmedia.onlinestore.core.entity.Catalogue" %><%--
  Created by IntelliJ IDEA.
  User: DaVv
  Date: 28/04/2020
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Work lucyInTheSky=new Work("Lucy in the Sky");
    Artist nataliePortman=new Artist("Natalie Portman");
    lucyInTheSky.setMainArtist(nataliePortman);
    lucyInTheSky.setGenre("Drame");
    lucyInTheSky.setRelease(2020);
    lucyInTheSky.setSummary("Une jeune femme, engagée comme nounou de deux orphelins, est convaincue que le manoir dans lequel ils vivent est hanté. Adaptation de la nouvelle Le Tour d'écrou écrite par Henry James.");

    Work badBoysForLife=new Work("Bad boys for life");
    Artist willSmith=new Artist("Will Smith");
    badBoysForLife.setMainArtist(willSmith);
    badBoysForLife.setGenre("comédie");
    badBoysForLife.setRelease(2020);
    badBoysForLife.setSummary("Les Bad Boys Mike Lowrey et Marcus Burnett se retrouvent pour résoudre une ultime affaire.");

    Work theTurning=new Work("The turning");
    Artist mackenzieDavis=new Artist("Mackenzie Davis");
    theTurning.setMainArtist(mackenzieDavis);
    theTurning.setGenre("drame");
    theTurning.setRelease(2020);
    theTurning.setSummary("Une jeune femme, engagée comme nounou de deux orphelins, est convaincue que le manoir dans lequel ils vivent est hanté. Adaptation de la nouvelle Le Tour d'écrou écrite par Henry James.");

    Catalogue catalogue=new Catalogue();
    catalogue.listOfWorks.add(lucyInTheSky);
    catalogue.listOfWorks.add(badBoysForLife);
    catalogue.listOfWorks.add(theTurning);

%>
<html>
<head>
    <title>OnlineStore - catalogue des oeuvres</title>
</head>
<body>
<h1>OnlineStore - catalogue des oeuvres</h1>
<%
 for (Work work:catalogue.listOfWorks) {
%>
<div><%=work.getTitle()%>(<%= work.getRelease()%>)<br/></div>
<%}%>
</body>
</html>

