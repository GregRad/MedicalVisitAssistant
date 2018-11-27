
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 15.11.18
  Time: 00:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj wizytę</title>
    <link rel="stylesheet" href="/css/visit.css"/>
</head>
<body>
<p> Dodaj wizytę</p>
<div>
    <form:form modelAttribute="visitForm" method="post" action="/visit/addVisit">
        <br/>
        <input type="datetime-local" class="add" name="visitDateRaw" placeholder="Data"/><br/>
        <br/>
         <form:input path="charge" class="add" placeholder="Koszt"/><br/>
        <br/>
        <form:input path="visitDescription" class="add" placeholder="Opis"/><br/>
        <form:hidden path="patientId" /><br/>
        <input type="submit" id="confirm" value="Dodaj"/> <br/>
        <input type="reset" id="clear" value="Wyczyść"/>
    </form:form>
</div>
<br/>
<div>
    <a href="/patients/allPatients"> <img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
