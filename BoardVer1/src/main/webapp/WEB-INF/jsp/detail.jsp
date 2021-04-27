<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.koreait.board.*"%>
<%
String a = request.getParameter("no");
BoardVO vo = (BoardVO) request.getAttribute("data");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<h1>
		디테일<%=a%></h1>
	<div><%=request.getParameter("no")%></div>
	<div>
		<form action="/del" method="post">
			<input type="hidden" name="no" value="<%=a%>"> <input
				type="submit" value="삭제">

		</form>
		<a href="/mod?no=<%=a%>"><button>수정</button></a>
		<!-- <a href="/del?no=<%=a%>"><button>삭제</button></a> --> <!-- Get방식 -->
	</div>
	<div>
		제목 :
		<%=vo.getTitle()%></div>
	<div><%=vo.getCtnt()%></div>
</body>
</html>