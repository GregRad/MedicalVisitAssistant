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
    <style><%@include file="/css/table.css"%></style>
</head>
<body>
<h2>Lista wizyt</h2>
<table align="center">
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

</body>
</html>
