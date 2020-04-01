<%@page import="com.ssm.dto.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%

List<Emp> list = (List<Emp>)request.getAttribute("list");
%>
<body>

<table border='1px'>
	<tr>
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
</table>
</body>
</html>