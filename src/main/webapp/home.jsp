<%--
  Created by IntelliJ IDEA.
  User: DaVv
  Date: 27/04/2020
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>OnlineStore - Accueil du Back office</title>
</head>
<body>
<h1>OnlineStore - gestion de la boutique</h1>
<div>
    <% String adminLogged = (String) session.getAttribute("admin");
        if (adminLogged != null) {
    %>
    Bonjour ${sessionScope.admin} <a href="logout">(se deconnecter)</a><br/>
    <%}%>
    <a href="add-work-form.html">Ajouter une oeuvre au catalogue</a><br/>
    <a href="catalogue.jsp">voir le catalogue</a>
</div>

</body>
</html>
