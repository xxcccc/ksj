<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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

<title>My JSP 'custom_insert.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<script type="text/javascript" src="js/Region.js"></script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li>
				<a href="#">首页</a>
			</li>
			<li>
				<a href="#">课程管理</a>
			</li>
			<li>
				<a href="#">课程发布</a>
			</li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>课程发布</span>
		</div>

		<form id="formList" name="reg_testdate"  action="${pageContext.request.contextPath }/back/course/coursePublish.action" method="post"
			enctype="multipart/form-data">

			<ul class="forminfo">
				<li>
					<label>
						课程名<b>*</b>
					</label>
					<input name="name" type="text" class="dfinput" />
					<i>课程名</i>
				</li>
				<li>
					<label>
						讲师<b>*</b>
					</label>
					<input  name="teacher" type="text" class="dfinput" />

				</li>
				<li>
					<label>
						报名人数<b>*</b>
					</label>
					<input name="number" type="text" class="dfinput" />
				</li><li>
					<label>
						信息
					</label>
					<input name="info" type="text" class="dfinput" />
				</li>
				
				<li>
					<label>
						主题
					</label>
					<input  name="title" type="text" class="dfinput" />
				</li><li>
					<label>
						链接
					</label>
					<input  type="text" class="dfinput" />
				</li>

		
				<li>
					<label>
						图片
					</label>
					<input type="file" />
				</li>
				
			</ul>
			<input type="submit" value="发布" onclick="sex()">
		</form>
	</div>

</body>

</html>
