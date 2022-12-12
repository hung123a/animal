<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>건의게시판 글쓰기</title>
<!-- 제이쿼리 -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- 사진첩 글쓰기 css -->
<link rel="stylesheet" href="/resources/css/tendinous/tendinous.css">
<!-- 겹치는 css -->
<link rel="stylesheet" href="/resources/css/Public.css">
</head>
<body>
	<div id="cont">
		<!-- header 영역 -->
		<jsp:include page="../include/header.jsp"></jsp:include>
		<!-- header 영역 끝 -->
		<form>
			<div id="tendinous_center">
				<div class="wrap" id="main">
					<div class="wrap tap" id="tap">
						<div id="tendinous_title">
							<h1>건의게시판 글쓰기</h1>
						</div>
						<!-- 자유게시판 글쓰기 내용 -->
						<div id="tendinous_writing_board">
							<div id="middle">
								<div class="main_content">
								    <input type="hidden" name="bgno" value="4">
									<div class="content_title" id="main_title">제목</div>
									<div class="Contents" id="main_Contents">내용</div>
								</div>
								<div class="sub_content">
									<div class="content_title" id="sub_title">
										<input type="text" name="tendinous_title">
									</div>
									<div class="Contents" id="sub_Contents">
										<textarea cols="91" rows="26" name="tendinous_cont"></textarea>
									</div>
								</div>
							</div>
						</div>
						<div class="btn">
							<input type="submit" value="등록하기" class="bth" formaction="/tendinous_writing?id=${sessionScope.login.id}" formmethod="post">
						</div>

						<div class="btn">
							<a href="/page?bgno=4&pageNum=1"><input type="button"
								value="목록으로" class="bth"></a>
						</div>
					</div>
				</div>
			</div>
		</form>
		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
