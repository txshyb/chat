<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%
    String name = request.getParameter("username");
    String friend = request.getParameter("friend");
%>
<html lang="en" >
<head>
    <meta charset="UTF-8"/>
    <title>list</title>
    <script>
        var name = '<%=name%>';
        console.log(name);
        var friend = '<%=friend%>';
        console.log(friend);
    </script>
    <script src="/js/websocket.js"></script>
    <script src="/js/jquery-1.9.1.js"></script>
    <script src="/js/chat/chat.js"></script>
</head>
<body >
    <text>与 <%=friend%> 聊天中</text>

    <div class="context" style="width: 80%;height: 60%">

    </div>

    <input class="message" style="width: 80%;height: 20%"></input><button class="send">发送</button>
</body>
</html>