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
<div id="navigation">
    <a href="/login"><img src="/images/navigation_Main_Page.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigation_Add_Patient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigation_Patient_List.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigation_Visit_List.png" title="Lista wizyt"></a>
</div>
<p>Edytuj wizytę</p>
<div id="form">
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
<br/>
<div id="back">
    <a href="/visit/allVisits"> <img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
