<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 10.01.19
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statystyki</title>
    <link rel="stylesheet" href="/css/table.css">
</head>
<body>
<div id="navigation">
    <a href="/login"><img src="/images/navigation_Main_Page.png" title="Strona głowna"></a>
    <a href="/patients/addPatient"><img src="/images/navigation_Add_Patient.png" title="Dodaj pacjenta"></a>
    <a href="/patients/allPatients"><img src="/images/navigation_Patient_List.png" title="Lista pacjentów"></a>
    <a href="/visit/allVisits"><img src="/images/navigation_Visit_List.png" title="Lista wizyt"></a>
</div>
<p>Statystyki</p>
<div id="table">
    </br>
    <table>
        <tr>
            <th colspan="2">Ogólne</th>
        </tr>
        <tr>
            <td> Ilośc wizyt:
                ${fn:length(month)}
            </td>
            <td>
                <c:forEach var="month" items="${month}">
                    <c:set var="total" value="${total + month.charge}"/>
                </c:forEach>
                Dochód: ${total} zł
            </td>
        </tr>
    </table>
    <div id="back">
        <a href="/stats/summary"> <img src="/images/Arrow.png" alt="cofnij"></a>
    </div>
</body>
</html>