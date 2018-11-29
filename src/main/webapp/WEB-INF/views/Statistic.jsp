<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 14.11.18
  Time: 09:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statystyki</title>
    <style><%@include file="/css/table.css"%></style>
</head>
<body>
<div>
    <a href="/login"><img src="/images/navigationMainPage.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigationAddPatient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigationPatientList.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigationVisitList.png" title="Lista wizyt"></a>
</div>
    <table>
        <%-- Widzę tutaj ambitny plan menedżera finansowego :D trzymam kciuki! --%>
        <th>Ilość wizyt</th>
        <th>Dochód</th>
        <tr>
            <td>
                0
            </td>
            <td>
                0
            </td>
        </tr>
    </table>
</body>
</html>
