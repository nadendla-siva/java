<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
    .form-controller{
      width: 60%; 
      margin-bottom: 10px;    
    }
</style>
</head>
<body>
    <div align="center">
        <h3>Spring MVC Form Validation Demo - Login Form</h3>
        <table border="0" width="90%">
        <form:form action="login" commandName="userForm">
                <tr>
                    <td align="left"><form:input path="email" size="30" placeHolder="Email" class="form-controller"/></td>
                    <td align="left"><form:errors path="email" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:password path="password" size="30" placeHolder="Password" class="form-controller"/></td>
                    <td><form:errors path="password" cssClass="error"/></td>
                </tr>
                <tr>
                    <td align="left"><input type="submit" class="btn btn-skyblue" value="Login"/></td>
                    <td></td>
                </tr>
        </form:form>
        </table>
    </div>
</body>
</html>