
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
    <style>
        <%@include file="/css/table.css"%>
    </style>
</head>
<body>
<h2>Karta Pacjenta</h2>
<table align="center">
    <th>ID</th>
    <th>Imię</th>
    <th>Nazwisko</th>
    <th>Ulica</th>
    <th>Numer domu</th>
    <th>Numer mieszkania</th>
    <th>Numer telefonu</th>
    <th>Email</th>

        <tr>
            <td>
                    ${patients.id}
            </td>
            <td>
                    ${patients.name}
            </td>
            <td>
                    ${patients.surname}
            </td>
            <td>
                    ${patients.address}
            </td>
            <td>
                    ${patients.houseNumber}
            </td>
            <td>
                    ${patients.apartmentNumber}
            </td>
            <td>
                    ${patients.phoneNumber}
            </td>
            <td>
                    ${patients.email}
            </td>

        </tr>
</table>
<br/>
<table>
    <th>Badanie</th>
    <tr>
        <td>
            ${patients.medicalExam}
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
                <%--<iframe src="/visit/patientVisit/${patients.id}"></iframe>--%>
                <a href="/visit/patientVisit/${patients.id}">wyświetl</a>
            </td>
        </tr>
    </th>
</table>
</body>
</html>
