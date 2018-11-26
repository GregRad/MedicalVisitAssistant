<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 15.11.18
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edytuj wizytę</title>
    <link rel="stylesheet" href="/css/visit.css"/>
</head>
<body>
<p>Edytuj wizytę</p>
<div>
    <form:form modelAttribute="editVisitForm" method="post"><br/>
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
<div>
    <a href="/visit/allVisits">cofnij</a>
</div>
</body>
</html>
