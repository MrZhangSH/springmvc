<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改表单</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<%=request.getContextPath() %>/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container">
    <h2>用户修改</h2>
    <form method="post" action="<%=request.getContextPath() %>/testModelAttribute">
    	<input type="hidden" name="id" value="1">
        <label for="username">用户名：</label>
        <input type="text" placeholder="请输入用户名" name="userName" id="username" value="Mr.zhang">
        <label for="password">密 码</label>
        <input type="password" id="password">
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