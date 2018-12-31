<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Formularz rejestracyjny</title>
    <link rel="stylesheet" href="/css/registerForm.css">
</head>
<body>
<div>
    <p>FORMULARZ</p>
    <p>REJESTRACYJNY</p>
        <form:form modelAttribute="regForm" method="post">
            <br/>
             <form:input class="register" path="login" placeholder="Login"/><br/>
            <form:errors path="login"/>
            <br/>
             <form:input class="register" path="email" placeholder="E-mail"/><br/>
            <form:errors path="email"/>
            <br/>
             <form:password class="register" path="password" placeholder="Hasło"/><br/>
            <form:errors path="password"/>
            <br/>
             <form:password class="register" path="confirmedPassword" placeholder="Potwierdź hasło"/><br/>
            <form:errors path="confirmedPassword"/>
            <br/>
             <form:input class="register" path="firstName" placeholder="Imię"/><br/>
            <form:errors path="firstName"/>
            <br/>
             <form:input class="register" path="lastName" placeholder="Nazwisko"/><br/>
            <form:errors path="lastName"/>
            <br/>
            <input type="submit" value="Zarejestruj"/>
            <br/>
            <input type="reset" value="Wyczyść"/>
        </form:form>
</div>
<div id="back">
    <a href="/login"> <img src="/images/Arrow.png" alt="cofnij"></a>
</div>
</body>
</html>
