<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>修改用户</title>  
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
  </head>  
  <body>  
    <form action="/MyTest/user/modifyUser" method="post">  
        <input type="hidden" name="id" value="${user.id }">  
        用户名：<input type="text" name="name" value="${user.name }"><br/>  
        生日：<input type="text" name="age" value="${user.birthday }"><br/>  
        <input type="submit" value="修改">  
    </form>  
  </body>  
</html>  