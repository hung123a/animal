<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>동물 커뮤니티</title>
<!-- 제이쿼리 -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/scrollify/1.0.19/jquery.scrollify.min.js"></script>
<script type="text/javascript" src="/resources/js/main.js"></script>
<link rel="stylesheet" href="/resources/css/header.css">
<link rel="stylesheet" href="/resources/css/home.css">

</head>
<body>
	<div id="cont">
		<div id="main">
			<!-- header 영역 -->
			<jsp:include page="header.jsp"></jsp:include>
			<!-- header 영역 끝 -->

			<!-- 센터 영역 -->
			<div id="center">
				<div id="animal" class="section home" data-section-name="동물소개">
					<h3>동물 소개</h3>
				</div>
				<div id="photo" class="section panel1" data-section-name="사진첩">
					<h3>사진첩</h3>
				</div>
				<div id="free" class="section panel2" data-section-name="자유게시판">
					<h3>자유게시판</h3>
				</div>
				<div id="tendinous" class="section panel3" data-section-name="건의게시판">
					<h3>건의게시판</h3>
				</div>
			</div>

			<!-- 바닥 영역 -->
			<div id="footer">
				<footer>
					<div>&copy;2021</div>
				</footer>
			</div>
		</div>
	</div>
</body>
</html>
