
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
    <style><%@include file="/css/table.css"%></style>
</head>
<body>
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
</body>
</html>
