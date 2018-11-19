<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  Created by IntelliJ IDEA.
  User: radles
  Date: 14.11.18
  Time: 09:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj pacjenta</title>
    <style><%@include file="/css/form.css"%></style>
</head>
<body>
<h2> Dodaj pacjenta</h2>
<div>
    <form:form modelAttribute="patientForm" method="post">
        Imię:<br/>
        <form:input path="name"/><br/>
        Nazwisko:<br/>
        <form:input path="surname"/><br/>
        Ulica:<br/>
        <form:input path="address"/><br/>
        Numer domu:<br/>
        <form:input path="houseNumber"/><br/>
        Numer mieszkania:<br/>
        <form:input path="apartmentNumber"/><br/>
        Numer telefonu:<br/>
        <form:input path="phoneNumber"/><br/>
        E-mail:<br/>
        <form:input path="email"/><br/>

        <input type="submit" value="Dodaj"/>
        <input type="reset" value="Wyczyść"/>
    </form:form>
</div>
</body>
</html>
