<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'custom_update.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />

</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li>
				<a href="#">首页</a>
			</li>
			<li>
				<a href="#">客户管理</a>
			</li>
			<li>
				<a href="#">客户修改</a>
			</li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>修改客户信息</span>
		</div>
		<form action="${pageContext.request.contextPath }/custom/custom_updateSubmit.action?custom"
			method="post" enctype="multipart/form-data">
			<ul class="forminfo">
				<li>
					<label>
						客户姓名<b>*</b>
					</label>
					<input name="name" type="text" class="dfinput" value="${custom.name }" />
				</li>
				<li>
					<label>
						客户性别<b>*</b>
					</label>
					<h3>
						男 &nbsp;
						<input type="radio" value="0" name="sex" />
						女 &nbsp;
						<input type="radio" value="1" name="sex" />
					</h3>
				</li>

				<li>
					<label>
						出生日期<b>*</b>
					</label>
					<input name="birthday" type="text" class="dfinput" />
				</li>
				<li>
					<label>
						家庭住址<b>*</b>
					</label>
					<input name="" type="text" class="dfinput" />
				</li>
				<li>
					<label>
						手机号<b>*</b>
					</label>
					<input name="phone" type="text" class="dfinput" value="${custom.phone}" />
				</li>
				<li>
					<label>
						微 信<b></b>
					</label>
					<input name="" type="text" class="dfinput" value="${custom.wechat}" />
				</li>
				<li>
					<label>
						邮 箱<b></b>
					</label>
					<input name="" type="text" class="dfinput" />

				</li>
				<li>
					<label>&nbsp;</label>
					<input type="submit" class="btn" value="保存提交" />
				</li>
			</ul>
		</form>
	</div>
</body>
</html>
