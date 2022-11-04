<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="/resources/css/login.css">
</head>
<body>

	<div id="main_frame">
		<div>
			<a href="/"><img src="/resources/img/animal community(login).png"
				class="img"></a>
		</div>
		<form>
			<input type="text" name="id" class="text_field" placeholder="아이디"><br>
			<input type="text" name="password" class="text_field"
				placeholder="비밀번호"><br> <input type="submit"
				value="로그인" class="login_bth"><br> <input type="submit"
				value="회원가입" class="login_bth" formaction="/signup">
		</form>
		<div class="links">
			<a href="/find">아이디/비밀번호 찾기</a>
		</div>
	</div>
</body>
</html>