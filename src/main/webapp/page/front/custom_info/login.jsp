<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/page/front/website/assets/css/amazeui.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath }/page/front/website/assets/css/other.min.css" />
</head>

<body class="login-container">
	<div class="login-box">
		<div class="logo-img">
			<img src="${pageContext.request.contextPath }/page/front/website/assets/images/logo2_03.png" alt="" />
		</div>
		<form action="${pageContext.request.contextPath }/front/custom/login.action" class="am-form" method="post" data-am-validator>
			<div class="am-form-group">
				<label for="doc-vld-name-2">
					<i class="am-icon-user"></i>
				</label>
				<input type="text" name="customname" id="doc-vld-name-2" minlength="1" placeholder="输入用户名（至少 1个字符）" required />
			</div>

			<div class="am-form-group">
				<label for="doc-vld-password-2">
					<i class="am-icon-key"></i>
				</label>
				<input type="password" name="password" id="doc-vld-email-2" placeholder="输入密码" required />
			</div>
			<div class="am-form-group">
				<button class="am-btn am-u-sm-5" type="submit">登录</button>
				<a href="${pageContext.request.contextPath }/page/front/custom_info/register.jsp">
				<button class="am-btn am-u-sm-5" type="button">注册</button>
				</a>
			</div>
		</form>
	</div>
</body>
</html>
