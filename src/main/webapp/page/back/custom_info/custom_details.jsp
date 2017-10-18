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

<title>客户详情</title>

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
				<a href="#">查看详情</a>
			</li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>查看详情</span>
		</div>
		<form action="${pageContext.request.contextPath }/back/custom/selectCustom.action"
			method="post" enctype="multipart/form-data">
			<ul class="forminfo">
				<li>
					<label>
						客户ID
					</label>
					<input type="text"  name="customid" value="${selectCustom.customid }" class="dfinput" />
				</li>
				<li>
					<label>
						客户姓名
					</label>
					<input name="name" type="text" class="dfinput" value="${selectCustom.name }" />
				</li>
				<li>
					<label>
						用户名
					</label>
					
					<input name="customname" type="text" class="dfinput" value="${selectCustom.customname }" />
				</li>
				<li>
					<label>
						客户性别
					</label>
					<h3>
						<c:if test="${selectCustom.sex ==0 }">
							男 &nbsp;
							<input type="radio" value="0" name="sex" checked="checked"/>
							女 &nbsp;
							<input type="radio" value="1" name="sex" />
						</c:if>
						<c:if test="${selectCustom.sex ==1 }">
							男 &nbsp;
							<input type="radio" value="0" name="sex"/>
							女 &nbsp;
							<input type="radio" value="1" name="sex"  checked="checked"/>
						</c:if>
						
					</h3>
				</li>

				<li>
					<label>
						出生日期<b>*</b>
					</label>
					<input name="birthday" type="text" class="dfinput" value="${selectCustom.birthday}"/>
				</li>
				<li>
					<label>
						家庭住址<b>*</b>
					</label>
					<input name="" type="text" class="dfinput" value="${selectCustom.address}"/>
				</li>
				<li>
					<label>
						手机号<b>*</b>
					</label>
					<input name="phone" type="text" class="dfinput" value="${selectCustom.phone}" />
				</li>
				<li>
					<label>
						微 信<b></b>
					</label>
					<input name="wechat" type="text" class="dfinput" value="${selectCustom.wechat}" />
				</li>
				<li>
					<label>
						图片
					</label>
					<c:if test="${selectCustom.pic !=null}">
						<img src="${pageContext.request.contextPath }F:\\develop\\upload\\temp\\${selectCustom.pic}" style="width:100px;height:100px;"/>
					</c:if>
					<input type="file"  name="custompic"  /> 
				</li>
				<li>
					<label>
						积分
					</label>
					<input name="integral" type="text" class="dfinput" value="${selectCustom.integral}" />
				</li>
				<li>
					<label>&nbsp;</label>
				 <input type="button" value="返回" onclick="javascript:history.go(-1);" class="btn">
				</li>
			</ul>
		</form>
	</div>
</body>
</html>
