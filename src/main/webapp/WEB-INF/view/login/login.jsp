<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" >
<head>
    <meta charset="UTF-8"/>
    <title>login</title>
    <script src="/js/jquery-1.9.1.js"></script>
</head>
<body>
    <form method="post" action="/login/login.do">
        用户名：<input name="username" />
        密  码：<input name="password" />
    <input type="submit" value="登录"/>
    </form>
</body>
</html>