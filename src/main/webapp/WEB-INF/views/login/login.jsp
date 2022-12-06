<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="/resources/css/login/login.css">
<script type="text/javascript" src="/resources/js/login/login.js"></script>
</head>
<body>

	<div id="main_frame">
		<div>
			<a href="/"><img src="/resources/img/animal community(login).png"
				class="img"></a>
		</div>
		<form action="/login/login_post" method="post" id="login">
			<input type="text" id="id" name="id" class="text_field" placeholder="아이디" maxlength="20"><br>
			<input type="password" id="password" name="password" class="text_field" placeholder="비밀번호" maxlength="20"><br> 
			<c:choose>
			<c:when test="${sessionScope.login==null}">
			<input type="submit" value="로그인" class="login_bth"><br>
			</c:when>			
			</c:choose>
		</form> 
			<a href="/signup"><input type="button" value="회원가입" class="login_bth"></a>		
		<div class="links">
			<a href="/find">아이디/비밀번호 찾기</a>
		</div>
	</div>
</body>
</html>