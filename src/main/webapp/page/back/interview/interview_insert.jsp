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

<title>My JSP 'interview_list.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>

</head>
<style>
	td{
		border:1px solid black;
	}
	tr{
		height:30px;
		text-align: left;
	}
	.par{
		background: #2BD5D5;
	}
</style>
	
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li>
				<a href="#">首页</a>
			</li>
			<li>
				<a href="#">访谈管理</a>
			</li>
			<li>
				<a href="#">录入访谈</a>
			</li>
		</ul>
	</div>
	<div class="formbody">

		<div class="formtitle">
			<span>访谈信息录入</span>
		</div>

		<form id="formList" name="reg_testdate" action="" method="post" style="width:800px; margin: auto; ">
			<table width="800px" style="border:1px solid black;" border="0" cellspacing="1" cellpadding="0">
				<tr>
					<td colspan="6" >
						<h2 style="font-size:30px; text-align: center">客户信息</h2>
					</td> 
				</tr>
				<tr>
					<td class="par">客户编号</td>
					<td colspan="5">
						<input id="customid" type="text" name="customid" value="" class="dfinput"/>
						<input id="search" class="ibtn" type="button" value="检索"/>
					</td>
				</tr>
				<tr>
					<td class="par">姓名</td>
					<td><span id="name"></span></td>
					<td class="par">性别</td>
					<td><span id="sex"></span></td>
					<td class="par">出生年月</td>
					<td><span id="birthday"></span></td>
				</tr>
				<tr>
					<td colspan="6">
						<h2 style="font-size:25px; text-align: center">访谈信息</h2>
					</td>
				</tr>
				<tr>
					<td class="par">编号</td>
					<td><span>1000001</span></td>
					<td class="par">时间</td>
					<td colspan="3">
						<input type="text" name="" value="2015-01-01" class="dfinput"/>
					</td>
				</tr>
				<tr>
					<td class="par">人员</td>
					<td>访谈测试人员</td>
					<td colspan="4"></td>
				</tr>
				<tr>
					<td class="par">访谈类型</td>
					<td>
						<select>
							<option>电话访谈</option>
							<option>登门访谈</option>
						</select>
					</td>
					<td class="par">访谈时长</td>
					<td><input type="text" name="" value="" class="dfinput" />(半小时为单位)</td>
					<td class="par">访谈结果</td>
					<td>
						<select>
							<option>优</option>
							<option>良</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<span>访谈目的</span>
						<textarea rows="5" cols="150"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<span>访谈内容</span>
						<textarea rows="5" cols="150"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<input class="ibtn" type="submit" value="提交"/>
					</td>
				</tr>
			</table>
			<div id="searchId" style="width:600px;background:#F1FCFC;margin:auto;position: absolute;">
				<table border="1" width="800px;">
					<thead>
						<tr>
							<td>编号</td>
							<td>姓名</td>
							<td>出生日期</td>
							<td>性别</td>
							<td>选择</td>
						</tr>
					</thead>
					<tbody id="searchList">
						
					</tbody>
				</table>
			</div>
		</form>
	</div>
</body>
<script type="text/javascript">
$("#search").click(function(){
	var customid=$("#customid").val();
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath}/back/interview/findCustomByCustomidVague.action",
		data:"customid="+customid,
		success:function(data){
			$("#searchList").empty();
			for(var item in data){
				var str="<tr>";
				str+="<td><span id="+"\"sid\""+">"+data[item].customid+"</span<td>";
				str+="<td><span id="+"\"sname\""+">"+data[item].name+"</span<td>";
				str+="<td><span id="+"\"brithday\""+">"+data[item].brithday+"</span<td>";
				str+="<td><span id="+"\"sex\""+">"+data[item].sex+"</span<td>";
				str+="<td><input type="+"\"button\""+" value="+"\"选择\""+" class="+"\"ibtn\""+" /></td>";
				str+="</tr>";
				$("#searchList").append(str);
			}
		}
	});
});
$(".ibtn").live("click",function(){
	
	var sname=$(this).parent().parent().children("#sname").innerText;
	alert(sname);
	$("#name").text(sname);
});
</script>
</html>