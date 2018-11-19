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
    <style><%@include file="/css/form.css"%></style>
</head>
<body>
<h2>Podaj dane logowania</h2>
    <div>
        <form method="post" action="/login">
            <input type="text" name="login" placeholder="Login"/>
            <input type="password" name="password" placeholder="Password"/>
            <input type="submit" value="Zaloguj"/>
        </form>
    </div>
<h2>Zarejestruj się</h2>
<p id="register"><a href="/registration"><img src="/images/5.png" alt="Lista wizyt" width="100px" height="100px" title="Zarejestruj się"/></a></p>
</body>
</html>
