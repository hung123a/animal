<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>사진첩 글쓰기</title>
<!-- 제이쿼리 -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- 사진첩 글쓰기 css -->
<link rel="stylesheet" href="/resources/css/photo/photo.css">

<!-- 공용 css -->
<link rel="stylesheet" href="/resources/css/Public.css">

</head>
<body>
	<div id="cont">
		<!-- header 영역 -->
		<jsp:include page="../include/header.jsp"></jsp:include>
		<!-- header 영역 끝 -->
		<div id="photo_center">
			<div class="wrap" id="main">
				<div class="wrap" id="photo_tap">
					<div id="photo_title">
						<h1>사진첩 글쓰기</h1>
					</div>
					<!-- 내용 전체 -->
					<div id="photo_border">
						<div class="photo_all">
							<div id="board">
								<div class="photo_title">이미지을 해당 영역으로 끌어다 놓으세요.</div>
								<label for="file" id="button">
									<div class="btn-upload" id="upload">파일 업로드</div>
								</label> <input type="file" id="file">
							</div>
						</div>
					</div>
					<div class="btn">
						<a href=""><input type="button" value="등록하기" class="bth"></a>
					</div>
					<div class="btn">
						<a href="/page?type=photo"><input type="button" value="목록으로"
							class="bth"></a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 이미지 드래그 앤 드롭 이벤트 -->
	<script type="text/javascript" src="/resources/js/photo/photo.js"></script>
</body>
</html>
