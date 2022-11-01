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
<style rel="stylesheet">
table {
	            border: 3px solid skyblue        
}

                td {
	            border: 1px solid skyblue        
}

                #title {
	            background-color: skyblue        
}
</style>
</head>
<body>
	<div id="main_frame">
		<div>
			<a href="/"><img src="/resources/img/animal community(login).png"
				class="img"></a>
		</div>
		<form>
			<table border="1">
				<tr>
					<td class="title">아이디</td>
					<td><input type="text" name="id" maxlength="15"
						placeholder="아이디"> <input type="button" value="중복확인"></td>
				</tr>
				<tr>
					<td class="title">비밀번호</td>
					<td><input type="password" name="pwd" maxlength="15"
						placeholder="비밀번호"></td>
				</tr>
				<tr>
					<td class="title">비밀번호 확인</td>
					<td><input type="password" name="pwd" maxlength="15"
						placeholder="비밀번호 확인"></td>
				</tr>
				<tr>
					<td class="title">이름</td>
					<td><input type="text" name="name" maxlength="10"
						placeholder="이름"></td>
				</tr>
				<tr>
					<td class="title">전화번호</td>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<td class="title">생년월일</td>
					<td><input type="text" name="bth" maxlength="4"
						placeholder="년도(4자)" size="6"> <select name="bth">
							<option value="">월</option>
							<option value="01">1</option>
							<option value="02">2</option>
							<option value="03">3</option>
							<option value="04">4</option>
							<option value="05">5</option>
							<option value="06">6</option>
							<option value="07">7</option>
							<option value="08">8</option>
							<option value="09">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
					</select> <input type="text" name="bth" maxlength="2" placeholder="일"
						size="4"></td>
				</tr>
				<tr>
					<td class="title">성별</td>
					<td><input type="radio" name="gender" value="남" checked>남
						<input type="radio" name="gender" value="여" checked>여</td>
				</tr>
			</table>
		</form>
		<div class="links">
			<a href="#">아이디/비밀번호 찾기</a>
		</div>
	</div>
</body>
</html>