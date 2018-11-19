
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
    <style><%@include file="/css/form.css"%></style>
</head>
<body>
<h2> Dodaj wizytę</h2>
<div>
    <form:form modelAttribute="visitForm" method="post" action="/visit/addVisit">
        Data:<br/>
        <input type="datetime-local" id="visitDateRaw" name="visitDateRaw"/><br/>
        Koszt:<br/>
         <form:input path="charge"/><br/>
        Opis:<br/>
        <form:input path="visitDescription"/><br/>
        <form:hidden path="patientId" /><br/>
        <input type="submit" value="Dodaj"/>
        <input type="reset" value="Wyczyść"/>
    </form:form>
</div>

</body>
</html>
