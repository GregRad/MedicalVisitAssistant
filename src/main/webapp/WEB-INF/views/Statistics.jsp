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
            <td>
                <c:forEach var="visit" items="${visits}">
                    <c:set var="total" value="${total + visit.charge}"/>
                </c:forEach>
                Dochód: ${total} zł
            </td>
        </tr>
    </table>
    <table>
        <tr>
            <th>Styczeń</th>
            <th>Luty</th>
            <th>Marzec</th>
    </tr>
    <tr>
        <td><a href="/stats/month/01"> >> </a></td>
        <td><a href="/stats/month/02"> >> </a></td>
        <td><a href="/stats/month/03"> >> </a></td>
    </tr>
    </table>
    <table>
        <tr>
            <th>Kwiecień</th>
            <th>Maj</th>
            <th>Czerwiec</th>
        </tr>
        <tr>
            <td><a href="/stats/month/04"> >> </a></td>
            <td><a href="/stats/month/05"> >> </a></td>
            <td><a href="/stats/month/06"> >> </a></td>

        </tr>
    </table>
    <table>
        <tr>
            <th>Lipiec</th>
            <th>Sierpień</th>
            <th>Wrzesień</th>
        </tr>
        <tr>
            <td><a href="/stats/month/07"> >> </a></td>
            <td><a href="/stats/month/08"> >> </a></td>
            <td><a href="/stats/month/09"> >> </a></td>

        </tr>
    </table>
    <table>
        <tr>
            <th>Październik</th>
            <th>Listopad</th>
            <th>Grudzień</th>
        </tr>
        <tr>
            <td><a href="/stats/month/10"> >> </a></td>
            <td><a href="/stats/month/11"> >> </a></td>
            <td><a href="/stats/month/12"> >> </a></td>
        </tr>
    </table>

    <div id="back">
        <a href="/login"> <img src="/images/Arrow.png" alt="cofnij"></a>
    </div>
</body>
</html>
