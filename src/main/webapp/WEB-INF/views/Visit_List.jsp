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
    <title>Lista wizyt</title>
    <link rel="stylesheet" href="/css/table.css">
</head>
<body>
<div id="navigation">
    <a href="/login"><img src="/images/navigation_Main_Page.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigation_Add_Patient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigation_Patient_List.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigation_Visit_List.png" title="Lista wizyt"></a>
</div>
<p>Lista wizyt</p>
<div id="table">
    <table>
    <th>ID</th>
    <th>Pacjent</th>
    <th>Data</th>
    <th>Opis</th>
    <th>Cena</th>
    <th>Edytuj</th>
    <th>Usuń</th>
    <tr>
<c:forEach items="${visits}" var="visit">
        <td>
            ${visit.id}
        </td>
        <td>
            ${visit.patientDetails}
        </td>
        <td>
            ${visit.visitDate}
        </td>
        <td>
            ${visit.visitDescription}
        </td>
         <td>
            ${visit.charge}
        </td>
         <td>
        <a href="/visit/edit/${visit.id}">edytuj</a>
         </td>
        <td>
        <a href="/visit/delete/${visit.id}">usuń</a>
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
