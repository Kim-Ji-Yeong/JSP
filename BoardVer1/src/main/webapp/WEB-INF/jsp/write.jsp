<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글쓰기</h1>
<form action="/write" method="post"> <!-- 많은 자료를 올릴시에는(아이디,비밀번호같은 노출x인 것도) post방식 사용 -->
	<div>
		제목 : <input type = "text" name = "title"> <!-- name이 키값 , name 에 적혀있는게 value 값-->
	</div>
	<div>
		내용 : <textarea name = "ctnt" rows = "10" cols="10"></textarea>
	</div>
	<div>
		<input type = "submit" value= "글쓰기"> 
	</div>
</form>
</body>
</html>