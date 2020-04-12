<%@page import="com.ssm.dto.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	.insert{
	width: 40px;
	height: 100%; 
	}
</style>
</head>

<body>
<%

List<Emp> list = (List<Emp>)request.getAttribute("list");
%>
<body>

<table border='1px'>
	<tr>
		<th>   </th>
		<th>员工编号</th>
		<th>员工姓名</th>
		<th>员工职位</th>
		<th>员工上司</th>
		<th>员工入职日期</th>
		<th>薪水</th>
		<th>奖金</th>
		<th>部门编号</th>
		<th>操作</th>
	</tr>
	<%for(Emp emp :list) { %>
	<tr>
		<td><%=emp.getEmpid() %></td>
		<td><%=emp.getEmpno() %></td>
		<td><%=emp.getEname() %></td>
		<td><%=emp.getJob() %></td>
		<td><%=emp.getMgr() %></td>
		<td><%=emp.getHiredate() %></td>
		<td><%=emp.getSal() %></td>
		<td><%=emp.getComm() %></td>
		<td><%=emp.getDeptno() %></td>
		<td><a href="">修改</a><a href="">删除</a></td>
	</tr>
	<%} %>
	<tr>
	<form action="${pageContext.request.contextPath}/InsertorUpdate">
	
		<td><input type="input"readonly unselectable="on"class="insert"name="empid" id ="empid" value=0></td>
		<td><input type="input"class="insert"name="empno"></td>
		<td><input type="input"class="insert"name="ename"></td>
		<td><input type="input"class="insert"name="job"></td>
		<td><input type="input"class="insert"name="mgr"></td>
		<td><input type="input"class="insert"name="hiredate"></td>
		<td><input type="input"class="insert"name="sal"></td>
		<td><input type="input"class="insert"name="comm"></td>
		<td><input type="input"class="insert"name="deptno"></td>
		<td><input type="submit" id="sub" value="新增"></td>
		</form>
	</tr>
</table>
<script src="${pageContext.request.contextPath }/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$("#sub").click(function() {
		if ($("#empid").val()==null){
			$("#empid").val(0);
			return true;
		}
	});

</script>
</body>
</html>