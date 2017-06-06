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
</head>
<body>
    <div align="center">
        <h3>Spring MVC Form Validation Demo - Register Form</h3>
        <table border="0" width="90%">
        <form:form action="register" commandName="registerForm">
                 <tr>
                    <td align="left"><form:input path="name" size="30" placeholder="Name" class="form-controller"/></td>
                    <td align="left"><form:errors path="name" cssClass="error"/></td>
                </tr>
                <tr>
                    <td align="left"><form:input path="email" size="30" placeholder="Email" class="form-controller"/></td>
                    <td align="left"><form:errors path="email" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:input path="contactNumber" size="30" placeholder="Contact Number" class="form-controller"/></td>
                    <td><form:errors path="contactNumber" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:select path="city"  placeholder="city" class="form-controller">
						<form:option value="Hyderabad" label="Hyderabad" />
						<form:option value="Vijayawada" label="Vijayawada" />
						<form:option value="Guntur" label="Guntur" />
						<form:option value="Chennai" label="Chennai" />
						<form:option value="Bangalore" label="Bangalore" />
					</form:select></td>
				<td><form:errors path="city" cssClass="error" /></td>
                </tr>
                <tr>
                    <td><form:select path="highestQualification"  placeholder="highestQualification" class="form-controller">
                       <form:option value="10TH" label="10TH" />
                        <form:option value="12TH" label="12TH" /> 
						<form:option value="B.E" label="B.E" />
						<form:option value="B.TECH" label="B.TECH" />
						<form:option value="B.Pharam" label="B.Pharam" />
						<form:option value="M.Tech" label="M.Tech" />
						<form:option value="BSC" label="BSC" />
					</form:select></td>
				<td><form:errors path="city" cssClass="error" /></td>
                </tr>
                
                <tr>
                    <td><form:select path="educationInterest" placeholder="educationInterest"  class="form-controller">
						<form:option value="B.TECH" label="B.TECH" />
						<form:option value="B.Pharam" label="B.Pharam" />
						<form:option value="MBA" label="MBA" />
						<form:option value="MCA" label="MCA" />
						<form:option value="M.Tech" label="M.Tech" />
						<form:option value="DESIGN" label="DESIGN" />
					</form:select></td>
				<td><form:errors path="city" cssClass="error" /></td>
                </tr>
                
                <tr>
                    <td><form:select path="modeOfDegree" placeholder="modeOfDegree" class="form-controller">
						<form:option value="Part Time" label="Part Time" />
						<form:option value="Full Time" label="Full Time" />
					</form:select></td>
				<td><form:errors path="city" cssClass="error" /></td>
                </tr>
                <tr>
                    <td align="left"><input type="submit" class="btn btn-warning" value="register"/></td>
                    <td></td>
                </tr>
        </form:form>
        </table>
    </div>
</body>
</html>