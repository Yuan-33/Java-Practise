<%--
  Created by IntelliJ IDEA.
  User: gao
  Date: 2021/9/4
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
${msg}
<form action="${pageContext.request.contextPath}/student/allStudent" method="post">
    用户名:<input type="text" name="uname"/><br/>
    密码：<input type="password" name="upwd"/><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>

