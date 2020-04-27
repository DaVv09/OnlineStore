<%--
  Created by IntelliJ IDEA.
  User: DaVv
  Date: 27/04/2020
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Back office Page</title>
</head>
<body>
<div>
    <% String adminLogged=(String)request.getSession().getAttribute("admin");%>
    <p>
        Bonjour <%=adminLogged%>  <a href=\"logout\">(se deconnecter)</a><br/>
    </p>
<a href=\"add-work-form.html\">Ajouter une oeuvre au catalogue</a><br/>
<a href=\"catalogue\">voir le  catalogue</a>
</div>

</body>
</html>
