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
<!-- 회원가입 관련 js -->
<script type="text/javascript" src="/resources/js/Signup.js"></script>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<link rel="stylesheet" href="/resources/css/login.css">
<link rel="stylesheet" href="/resources/css/signup.css">
</head>
<body>
	<div id="main_frame">
		<div>
			<a href="/"><img src="/resources/img/animal community(login).png"
				class="img"></a>
		</div>
		<form action="/signup" method="post">
			<div id="signup">
				<div class="area" id="name_box">
					<div class="title_content">
						<div class="title">Name</div>
					</div>
					<div class="conten">
						<div class="Information">
							<div class="box">
								<img class="svg" src="/resources/img/person_icon.svg">
							</div>
							<input type="text" id="name" class="text" name="name"
								placeholder="이름" maxlength="10">
						</div>
					</div>
				</div>
				<div class="area" id="id_box">
					<div class="title_content">
						<div class="title">id</div>
					</div>
					<div class="conten">
						<div class="Information">
							<div class="box">
								<img class="svg" src="/resources/img/person_icon.svg">
							</div>
							<input type="text" id="id" class="text" name="id"
								placeholder="아이디" maxlength="15">
						</div>
					</div>
				</div>
				<div class="area" id="pwd_box">
					<div class="title_content">
						<div class="title">Password</div>
					</div>
					<div class="conten">
						<div class="Information">
							<div class="box">
								<img class="svg" src="/resources/img/person_icon.svg">
							</div>
							<input type="password" id="pwd" class="text" name="pwd"
								placeholder="비밀번호">
						</div>
					</div>
				</div>
				<div class="area" id="pwd_box2">
					<div class="title_content">
						<div class="title">Confirm Password</div>
					</div>
					<div class="conten">
						<div class="Information">
							<div class="box">
								<img class="svg" src="/resources/img/person_icon.svg">
							</div>
							<input type="password" id="pwd2" class="text" name="pwd2"
								placeholder="비밀번호 확인">
						</div>
					</div>
				</div>
				<div class="area" id="email_box">
					<div class="title_content">
						<div class="title">E-mail</div>
					</div>
					<div class="conten">
						<div class="Information">
							<div class="box">
								<img class="email_svg" src="/resources/img/email.svg">
							</div>
							<input type="text" id="email" class="text" name="email"
								placeholder="이메일" maxlength="20">
						</div>
					</div>
				</div>
				<div class="area" id="phone_box">
					<div class="title_content">
						<div class="title">phone</div>
					</div>
					<div class="conten">
						<div class="Information">
							<div class="box">
								<img class="phone_svg" src="/resources/img/phone.svg">
							</div>
							<input type="text" id="phone" class="text" name="phone"
								placeholder="전화번호" maxlength="20">
						</div>
					</div>
				</div>
			</div>
			<div>
				<input type="submit" id="signup_btn" value="가입하기">
			</div>
		</form>
	</div>
</body>
</html>