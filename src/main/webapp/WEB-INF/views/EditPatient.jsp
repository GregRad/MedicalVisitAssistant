<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 14.11.18
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edycja danych pacjenta</title>
    <style><%@include file="/css/form.css"%></style>
</head>
<body>
<h2>Edytuj pacjenta</h2>
<div>
    <form:form modelAttribute="editForm" method="post">
        <h3> Dane kontaktowe: </h3>
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
        <br/>
        <h3> Karta badania: </h3>
        Rozpoznanie: <br/>
        <form:input path="diagnosis"/><br/>
        Objawy: <br/>
        <form:input path="symptoms"/><br/>
        Choroby współistniejące: <br/>
        <form:input path="diseases"/><br/>
        Funkcjonowanie: <br/>
        <form:input path="functioning"/><br/>
        Dotychczasowa rehabilitacja: <br/>
        <form:input path="rehab"/><br/>
        Leki:<br/>
        <form:input path="medicines"/><br/>
        Zabiegi operacyjne, urazy: <br/>
        <form:input path="procedures"/><br/>
        Używki: <br/>
        <form:input path="drugs"/><br/>
        Badanie: <br/>
        <form:textarea path="exam"/><br/>
        <input type="submit" value="Zapisz"/>
        <br/>
    </form:form>
</div>
</body>
</html>
