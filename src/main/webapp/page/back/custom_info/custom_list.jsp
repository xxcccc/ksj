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


<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/codet.js"></script>
<style type="text/css">
	*{
		padding:0;
		margin:0;
		border:0;
	}
</style>
</head>

<body>
<%
request.setCharacterEncoding("UTF-8");//传值编码
response.setContentType("text/html;charset=UTF-8");//设置传输编码
%>
	<div class="place"  >
		<span>位置：</span>
		<ul class="place">
			<li style="display:inline;line-height:40px;">
				<a href="#">首页</a>&nbsp;&nbsp;>
			</li>
			<li style="display:inline;line-height:40px;">
				<a href="#">客户管理</a>&nbsp;&nbsp;>
			</li>
			<li style="display:inline;line-height:40px;">
				<a href="#">客户列表</a>
			</li>
		</ul>
	</div>	
		<form action="${pageContext.request.contextPath }/back/custom/customList.action">
			<div class="rightinfo">
				<div class="tools">
					<i id="isearchType" style="display:none;">${searchType }</i>
					<i id="icity" style="display:none;">${city }</i>
					<ul class="toolbar">
						<li>
							<a href="${pageContext.request.contextPath }/page/back/custom_info/custom_insert.jsp">
								<span>
									<img src="images/t01.png" />
								</span>
								添加客户
							</a>
						</li>
					
					</ul>
					<ul class="toolbar1">
						<li>
						
						
							<span>
								<select style="height: 23px;width: 100px;" id="scity" name="city">
								</select>
							</span>
							
							<span>
								<select style="height: 23px;width: 100px;" id="searchType" name="searchType">
									<option value="customId">ID</option>
									<option value="name">姓名</option>							
								</select>
							</span>
							<span>
								<input type="text"  id="keyword" name="keyword" value="${keyword }" style="height:23px;width:150px;" />
							</span>
							<span>
								<button id="sbtn" type="button" style="height: 23px; width: 40px;">搜索</button>
							</span>
						</li>
					</ul>
	

				</div>
	
				<table class="tablelist table table-hover">
					<thead>
						<tr >
							<th style="width:50px;"><input name="" type="checkbox" value="" /></th>
							<th style="width:300px;">ID<i class="sort">
									<img src="images/px.gif" />
								</i></th>
							<th style="width:100px;">姓名</th>
							<th style="width:50px;">性别</th>
							<th style="width:100px;">手机号</th>
							<th style="width:100px;">微信</th>
							<th style="width:250px;">操作</th>
						</tr>
					</thead>
					<tbody id="tbody">
						<c:forEach items="${customList }" var="custom">
							<tr>
								<td>
									<input id=""  class="raido" type="checkbox" name="customid" />
								</td>
								<td>
									<span>${custom.customid }</span>
								</td>
								<td>
									<span>${custom.name }</span>
								</td>
								<td>
									<c:if test="${custom.sex ==0 }">
										<span>男</span>
									</c:if>
									<c:if test="${custom.sex ==1 }">
										<span>女</span>
									</c:if>
								</td>
								<td>
									<span>${custom.phone }</span>
								</td>
								
								<td>
									<span>${custom.wechat }</span>
								</td>
								
								<td>
								<a
								href="${pageContext.request.contextPath }/back/custom/findCustomRelativesResultMap.action?customid=${custom.customid }"
								class="tablelink">查看详情</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
								<a
								href="${pageContext.request.contextPath }/back/custom/updateCustom.action?customId=${custom.customid }"
								class="tablelink">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="${pageContext.request.contextPath }/back/custom/deleteCustomByCustomid.action?customid=${custom.customid }"
								class="tablelink">删除</a>
						</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
	
				<div style="width:margin:auto;">
					<ul class="pagination">
						<li><a href="JavaScript:void(0)" id="count">共<i id="scount">${count}</i>条数据</a></li>
						<li><a href="JavaScript:void(0)" id="pageNo">当前 <i id="spageNo">${pageNo }</i> 页</a></li>
						<li><a href="#" id="home">首页</a></li>
						<li><a href="#" id="pre">上一页</a></li>
						<li><a href="#" id="next">下一页</a></li>
						<li><a href="#" id="last">尾页</a></li>
						<li>
							<a href="JavaScript:void(0)">
								每页
								<select id="spageSize" name="pageSize">
									<option value="10">10</option>
									<option value="20">20</option>
								</select>
								条
							</a>
						</li>
						<li>
							<a href="JavaScript:void(0)" id="pageNo">
								跳转到
								<input type="text" id="ipageNo" />
								页
							</a>
						</li>
						<li>
							<a href="JavaScript:void(0)" id="forward">
								跳转
							</a>
						</li>
					</ul>
				</div>
	
	
			</div>
		</form>
	<div class="tip">
		<div class="tiptop">
			<span>提示信息</span>
			<a></a>
		</div>

		<div class="tipinfo">
			<span>
				<img src="images/ticon.png" />
			</span>
			<div class="tipright">
				<p>是否确认对信息的修改 ？</p>
				<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
			</div>
		</div>

		<div class="tipbtn">
			<input name="" type="button" class="sure" value="确定" />
			&nbsp;
			<input name="" type="button" class="cancel" value="取消" />
		</div>
	</div>
