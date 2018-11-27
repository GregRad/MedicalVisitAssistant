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
            <form:errors class="register" path="*" ></form:errors>
            <br/>
             <form:input class="register" path="email" placeholder="E-mail"/><br/>
            <br/>
             <form:password class="register" path="password" placeholder="Hasło"/><br/>
            <br/>
             <form:password class="register" path="confirmedPassword" placeholder="Potwierdź hasło"/><br/>
            <br/>
             <form:input class="register" path="firstName" placeholder="Imię"/><br/>
            <br/>
             <form:input class="register" path="lastName" placeholder="Nazwisko"/><br/>
            <br/>
            <input type="submit" value="Zarejestruj"/>
            <br/>
            <input type="reset" value="Wyczyść"/>
        </form:form>
</div>
</body>
</html>
