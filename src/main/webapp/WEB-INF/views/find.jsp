<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디/비밀번호 찾기</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet" href="/resources/css/find.css">
</head>
<body>

	<div id="frame">
<div id="tap">
  <div id="id_search"class="menu_tap">아이디 찾기</div>	
  <div id="pwd_search" class="menu_tap">비밀번호 찾기</div>
</div>
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
      <input type="submit"
				value="아이디 찾기" class="login_bth">   
      
      <input type="submit"
				value="비밀번호 찾기" class="login_bth" formaction="/signup">
		</form>

	</div>
  <div>
</body>
</html>