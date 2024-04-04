<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/member/view" method="post">
아이디 : 
<input type="text" value="" name="id">${id }<br>
패수워드 : 
<input type="text" value="" name="pw">${pw }<br>
이름 : 
<input type="text" value="" name="name">${name }<br>
이메일 : 
<input type="text" value="" name="email">${email}<br>
나이 : 
<input type="text" value="" name="age">${age }<br>
<button type="submit">등록</button>
<input type="reset" value="리셋">
</form>
</body>
</html>