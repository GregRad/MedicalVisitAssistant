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
    <style><%@include file="/css/form.css"%></style>
</head>
<body>
<h2>Edytuj wizytę</h2>
<div>
    <form:form modelAttribute="editVisitForm" method="post"><br/>
        Data:<br/>
        <input type="datetime-local" id="visitDateRaw" name="visitDateRaw"/><br/>
        Koszt:<br/>
        <form:input path="charge"/><br/>
        Opis:<br/>
        <form:input path="visitDescription"/><br/>
        <form:hidden path="patientId" /><br/>
        <input type="submit" value="Zapisz"/>
    </form:form>
</div>
</body>
</html>
