<%--
  Created by IntelliJ IDEA.
  User: radles
  Date: 14.11.18
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona głowna</title>
   <link rel="stylesheet" href=/css/mainPage.css>
</head>
<body>

<div id="box">
   <c:if test="${not empty loggedUser}">
      <div id="hello">

         <p >Witaj, ${loggedUser.login}</p>
      </div>
       <p id="logout"><a href="/logout"><img src="/images/Log_Out.png"></a></p>
   </c:if>
    <div id="tile">
         <div class="row">
             <div class="column"><a href="/patients/addPatient"><img src="/images/Add_Patient_Main.png" alt="Dodaj pacjenta" width="222px" height="222px" title="Dodaj pacjenta"/></a></div>
             <div class="column"><a href="/patients/allPatients"><img src="/images/Patient_List_Main.png" alt="Lista pacjentów" width="222px" height="222px" title="Lista pacjentów"/></a></div>
         </div>
         <div class="row">
             <div class="column"><a href="/visit/allVisits"><img src="/images/Visit_List_Main.png" alt="Lista wizyt" width="222px" height="222px" title="Lista wizyt"/></a></div>
             <div class="column"><a href="/stats/details"><img src="/images/Stats_Main.png" alt="Statystyki" width="222px" height="222px" title="Statystyki"/></a></div>
         </div>
    </div>
</div>

</body>
</html>
