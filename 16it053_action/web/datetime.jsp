<%-- 
    Document   : datetime
    Created on : Aug 9, 2018, 5:05:19 AM
    Author     : Admin
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            Date date=new Date();
            out.println(date.toString());
            %>
    </body>
</html>
