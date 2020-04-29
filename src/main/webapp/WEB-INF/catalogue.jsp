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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>OnlineStore - catalogue des oeuvres</title>
</head>
<body>
<h1>OnlineStore - catalogue des oeuvres</h1>

<c:forEach items="${listeOeuvre}" var="work">
    <div>${work.title} (${work.release})<br/></div>
</c:forEach>

</body>
</html>

