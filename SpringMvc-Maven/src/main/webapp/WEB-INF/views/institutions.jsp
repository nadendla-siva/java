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
      margin-bottom: 10px;
      width: 60%;
    }
</style>
 <tiles:insertAttribute name="title"/>
</head>
<body>
    <div align="center">
        <h3>Spring MVC Form Validation Demo - Institutions Form</h3>
        <table border="0" width="90%">
        <form:form action="saveInst" commandName="instForm">
                 <tr>
                    <td align="left"><form:input path="name" size="30" placeholder="InstName" class="form-controller"/></td>
                    <td align="left"><form:errors path="name" cssClass="error"/></td>
                </tr>
                <tr>
                    <td align="left"><form:input path="description" size="30" placeholder="Description" class="form-controller"/></td>
                    <td align="left"><form:errors path="description" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:input path="state" size="30" placeholder="State" class="form-controller"/></td>
                    <td><form:errors path="state" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:input path="city" size="30" placeholder="City" class="form-controller"/></td>
                    <td><form:errors path="city" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:input path="anchor" size="30" placeholder="anchor" class="form-controller"/></td>
                    <td><form:errors path="anchor" cssClass="error"/></td>
                </tr>
                <tr>
                    <td align="left"><input type="submit" class="btn btn-warning" value="update"/></td>
                    <td></td>
                </tr>
        </form:form>
        </table>
    </div>
</body>
</html>