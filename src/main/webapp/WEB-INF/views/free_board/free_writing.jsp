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
<!-- 자유게시판 글쓰기 css -->
<link rel="stylesheet" href="/resources/css/free_board/free_board.css">
<!-- 자유게시판 글쓰기 ajax -->
<script type="text/javascript"
	src="/resources/js/free_board/free_board.js"></script>
<!-- 겹치는 css -->
<link rel="stylesheet" href="/resources/css/Public.css">
</head>
<body>
	<div id="cont">
		<!-- header 영역 -->
		<jsp:include page="../include/header.jsp"></jsp:include>
		<!-- header 영역 끝 -->

		<div id="free_center">
			<div class="wrap" id="main">
				<div class="wrap tap" id="tap">
					<form action="/free_writing" method="post" id="free_form"
						name="free_form" enctype="multipart/form-data">
						<div id="free_title">
							<h1>자유게시판 글쓰기</h1>
						</div>
						<!-- 자유게시판 글쓰기 내용 -->
						<div id="free_writing_board">
							<div id="middle">
								<div class="main_content">
									<div class="content_title" id="main_title">제목</div>
									<div class="Contents" id="main_Contents">내용</div>
									<div class="img">이미지</div>
								</div>
								<div class="sub_content">
									<div class="content_title" id="sub_title">
										<input type="text" name="title" id="title">
									</div>
									<div class="Contents" id="sub_Contents">
										<textarea cols="91" rows="26" name="contents" id="contents"></textarea>
									</div>
									<div class="img">
										<input type="file" id="img" name="img" multiple>
									</div>
								</div>
							</div>
						</div>
						<div class="btn">
							<input type="button" value="등록하기" class="bth" id="uploadBtn">
						</div>
					</form>
					<div class="btn">
						<a href="/page?type=free_board"><input type="button"
							value="목록으로" class="bth"></a>
					</div>
				</div>
			</div>
		</div>

		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
