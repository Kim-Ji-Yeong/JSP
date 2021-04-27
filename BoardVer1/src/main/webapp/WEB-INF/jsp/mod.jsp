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
<title>수정</title>
</head>
<body>
	<h1>글수정</h1>
	<form action="/mod" method="post">
		<!-- 많은 자료를 올릴시에는(아이디,비밀번호같은 노출x인 것도) post방식 사용 -->
		<input type ="hidden" name = "num" value = "<%=a %>">
		<div>
			제목 : <input type="text" name="title" value = "<%=vo.getTitle() %>">
			<!-- name이 키값 , name 에 적혀있는게 value 값-->
		</div>
		<div>
			내용 :
			<textarea name="ctnt" rows="10" cols="10"><%=vo.getCtnt() %></textarea>
		</div>
		<div>
			<input type="submit" value="글쓰기"> <input type="reset"
				value="초기화">
		</div>
	</form>

</body>
</html>