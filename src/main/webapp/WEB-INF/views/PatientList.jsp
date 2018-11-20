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
    <style>
        <%@include file="/css/table.css"%>
    </style>
</head>
<body>
<h2>Lista pacjentów</h2>
<table align="center">
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

</body>
</html>
