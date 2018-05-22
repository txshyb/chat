<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%
    String name = request.getParameter("username");
%>
<html lang="en" >
<head>
    <meta charset="UTF-8"/>
    <title>list</title>
    <script>
        var name = '<%=name%>';
        console.log(name);
    </script>
    <script src="/js/websocket.js"></script>
    <script src="/js/jquery-1.9.1.js"></script>
    <script src="/js/login/list.js"></script>
</head>
<body>
    <text><%=name%></text>

    <div class="list">
        <li><a>str</a></li>
    </div>
</body>
</html>