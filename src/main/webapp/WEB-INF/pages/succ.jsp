<%--
  Created by IntelliJ IDEA.
  User: youzh
  Date: 2018/6/9
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<script type="text/javascript" src="../jquery-3.3.1.min.js"/>
<body>
<form id=adminlogin  method=post
      name=adminlogin action="${pageContext.request.contextPath}/user/UserAction.do"  >
    <div>
        <input type="text" name="username" id="username">
        <input type="text" name="password" id="password">
        <input type="button" name="login" id="login" value="登陆" onclick="login()">
    </div>
</form>
<script type="text/javascript">
    function login() {
        var username=${"#username"}.val();
        var password=${"#password"}.val();
        ${"#adminlogin"}.submit();
        
    }
</script>
</body>
</html>
