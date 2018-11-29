<%--
  Created by IntelliJ IDEA.
  User: Michał Kupisiński
  Date: 14.11.2018
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="/css/login.css">
</head>
<body>
<div>
    <%--Dla tytułów, to raczej stosuj tagi h1, h2 itd zamiast p. Zawsze możesz <br/> wstawić
    jeżeli potrzebujesz rozbić to na linie --%>
<p>ASYSTENT WIZYT</p>
<p>MEDYCZNYCH</p>
<br/>
<br/>
    <%--Brakuje obsługi błędów logowania, które może się nie udać --%>
        <form method="post" action="/login">
            <input type="text" name="login" placeholder="Login"/>
            <br/>
            <br/>
            <input type="password" name="password" placeholder="Password"/>
            <br/>
            <br/>
            <input type="submit" value="Zaloguj"/>
        </form>
<h4>Nie masz konta? </h4>
<p id="register"><a href="/registration"><img src="images/Register.png"></a></p>
</div>
</body>
</html>