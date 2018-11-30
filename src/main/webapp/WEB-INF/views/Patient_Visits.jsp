
<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 21.11.18
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wizyty</title>
    <link rel="stylesheet" href="/css/table.css">
</head>
<body>
<div id="navigation">
    <a href="/login"><img src="/images/navigationMainPage.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigationAddPatient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigationPatientList.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigationVisitList.png" title="Lista wizyt"></a>
</div>
<p>Wizyty</p>
<table>
    <th>ID</th>
    <th>Data</th>
    <th>Opis</th>
    <th>Cena</th>

<c:forEach items= "${patientVisits}" var="visit">
    <tr>
    <td>
            ${visit.id}
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
    </tr>
</c:forEach>
</table>
<div id="back">
<a href="/patients/allPatients"><img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
