<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 14.11.18
  Time: 09:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista pacjentów</title>
<link rel="stylesheet" href="/css/table.css">
</head>
<body>
<div id="navigation">
    <a href="/login"><img src="/images/navigationMainPage.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigationAddPatient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigationPatientList.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigationVisitList.png" title="Lista wizyt"></a>
</div>
<p>Lista pacjentów</p>
<div id="table">
<table>
    <th>ID</th>
    <th>Imię</th>
    <th>Nazwisko</th>
    <th>Wyświetl kartę</th>
    <th>Dodaj wizytę</th>
    <th>Edytuj</th>
    <th>Usuń</th>

        <c:forEach items="${patients}" var="patient">
            <tr>
                <td>
                        ${patient.id}
                </td>
                <td>
                        ${patient.name}
                </td>
                <td>
                        ${patient.surname}
                </td>
                <td>
                        <a href="/patients/card/${patient.id}">wyświetl</a>
                </td>
                <td>
                        <a href="/visit/addVisit/${patient.id}">dodaj</a>
                </td>
                <td>
                        <a href="/patients/edit/${patient.id}">edytuj</a>
                </td>
                <td>
                         <a href="/patients/delete/${patient.id}">usuń</a>
                </td>
            </tr>
        </c:forEach>
</table>
</div>
<div id="back">
    <a href="/login"> <img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
