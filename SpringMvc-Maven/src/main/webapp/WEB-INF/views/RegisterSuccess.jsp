<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<style type="text/css">
  .userdata{
   color: fuchsia;
  }
</style>
</head>
<body>
    <div align="center">
        <h2>Welcome ${registerForm.name}! You have registered in successfully.</h2>
        <h2> You have Registered with below Details.</h2>
        <div class="userdata">
           Name:  ${registerForm.name} <br>
           Email: ${registerForm.email} <br>
           Contact Number:${registerForm.contactNumber} <br>
           City: ${registerForm.city}<br>
           Qualification:${registerForm.highestQualification}<br>
           educationInterest ${registerForm.educationInterest}<br>
           modeOfDegree : ${registerForm.modeOfDegree}
          </div>
	    </div>
		</body>
		</html>