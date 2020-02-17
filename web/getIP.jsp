<%--
  Created by IntelliJ IDEA.
  User: Daniil Kirillov
  Date: 27.01.2020
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your ips</title>
</head>
<body>
<p>
    <% String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null)
            ipAddress = request.getRemoteAddr();
        System.out.println(ipAddress);
    %> <%= "Hello, your ip's: " + ipAddress%>
</p>
</body>
</html>
