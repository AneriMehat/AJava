<%-- 
    Document   : login
    Created on : Aug 30, 2018, 11:40:50 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login page</h1>
        
        <form action="session">
           username: <input type="text" name="uname" value="" /><br>
           password: <input type="password" name="pass" value="" />
           <input type="submit" value="submit" />
        </form>
        
        
    </body>
</html>
