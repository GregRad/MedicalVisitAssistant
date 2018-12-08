<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 04.12.18
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
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
<p> Edytuj kartę pacjenta</p>
<div id="patient">
    <div id="card">
        <h4>Edytuj kartę badania:</h4>
        <br/>
        <form:form modelAttribute="editCardForm" method="post">
        <form:input class="add" path="diagnosis" placeholder="Rozpoznanie"/><br/>
        <br/>
        <form:input class="add" path="symptoms" placeholder="Objawy"/><br/>
        <br/>
        <form:input class="add" path="diseases" placeholder="Choroby współistniejące"/><br/>
        <br/>
        <form:input class="add" path="functioning" placeholder="Funkcjonowanie"/><br/>
        <br/>
        <form:input class="add" path="activity" placeholder="Aktywność fizyczna"/><br/>
        <br/>
        <form:input class="add" path="rehab" placeholder="Dotychczasowa rehabilitacja"/><br/>
        <br/>
        <form:input class="add" path="medicines" placeholder="Leki"/><br/>
        <br/>
        <form:input class="add" path="procedures" placeholder="Zabiegi operacyjne, urazy"/><br/>
        <br/>
        <form:input class="add" path="drugs" placeholder="Używki"/><br/>
        <br/>
        <form:textarea class="add" path="exam" placeholder="Badanie"/><br/>
        <br/>
        <input type="submit" id="confirm" value="Dodaj"/>
        <input type="reset" id="clear" value="Wyczyść"/>
        </form:form>
    </div>
</div>
<br/>
<div id="back">
    <a href="/patients/allPatients"> <img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
