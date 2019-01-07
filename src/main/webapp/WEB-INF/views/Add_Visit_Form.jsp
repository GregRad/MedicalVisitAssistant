
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
<div id="navigation">
    <a href="/login"><img src="/images/navigation_Main_Page.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigation_Add_Patient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigation_Patient_List.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigation_Visit_List.png" title="Lista wizyt"></a>
</div>
<p> Dodaj wizytę</p>
<div id="form">
    <form:form modelAttribute="visitForm" method="post" action="/visit/addVisit">

        <form:input path="visitDate" class="add" placeholder="Data (wzór: DD/MM/YY HH:MM)"/><br/>
        <form:errors path="visitDate"/>
        <br/>
         <form:input path="charge" class="add" placeholder="Koszt"/><br/>
        <form:errors path="charge"/>
        <br/>
        <form:input path="visitDescription" class="add" placeholder="Opis"/><br/>
        <form:errors path="visitDescription"/>
        <form:hidden path="patientId" /><br/>
        <br/>
        <input type="submit" id="confirm" value="Dodaj"/> <br/>
        <input type="reset" id="clear" value="Wyczyść"/>
    </form:form>
</div>
<br/>
<div id="back">
    <a href="/patients/allPatients"> <img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
