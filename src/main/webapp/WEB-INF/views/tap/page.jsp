<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>동물 커뮤니티</title>
<!-- 제이쿼리 -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/scrollify/1.0.19/jquery.scrollify.min.js"></script>
<!-- 페이지 이동 관련 JS -->
<script type="text/javascript" src="/resources/js/tap/page.js"></script>
<link rel="stylesheet" href="/resources/css/tap/page.css">
<link rel="stylesheet" href="/resources/css/Public.css">

</head>
<body>
	<div id="cont">
		<!-- header 영역 -->
		<jsp:include page="../include/header.jsp"></jsp:include>
		<!-- header 영역 끝 -->
		<div id="center">
			<div class="wrap" id="main">
				<!-- 동물 소개 -->
				<jsp:include page="../information/information.jsp"></jsp:include>
				<!-- 동물 소개 끝 -->

				<!-- 사진첩 -->
				<jsp:include page="../photo/photo.jsp"></jsp:include>
				<!-- 사진첩 끝 -->

				<!-- 자유게시판 -->
				<jsp:include page="../free_board/freeboard.jsp"></jsp:include>
				<!-- 자유게시판 끝 -->

				<!-- 건의게시판 -->
				<jsp:include page="../tendinous/tendinous.jsp"></jsp:include>
				<!-- 건의게시판 끝 -->
			</div>
		</div>
		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
