<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
  .color-login{
     background-color: skyblue;
     color: #111;
     border: 2px solid ridge;
     width: 49%;
     height: 400px;
     margin-right: 2%;
  }
  .color-register{
    background-color: yellow;
    color: #111;
    width: 49%;
    border: 2px solid olive;
    height: 400px;
  }
  .header{
   background-color: #444;
   margin-bottom: 10px;
  }
  .footer{
    background-color: #000;
    color: ghostwhite;
    margin-top: 10px;
  }
</style>
</head>
<body>
<div class="wrapper">
<div class="container">
<div class="row">
<div class="col-md-12 header">
  <tiles:insertAttribute name="header"/>
  </div>
   <div class="col-md-6 color-login">
       <tiles:insertAttribute name="login"/>
     </div>
     <div class="col-md-6 color-register">
       <tiles:insertAttribute name="register"/>
     </div>
   <div class="col-md-12 footer">
  <tiles:insertAttribute name="footer"/>
  </div>
  
</div>
</div>
</div>
</body>
</html>