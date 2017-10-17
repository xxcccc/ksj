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
				<a href="#">客户健康信息管理</a>
			</li>
			<li>
				<a href="#">客户健康信息详情</a>
			</li>
		</ul>
	</div>

	<div class="div1">
		<form id="formList" name="reg_testdate"
			action="${pageContext.request.contextPath }/back/healtrecords/*.action"
			method="post" enctype="multipart/form-data">
			<table class="imagetable">
				<caption class="healthtitle">客户健康档案详情</caption>
				<tr>
					<th>姓名</th>
					<td><input name="" type="text"></td>
					<th>性别</th>
					<td><input name="" type="text"></td>
					<th>出生年月</th>
					<td><input name="" type="text"></td>
					<th>年龄</th>
					<td><input name="" type="text"></td>
					<th>工作</th>
					<td colspan="2"><input name="job" type="text"></td>
				</tr>

				<tr>
					<th>体重</th>
					<td><input name="weight" type="text"></td>
					<th>身高</th>
					<td><input name="height" type="text"></td>
					<th>确诊时间</th>
					<td><input name="diagnosistime" type="text"></td>
					<th colspan="1">家族病史</th>
					<td colspan="4"><input name="familyhistory" type="text"></td>
				</tr>
				<tr>
					<th>住宅地址</th>
					<td colspan="5"><input name="" type="text"></td>
					<th colspan="1">联系电话</th>
					<td colspan="4"><input name="" type="text"></td>
				</tr>
				<tr>
					<th>个人收入</th>
					<td colspan="5"><input name="" type="text"></td>
					<th colspan="1">保健意识</th>
					<td colspan="4"><input name="" type="text"></td>
				</tr>
				<tr>
					<th colspan="6">目前用药及用量</th>
					<th colspan="5">曾经用药及用量</th>
				</tr>
				<tr>
					<td colspan="6"><input name="" type="text"></td>
					<td colspan="5"><input name="" type="text"></td>
				</tr>
				<tr>
					<td colspan="6"><input name="" type="text"></td>
					<td colspan="5"><input name="" type="text"></td>
				</tr>
				<tr>
					<td colspan="6"><input name="" type="text"></td>
					<td colspan="5"><input name="" type="text"></td>
				</tr>

				<tr>
					<th colspan="1">饮食情况</th>
					<td colspan="2"><input name="" type="text"></td>
					<th colspan="1">运动情况</th>
					<td colspan="3"><input name="" type="text"></td>
					<th colspan="1">情绪控制</th>
					<td colspan="3"><input name="" type="text"></td>
				</tr>
				<tr>
					<th colspan="1">血栓检测</th>
					<td colspan="6"><input name="" type="text"></td>
					<th colspan="1">血压</th>
					<td colspan="3"><input name="" type="text"></td>
				</tr>
				<tr>
					<th colspan="1">健康评估</th>
					<td colspan="6"><input name="" type="text"></td>
					<th colspan="1">危险提示</th>
					<td colspan="3"><input name="" type="text"></td>
				</tr>
				<tr>
					<th colspan="1">结论建议</th>
					<td colspan="6"><input name="" type="text"></td>
					<th colspan="1">治疗效果评价</th>
					<td colspan="3"><input name="" type="text"></td>
				</tr>
				<tr>
					<th colspan="11">购买产品情况</th>
				</tr>
				<tr>
					<th colspan="1">时间</th>
					<th colspan="1">品名</th>
					<th colspan="1">购买数量</th>
					<th colspan="1">服用量</th>
					<th colspan="1">服用到期时间</th>
					<th colspan="4">指导意见</th>
					<th colspan="1">购买地点</th>
					<th colspan="1">经手人</th>
				</tr>
				<tr>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="4"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
				</tr>
				<tr>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="4"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
				</tr>
				<tr>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="4"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
					<td colspan="1"><input name="" type="text"></td>
				</tr>
				<tr>
					<th colspan="11">顾客分析</th>
				</tr>
				<tr>
					<th colspan="2">是否有购买能力</th>
					<td colspan="3"><input name="" type="text"></td>
					<th colspan="2">是否有决策权</th>
					<td colspan="4"><input name="" type="text"></td>
				</tr>
				<tr>
					<th colspan="2">是否有购买需求</th>
					<td colspan="3"><input name="" type="text"></td>
					<th colspan="2">顾客购买意愿分类</th>
					<td colspan="4"><input name="" type="text"></td>
				</tr>
			</table>
		</form>
	</div>
	<div></div>
</body>
</html>
