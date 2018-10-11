<%-- 
    Document   : action
    Created on : Aug 9, 2018, 4:26:28 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="datetime.jsp"></jsp:include>
        <jsp:useBean id="test" class="test.testbean"></jsp:useBean>
        <h1>Hello World!</h1>
        <jsp:setProperty   name="test" value="20" property="age"></jsp:setProperty>
        <jsp:getProperty name="test" property="age"></jsp:getProperty>
    <% 
        test.setName("aneri");
       String name=test.getName();
       out.println(name);
       
    %>
    </body>
</html>
