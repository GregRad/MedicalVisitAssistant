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
    <link rel="stylesheet" href="/css/newForm.css">
</head>
<body>
<div id="navigation">
    <a href="/login"><img src="/images/navigation_Main_Page.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigation_Add_Patient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigation_Patient_List.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigation_Visit_List.png" title="Lista wizyt"></a>
</div>
<p> Edytuj pacjenta</p>
<div id="patient">
    <div id="data">
        <h4>Edytuj dane kontaktowe: </h4>
        <br/>
        <form:form modelAttribute="editForm" method="post">
            <form:input class="add" path="name" placeholder="Imię"/><br/>
            <br/>
            <form:input class="add" path="surname" placeholder="Nazwisko"/><br/>
            <br/>
            <form:input class="add" path="address" placeholder="Ulica"/><br/>
            <br/>
            <form:input class="add" path="houseNumber" placeholder="Numer domu"/><br/>
             <br/>
            <form:input class="add" path="apartmentNumber" placeholder="Numer mieszkania"/><br/>
            <br/>
            <form:input class="add" path="phoneNumber" placeholder="Numer telefonu"/><br/>
            <br/>
            <form:input class="add" path="email" placeholder="E-mail"/><br/>
            <br/>
            <br/>
        <input type="submit" id="confirm" value="Dodaj"/>
        <input type="reset" id="clear" value="Wyczyść"/>
        </form:form>
        <br/>
    </div>
</div>
<br/>
<div id="back">
    <a href="/patients/allPatients"> <img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
