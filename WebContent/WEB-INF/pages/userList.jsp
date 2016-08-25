<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>用户列表</title>  
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    <script type="text/javascript" src="../js/jquery-1.4.3.js"></script>  
    <script type="text/javascript">  
        function deleteUser(id){  
            $.get("/MyTest/user/deleteUser?id=" + id,function(data){  
                if("success" == data.result){  
                    alert("删除成功!");  
                    window.location.reload();   
                }else{  
                    alert("删除失败!")  
                }  
            });  
        }  
  
    </script>  
      
  </head>  
  <body>  
        <table border="1">  
            <tbody>  
                <tr>  
                    <th>名字</th>  
                    <th>年龄</th>  
                    <th>操作</th>  
                </tr>  
                    <c:forEach items="${users}" var="u">  
                        <tr>  
                            <td>${u.name }</td>  
                            <td>${u.age }</td>  
                            <td>  
                                <a href="/MyTest/user/getUser?id=${u.id }">更新</a>  
                                <a href="javascript:deleteUser('${u.id }');">删除</a>  
                            </td>  
                        </tr>  
                    </c:forEach>  
            </tbody>  
        </table>  
  </body>  
</html>  