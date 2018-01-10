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

<title>My JSP 'left.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active");
			$(this).addClass("active");
		});

		$('.title').click(function() {
			var $ul = $(this).next('ul');
			$('dd').find('ul').slideUp();
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
	});
</script>

</head>

<body style="background:#f0f9fd;">
	<div class="lefttop">
		<span></span>
	</div>
	<dl class="leftmenu">

		<dd>
			<div class="title">
				<span>
					<img src="images/leftico01.png" />
				</span>
				客户管理
			</div>
			<ul class="menuson">
				<li>
					<cite></cite> <a href="${pageContext.request.contextPath }/back/custom/customList.action"
						target="rightFrame">客户列表</a><i></i>
				</li>
				<li>
					<cite></cite> <a href="${pageContext.request.contextPath }/page/back/custom_info/custom_insert.jsp"
						target="rightFrame">客户添加</a><i></i>
				</li>
			<!-- 	<li>
					<cite></cite> <a href="${pageContext.request.contextPath }/page/back/custom_info/customRelatives_insert.jsp"
						target="rightFrame">添加客户亲属</a><i></i>
				</li>
			-->
			</ul>
		</dd>
		<dd>
			<div class="title">
				<span>
					<img src="images/leftico02.png" />
				</span>
				XX管理
			</div>
			<ul class="menuson">
				<li>
					<cite></cite> <a href="${pageContext.request.contextPath }/page/back/course/coursePublish.jsp" target="rightFrame">课程发布</a><i></i>
				</li>
			</ul>		
		</dd>
		
		<dd>
			<div class="title">
				<span>
					<img src="images/leftico03.png" />
				</span>
				自定义
			</div>
			<ul class="menuson">
				<li>
					<cite></cite> <a href="#">自定义</a><i></i>
				</li>

			</ul>
		</dd>
	</dl>
</body>
</html>
