<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/page/front/website/assets/css/amazeui.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/page/front/website/assets/css/common.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/page/front/website/assets/css/index.min.css" />
<script src="${pageContext.request.contextPath }/page/front/website/assets/js/jquery-2.1.0.js"
	charset="utf-8"></script>
<script src="${pageContext.request.contextPath }/page/front/website/assets/js/amazeui.js"
	charset="utf-8"></script>
<script src="${pageContext.request.contextPath }/page/front/website/assets/js/common.js"
	charset="utf-8"></script>

 <title>个人资料</title>
</head>
<body>
	<jsp:include page="/page/front/top.jsp" />
	<!-- 查看客户详细信息 -->
	<div class="div2">
		<form id="formList" name="reg_testdate"
			action="${pageContext.request.contextPath }/front/custom/selectFrontCustom.action" method="post"
			enctype="multipart/form-data">
			<table class="imagetable1" width="900px">
				<caption class="details1">个人资料</caption>
				<tr>
					<th>姓名</th>
					<td colspan="2"><center><h3><input name="name" readonly type="text" value="${selectFrontCustom.name }" /></h3></center></td>
					<th>性别</th>
					<td colspan="2">
					<center>
						<h3>
							<c:if test="${lookCustom.sex ==0 }">
							男 &nbsp;
							</c:if>
							<c:if test="${lookCustom.sex ==1 }">
							女 &nbsp;
							</c:if>
						</h3>
					</center>
					</td>
					<th rowspan="2">照片</th>
			 			<td colspan="4" rowspan="2"> 
					<center><img src="http://codetpension.oss-cn-beijing.aliyuncs.com/custom/${lookCustom.pic}" readonly  style="width:100px;height:100px;"/> </center>
						</td> 
				</tr>
				<tr>
					<th>出生日期</th>
					<td colspan="5"><input name="birthday" readonly type="text" value="<fmt:formatDate value="${lookCustom.birthday}" pattern="yyyy-MM-dd"/>" /></td>
				</tr>
				<tr>
					<th>身份证号(ID)</th>
					<td colspan="5"><input type="text" readonly name="customid" value="${selectFrontCustom.customid}" /></td>
					<th colspan="1">用户名</th>
					<td colspan="4"><input name="customname" readonly type="text" value="${selectFrontCustom.customname}" /></td>
				</tr>
				<tr>
					<th>家庭住址</th>
					<td colspan="5"><input name="address" readonly type="text" value="${selectFrontCustom.address}" /></td>
					<th colspan="1">微信</th>
					<td colspan="4"><input name="wechat" readonly type="text" value="${lookCustom.wechat}" /></td>
				</tr>
				<tr>
					<th>电话号码</th>
					<td colspan="5"><input name="phone" readonly type="text" value="${selectFrontCustom.phone}"></td>
					<th colspan="1">积分</th>
					<td colspan="4"><input name="integral" readonly type="text" value="${lookCustom.integral}" /></td>
				</tr>
			</table>
			<br /> <br />
			<center>
			<a
				href="${pageContext.request.contextPath }/front/custom/updateCustom.action?customId=${lookCustom.customid }"
				class="tablelink">
				<input type="button" value="修改信息" class="btn">
			</a>
			
				<input type="button" value="返回" onclick="javascript:history.go(-1);" class="btn">
			</center>
		</form>
	</div>
	
	
	
	
	
  
</body>
</html>
