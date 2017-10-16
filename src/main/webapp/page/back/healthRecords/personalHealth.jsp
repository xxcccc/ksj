<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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

<title>My JSP 'user_list.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip").fadeIn(200);
		});

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
</script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li>
				<a href="#">首页</a>
			</li>
			<li>
				<a href="#">客户健康信息管理</a>
			</li>
			<li>
				<a href="#">客户健康信息详情</a>
			</li>
		</ul>
	</div>
	<h1 style="text-align:center">客户健康档案表</h1>
	<table style="margin:50px">
<tr>
  <th>姓名</th>
  <td></td>
  <th>性别</th>
  <td></td>
  <th>出生年月</th>
  <td></td>
  <th>年龄</th>
  <td></td>
  <th>从事行业</th>
  <td colspan="2"></td>
</tr>

<tr>
  <th>体重</th>
  <td></td>
  <th>身高</th>
  <td></td>
  <th>确诊时间</th>
  <td></td>
  <th colspan="2">家族史</th>
  <td colspan="3"></td>
</tr>
<tr>
  <th>住宅地址</th>
  <td colspan="5"></td>
  <th colspan="2">联系电话</th>
  <td colspan="3"></td>
</tr>
<tr>
  <th>个人收入</th>
  <td colspan="5"></td>
  <th colspan="2">保健意识</th>
  <td colspan="3"></td>
</tr>
<tr>
  <th colspan="6">目前用药及用量</th>
  <th colspan="5">曾经用药及用量</th>
</tr>
<tr>
  <td colspan="6"></td>
  <td colspan="5"></td>
</tr>
<tr>
  <td colspan="6"></td>
  <td colspan="5"></td>
</tr>


</table>
</body>
</html>
