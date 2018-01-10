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

<title>客户详情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />

</head>

<body >
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
	<!-- 查看客户详细信息 -->
	<div class="div2"  >
		<form id="formList" name="reg_testdate"
			action="${pageContext.request.contextPath }/back/custom/selectRelatives.action" method="post"
			enctype="multipart/form-data">
			<table class="imagetable1" width="900px">
				<caption class="details1">客户详细信息</caption>
				<tr>
					<th>姓名</th>
					<td colspan="2"><center><h3><input name="name" readonly type="text" value="${selectCustomC.name }" /></h3></center></td>
					<th>性别</th>
					<td colspan="2">
					<center>
						<h3>
							<c:if test="${selectCustomC.sex ==0 }">
							男 &nbsp;
							</c:if>
							<c:if test="${selectCustomC.sex ==1 }">
							女 &nbsp;
							</c:if>
						</h3>
					</center>
					</td>
					<th rowspan="2">照片</th>
			 			<td colspan="4" rowspan="2"> 
					<center><img src="http://codetpension.oss-cn-beijing.aliyuncs.com/custom/${selectCustomC.pic}"  readonly  style="width:100px;height:100px; border-radius:100%"/> </center>
						</td> 
				</tr>
				<tr>
					<th>出生日期</th>
					<td colspan="5"><input name="birthday" readonly type="text" value="<fmt:formatDate value="${selectCustomC.birthday}" pattern="yyyy-MM-dd"/>" /></td>
				</tr>
				<tr>
					<th>身份证号(ID)</th>
					<td colspan="5"><input type="text" readonly name="customid" value="${selectCustomC.customid}" /></td>
					<th colspan="1">用户名</th>
					<td colspan="4"><input name="customname" readonly type="text" value="${selectCustomC.customname}" /></td>
				</tr>
				<tr>
					<th>家庭住址</th>
					<td colspan="5"><input name="address" readonly type="text" value="${selectCustomC.address}" /></td>
					<th colspan="1">微信</th>
					<td colspan="4"><input name="wechat" readonly type="text" value="${selectCustomC.wechat}" /></td>
				</tr>
				<tr>
					<th>电话号码</th>
					<td colspan="5"><input name="phone" readonly type="text" value="${selectCustomC.phone}"></td>
					<th colspan="1">积分</th>
					<td colspan="4"><input name="integral" readonly type="text" value="${selectCustomC.integral}" /></td>
				</tr>
				<tr>
					<th colspan="1">用户等级</th>
					<td colspan="10"><input  id="levelid" readonly type="text" value="${selectCustomC.levelid}" />
					</td>
				</tr>
				<!-- 亲属信息 -->
				<tr>
					<th colspan="11" style="background:white" >亲属详情</th>
				</tr>
				<tr>
					<th colspan="1">姓名</th>
					<th colspan="2">亲属ID</th>
					<th colspan="2">与客户关系</th>
					<th colspan="2">电话1</th>
					<th colspan="2">电话2</th>
					<th colspan="1">微信</th>
					<th colspan="1">操作</th>
				</tr>
				<c:forEach items="${selectMessage.listMessage}" var="listRelatives">
				<tr >
					<td colspan="1" height="30px"><input  name="name" readonly type="text" value="${listMessage.name }"></td>
					<td colspan="2" height="30px"><input  name="relativesid" readonly type="text" value="${listMessage.messageid }"></td>
					<td colspan="2" height="30px"><input  name="info" readonly type="text" value="${listMessage.content }" ></td>
					<td colspan="2" height="30px"><input name="phone1" readonly value="${listMessage.phone1 }"></td>
					<td colspan="2" height="30px"><input name="phone2" readonly value="${listMessage.phone2 }" ></td>
					<td colspan="1" height="30px"><input name="wechat" readonly type="text" value="${listMessage.wechat }" ></td>
					<td colspan="1" height="30px">&nbsp;&nbsp;
						<a
							href="${pageContext.request.contextPath }/back/custom/updateRelatives.action?relativesid=${listMessage.relativesid }"
							class="tablelink">修改
					    </a>&nbsp;
					    <a
						href="${pageContext.request.contextPath }/back/custom/deleteRelatives.action?relativesid=${listMessage.relativesid }"
						class="tablelink">删除
						</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			<br /> <br />
			<center>
				<input type="button" value="返回" onclick="javascript:history.go(-1);" class="btn">
			</center>
		</form>
	</div>

</body>
<!-- 用户等级显示 -->
<script type="text/javascript">
var levl =$("#levelid").val();
//alert(levl);
$.ajax({
	type:"get",
	data:"levelid="+levl,
	url:"${pageContext.request.contextPath}/back/custom/findBackCustomLevel.action",
	success:function(data){
		for(var item in data){
			/* var str="<option value="+"\""+data[item].levelid+"\">"+data[item].name+"</option>"; */
			$("#level").text(data[item].name);
			
		}
	}
});
</script>
</html>
