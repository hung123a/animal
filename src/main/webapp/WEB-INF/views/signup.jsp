<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="/resources/css/login.css">
<link rel="stylesheet" href="/resources/css/signup.css">
</head>
<body>
	<div id="main_frame">
		<div>
			<a href="/"><img src="/resources/img/animal community(login).png"
				class="img"></a>
		</div>
		<form>
			<div id="signup">
				<div class="area">
					<div class="title_content">				
						<div class="title">Name</div>
					</div>
					<div class="conten">
					<div class="box"><img class="svg" src="/resources/img/person_icon.svg"></div>
						<input type="text" id="id" name="name" placeholder="이름"
							maxlength="10">
					</div>
				</div>
				<div class="area">
					<div class="title_content">
						<div class="title">id</div>
					</div>
					<div class="conten">
						<input type="text" id="id" name="id" placeholder="아이디"
							maxlength="15">
					</div>
				</div>
				<div class="area">
					<div class="title_content">
						<div class="title">Password</div>
					</div>
					<div class="conten">
						<input type="password" id="pwd" name="pwd" placeholder="비밀번호"
							>
					</div>
				</div>
				<div class="area">
					<div class="title_content">
						<div class="title">Confirm Password</div>
					</div>
					<div class="conten">
						<input type="password" id="pwd" name="pwd" placeholder="비밀번호 확인"
							>
					</div>
				</div>
				<div class="area">
					<div class="title_content">
						<div class="title">E-mail</div>
					</div>
					<div class="conten">
						<input type="text" id="email" name="email" placeholder="이메일"
							maxlength="20">
					</div>
				</div>
				<div class="area">
					<div class="title_content">
						<div class="title">phone</div>
					</div>
					<div class="conten">
						<input type="text" id="phone" name="phone" placeholder="전화번호"
							maxlength="20">
					</div>
				</div>
			</div>
		</form>
		<div class="links">
			<a href="#">아이디/비밀번호 찾기</a>
		</div>
	</div>
</body>
</html>