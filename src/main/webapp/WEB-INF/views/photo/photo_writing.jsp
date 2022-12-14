<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%-- <%@ page session="true"%> --%>
<html>
<head>
<meta charset="UTF-8">
<title>사진첩 글쓰기</title>
<!-- 제이쿼리 -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- 사진첩 글쓰기 css -->
<link rel="stylesheet" href="/resources/css/photo/photo.css">
<script type="text/javascript" src="/resources/js/photo/photo.js"></script>
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
					<form action="/photo_writing" method="post" role="form"
						id="photo_form" enctype="multipart/form-data">
						<!-- 내용 전체 -->
						<div id="photo_border">
							<input type="hidden" name="bgno" value="2"> <input
								type="hidden" name="id" value="${sessionScope.login.id}">

							<div id="board">
								<div class="photo_title">이미지을 해당 영역으로 끌어다 놓으세요.</div>
								<label for="file" id="button">
									<div class="btn-upload" id="upload">파일 업로드</div>
								</label>
								<div id="uploadDiv">
									<input type="file" id="file" name="photo">
								</div>
							</div>
						</div>
					</form>
					<div id="uploadResult">
						<ul>

						</ul>
					</div>

					<div id="menu_bth">
						<div class="btn">
							<button type="button" value="등록하기" class="bth">등록하기</button>
						</div>

						<div class="btn">
							<a href="/page?bgno=2&pageNum=1"><input type="button" value="목록으로"
								class="bth"></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 이미지 드래그 앤 드롭 이벤트 -->
	<!-- <script type="text/javascript" src="/resources/js/photo/drop.js"></script> -->
</body>
</html>
