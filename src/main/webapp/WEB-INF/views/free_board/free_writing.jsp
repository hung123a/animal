<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 글쓰기</title>
<!-- 제이쿼리 -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- 사진첩 글쓰기 css -->
<link rel="stylesheet" href="/resources/css/free_board/free_board.css">
<!-- 겹치는 css -->
<link rel="stylesheet" href="/resources/css/Public.css">
</head>
<body>
	<div id="cont">
		<!-- header 영역 -->
		<jsp:include page="../include/header.jsp"></jsp:include>
		<!-- header 영역 끝 -->
		<div id="photo_center">
			<div class="wrap" id="main">
				<div class="wrap tap">
					<div id="free_title">
						<h1>
							<a href="#">자유게시판 글쓰기</a>
						</h1>
					</div>
					<!-- 자유게시판 글쓰기 내용 -->
					<div id="free_writing_board">
						<div id="middle">
							<div class="main_content">
								<div class="main_title">제목</div>
								<div id="main_Contents">내용</div>
							</div>
							<div class="sub_content">
								<div class="sub_title">
									<input type="text">
								</div>
								<div id="sub_Contents">
									<textarea cols="" rows=""></textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
