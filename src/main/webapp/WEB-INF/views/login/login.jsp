<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="true"%>
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
		<form name="f1" method="post">
			<input type="text" id="id" name="id" class="text_field" placeholder="아이디" maxlength="20" onKeyDown="if(event.keyCode == 13) loginChk()"><br>
			<input type="password" id="pwd" name="pwd" class="text_field" placeholder="비밀번호" maxlength="20" onKeyDown="if(event.keyCode == 13) loginChk()"><br> 
			<input type="button" value="로그인" class="login_bth" onclick="loginChk()"><br>
		</form> 
			<a href="/signup"><input type="button" value="회원가입" class="login_bth"></a>		
		<div class="links">
			<a href="/find">아이디/비밀번호 찾기</a>
		</div>
	</div>
</body>
</html>