<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Formularz rejestracyjny</title>
    <style><%@include file="/css/form.css"%></style>
</head>
<body>
<h2>Wypełnij formularz rejestracyjny</h2>
    <div>
        <form:form modelAttribute="regForm" method="post">
            Login:<br/>
             <form:input path="login"/><br/>
            <form:errors path="*" ></form:errors>
            Email:<br/>
             <form:input path="email"/><br/>
            Hasło:<br/>
             <form:password path="password"/><br/>
            Potwierdź hasło:<br/>
             <form:password path="confirmedPassword"/><br/>
            Imię:<br/>
             <form:input path="firstName"/><br/>
            Nazwisko:<br/>
             <form:input path="lastName"/><br/>
            <input type="submit" value="Zarejestruj"/>
            <input type="reset" value="Wyczyść"/>
        </form:form>
    </div>

</body>
</html>
