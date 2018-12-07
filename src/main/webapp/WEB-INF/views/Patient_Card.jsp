
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 19.11.18
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Karta Pacjenta</title>
    <link rel="stylesheet" href="/css/table.css">
</head>
<body>
<div id="navigation">
    <a href="/login"><img src="/images/navigation_Main_Page.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigation_Add_Patient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigation_Patient_List.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigation_Visit_List.png" title="Lista wizyt"></a>
</div>
<p>${patientsCard.patientData}</p>

<table>
    <th>Rozpoznanie:</th>
    <th>Objawy:</th>
    <th>Choroby współistniejące:</th>
    <th>Funkcjonowanie:</th>
    <th>Dotychczasowa rehabilitacja:</th>
    <th>Leki:</th>
    <th>Zabiegi operacyjne, urazy:</th>
    <th>Używki:</th>
    <tr>
        <td>
            ${patientsCard.diagnosis}
        </td>
        <td>
            ${patientsCard.symptoms}
        </td>
        <td>
            ${patientsCard.diseases}
        </td>
        <td>
            ${patientsCard.functioning}
        </td>
        <td>
            ${patientsCard.rehab}
        </td>
        <td>
            ${patientsCard.medicines}
        </td>
        <td>
            ${patientsCard.procedures}
        </td>
        <td>
            ${patientsCard.drugs}
        </td>

    </tr>
</table>
<table>
    <th>Badanie: </th>
    <tr>
        <td>
            ${patientsCard.exam}
        </td>
    </tr>
</table>
<br/>
<table>
    <th>
        Wizyty
    </th>
        <tr>
            <td>
                <a href="/visit/patientVisit/${patientsCard.id}">wyświetl</a>
            </td>
        </tr>
    </th>
</table>
<br/>
<div id="back">
    <a href="/patients/allPatients"><img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
