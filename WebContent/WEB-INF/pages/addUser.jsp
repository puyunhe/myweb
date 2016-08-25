<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>添加用户</title>  
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
  </head>  
  <body>  
    <form action="/MyTest/user/addUser" method="post">  
        用户名：<input type="text" name="username"><br/>  
        生日：<input type="text" name="birthday"><br/>  
        <input type="submit" value="添加用户">  
    </form>  
  </body>  
</html>  