<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 14.11.18
  Time: 09:09
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
            ${fn:length(visits)}
            </td>
            <c:forEach var="visit" items="${visits}">
                <c:set var="total" value="${total + visit.charge}"/>
            </c:forEach>
            <td> Dochód: ${total} zł
            </td>
        </tr>
    </table>
    <table>
        <tr>
            <th colspan="2">Styczeń</th>
            <th colspan="2">Luty</th>
            <th colspan="2">Marzec</th>
    </tr>
    <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
    </tr>
    </table>
    <table>
        <tr>
            <th colspan="2">Kwiecień</th>
            <th colspan="2">Maj</th>
            <th colspan="2">Czerwiec</th>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </table>
    <table>
        <tr>
            <th colspan="2">Lipiec</th>
            <th colspan="2">Sierpień</th>
            <th colspan="2">Wrzesień</th>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </table>
    <table>
        <tr>
            <th colspan="2">Październik</th>
            <th colspan="2">Listopad</th>
            <th colspan="2">Grudzień</th>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </table>

    <div id="back">
        <a href="/login"> <img src="/images/Arrow.png" alt="cofnij"></a>
    </div>
</body>
</html>
