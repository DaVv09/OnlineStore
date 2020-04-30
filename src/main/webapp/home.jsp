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
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="js/jquery-3.5.0.min.js"></script>
    <script src="js/application.js"></script>
    <title>OnlineStore - Accueil du Back office</title>
</head>
<body>
<h1>OnlineStore - gestion de la boutique</h1>
    <c:if test="${not empty admin}">
        Bonjour ${sessionScope.admin} <a href="logout">(se deconnecter)</a><br/>
    </c:if>
    <a href="add-work-form.html">Ajouter une oeuvre au catalogue</a><br/>
    <a href="catalogue">Afficher le catalogue</a><br/>
</body>
</html>
