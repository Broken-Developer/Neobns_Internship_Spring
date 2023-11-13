<%--
  Created by IntelliJ IDEA.
  User: jihyun
  Date: 2023/11/13
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sign In</title>
</head>
<body>
  <h3>This page is SIGN_IN.</h3>

  <form action="/hello/signInConfirm">
    ID : <input type="text" name="m_id"><br>
    PW : <input type="password" name="m_pw"><br>
    <input type="submit" value="SIGN IN">
    <input type="reset" value="CANCEL">
  </form>
</body>
</html>