</body>
<script type="text/javascript">
$.ajax({
	type:"get",
	url:"${pageContext.request.contextPath}/back/custom/findAllCity.action",
	success:function(data){
		for(var item in data){
			var str="<option value="+"\""+data[item].cityid+"\">"+data[item].name+"</option>";
			$("#scity").append(str);
		}
	}
});

function customAjax(pageNo,pageSize,searchType,keyword,city){
	keyword=encodeURI(encodeURI(keyword));
	$.ajax({
		type:"get",
		url:"${pageContext.request.contextPath}/back/custom/findPageCustomAjax.action",
		data:"pageNo="+pageNo+"&pageSize="+pageSize+"&searchType="+searchType+"&keyword="+keyword+"&city="+city,
		success:function(data){
			$("#tbody").empty();
			for(var item in data.customExtends){
				
				var str="<tr><td><input class="+"\"raido\""+" type="+"\"checkbox\""+" name="+"\"customid\""+" /></td><td><span>"+data.customExtends[item].customid+"</span></td><td><span>"+data.customExtends[item].name+"</span></td><td><span>";
				if(data.customExtends[item].sex==0){
					str+="男";
				} else {
					str+="女";
				}
				str+="</span></td><td><span>"+data.customExtends[item].phone+"</span></td><td><span>"+time+"</span></td><td><span>"+data.customExtends[item].wechat+"</span></td>";
				str+="<td>";
				str+="<a href="+"\"${pageContext.request.contextPath }/back/custom/selectCustom.action?customid="+data.customExtends[item].customid+"\""+"class="+"\"tablelink\""+">添加亲属</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				str+="<a href="+"\"${pageContext.request.contextPath }/back/custom/findCustomRelativesResultMap.action?customid="+data.customExtends[item].customid+"\""+"class="+"\"tablelink\""+">查看详情</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				str+="<a href="+"\"${pageContext.request.contextPath }/back/custom/updateCustom.action?customId="+data.customExtends[item].customid+"\""+" class="+"\"tablelink\""+">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				str+="<a href="+"\"${pageContext.request.contextPath }/back/custom/deleteCustomByCustomid.action?customid="+data.customExtends[item].customid+"\""+"class="+"\"tablelink\""+">删除</a>"+ "</td></tr>";
				$("#tbody").append(str);
			}
			$("#spageNo").html(data.pageNo);
			$("#scount").html(data.count);
			$("#keyword").val(data.keyword);
			$("#searchType").val(data.searchType);
			$("#scity").val(data.city);
		}
	});	
};
$("#home").click(function(){
	var pageNo=0;
	var pageSize=$("#spageSize").val();
	var searchType=$("#searchType").val();
	var keyword=$("#keyword").val();
	var city=$("#scity").val();
	customAjax(pageNo,pageSize,searchType,keyword,city);
	$("#spageNo").html(0);
	return false;
});
$("#next").click(function(){
	var pageNo=parseInt($("#spageNo").html());
	var count=parseInt($("#scount").text());
	var pageSize=parseInt($("#spageSize").val());
	var city=$("#scity").val();
	if(parseInt(count/pageSize)==pageNo){
		$(this).attr('disabled',"true");
	} else {
		$(this).removeAttr("disabled"); 
		pageNo=parseInt(pageNo)+1;
	}
	
	var searchType=$("#searchType").val();
	var keyword=$("#keyword").val();
	customAjax(pageNo,pageSize,searchType,keyword,city);
	$("#spageNo").html("");
	$("#spageNo").html(parseInt(pageNo));
	return false;
});
$("#pre").click(function(){
	var pageNo=parseInt($("#spageNo").html());
	var count=parseInt($("#scount").text());
	var pageSize=parseInt($("#spageSize").val());
	var city=$("#scity").val();
	if(pageNo<=0){
		$(this).attr('disabled',"true");
	} else {
		$(this).removeAttr("disabled"); 
		pageNo=parseInt(pageNo)-1;
	}
	
	var searchType=$("#searchType").val();
	var keyword=$("#keyword").val();
	customAjax(pageNo,pageSize,searchType,keyword,city);
	$("#spageNo").html("");
	$("#spageNo").html(pageNo);
	return false;
});
$("#last").click(function(){
	var count=parseInt($("#scount").text());
	var pageSize=$("#spageSize").val();
	var pageNo=parseInt(count/pageSize);
	var searchType=$("#searchType").val();
	var keyword=$("#keyword").val();
	customAjax(pageNo,pageSize,searchType,keyword);
	$("#spageNo").html(pageNo);
	return false;
});
$("#forward").click(function(){
	var count=parseInt($("#scount").text());
	var spageNo=parseInt($("#spageNo").text());
	var pageSize=$("#spageSize").val();
	var ipageNo=parseInt($("#ipageNo").val());
	var xpageNo=parseInt(count/pageSize);
	var pageNo=spageNo;
	var city=$("#scity").val();
	if(ipageNo>=0&&ipageNo<=xpageNo){
		pageNo=ipageNo;
	} 
	
	var searchType=$("#searchType").val();
	var keyword=$("#keyword").val();
	customAjax(pageNo,pageSize,searchType,keyword,city);
	$("#spageNo").html(pageNo);
	return false;
	
});
$("#sbtn").click(function(){
	var pageNo=0;
	var pageSize=$("#spageSize").val();
	var searchType=$("#searchType").val();
	var keyword=$("#keyword").val();
	var city=$("#scity").val();
	customAjax(pageNo,pageSize,searchType,keyword,city);
	$("#spageNo").html(0);
	return false;
});
</script>
</html>
