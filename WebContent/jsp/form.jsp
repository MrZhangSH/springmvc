<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<%=request.getContextPath() %>/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
    <h2>用户登录</h2>
    <form method="post" action="<%=request.getContextPath() %>/login">
        <label for="username">
        	用户名：
        </label>
        <input type="text" placeholder="请输入用户名" name="userName" id="username">
        <label for="password">
        	密 码：
        </label>
        <input type="password" name="passWord" id="password">
        <label class="checkbox">
            <input type="checkbox">记住我的登录信息
        </label>
        <button type="submit" class="btn">登 录</button><a href="login">用户注册</a>
    </form>
</div>

<script src="<%=request.getContextPath() %>/resources/js/jquery.js"></script>
<script src="<%=request.getContextPath() %>/resources/js/bootstrap.js"></script>
</body>
</html>