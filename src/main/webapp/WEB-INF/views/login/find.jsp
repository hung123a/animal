<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디/비밀번호 찾기</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<!-- 탭메뉴 클릭 이벤트, 휴대폰 번호 하이픈 -->
<script type="text/javascript" src="/resources/js/login/find_id.js"></script>
<link rel="stylesheet" href="/resources/css/login/model.css">
<link rel="stylesheet" href="/resources/css/login/find.css">
</head>
<body>
	<!--파일 불러오기-->
	<jsp:include page="../include/model.jsp"></jsp:include>

	<div id="frame">
		<div>
			<div id="tap">
				<div id="id_search" class="menu_tap">아이디 찾기</div>
				<div id="pwd_search" class="menu_tap">비밀번호 찾기</div>
			</div>
			<div id="main_frame">
				<div>
					<a href="/"><img
						src="/resources/img/animal community(login).png" class="img"></a>
				</div>
				<form method="post">
					<div id="find_id">
						<div class="area" id="name_box">
							<div class="title_content">
								<div class="title">Name</div>
							</div>
							<div class="conten">
								<div class="Information">
									<div class="box">
										<img class="svg" src="/resources/img/person_icon.svg">
									</div>
									<input type="text" id="id_name" class="text" name="id_name"
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
									<input type="text" id="id_email" class="text" name="email"
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
									<input type="text" id="id_phone" class="text" name="phone"
										placeholder="전화번호" oninput="autophone(this)" maxlength="13">

								</div>
							</div>
						</div>
						<input type="button" value="아이디 찾기" class="login_bth"
							id="findid_search" onclick="id_click()">
					</div>
				</form>

				<!-- 비밀번호 찾기 -->
				<form method="post">
					<div id="find_pwd" style="display: none">
						<div class="area" id="name_box">
							<div class="title_content">
								<div class="title">Name</div>
							</div>
							<div class="conten">
								<div class="Information">
									<div class="box">
										<img class="svg" src="/resources/img/person_icon.svg">
									</div>
									<input type="text" id="pwd_name" class="text" name="name"
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
									<input type="text" id="pwd_id" class="text" name="id"
										placeholder="아이디" maxlength="10">
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
									<input type="text" id="pwd_email" class="text" name="email"
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
										placeholder="전화번호" maxlength="13">
								</div>
							</div>
						</div>
						<input type="submit" value="비밀번호 찾기" class="login_bth"
							id="find_pwd" formaction="/signup">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
<!-- 아이디 찾기 js -->
<script type="text/javascript" src="/resources/js/login/find.js"></script>
</html>