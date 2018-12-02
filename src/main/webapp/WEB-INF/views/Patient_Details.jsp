<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 02.12.18
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dane pacjenta</title>
</head>
<body>
<div id="navigation">
    <a href="/login"><img src="/images/navigation_Main_Page.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigation_Add_Patient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigation_Patient_List.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigation_Visit_List.png" title="Lista wizyt"></a>
</div>
<p>Karta Pacjenta</p>
<table>
    <th>Ulica</th>
    <th>Numer domu</th>
    <th>Numer mieszkania</th>
    <th>Numer telefonu</th>
    <th>Email</th>

    <tr>
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
<div id="back">
    <a href="/patients/allPatients"><img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
