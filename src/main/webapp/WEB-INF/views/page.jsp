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
<link rel="stylesheet" href="/resources/css/header.css">
<link rel="stylesheet" href="/resources/css/page.css">

</head>
<body>
	<div id="cont">
		<!-- header 영역 -->
		<jsp:include page="header.jsp"></jsp:include>
		<!-- header 영역 끝 -->
		<div id="center">
			<div class="wrap" id="main">
				<!-- 동물 소개 -->
				<div class="wrap" id="animal_tap">
					<!-- 동물 소개 제목 -->
					<div id="animal_title">
						<h1>
							<a href="#">동물 소개</a>
						</h1>
					</div>
					<!-- 검색영역 -->
					<div id="seach">
						<form id="seachForm" method="get">
							<select name="menu">
								<optgroup label="CATEGORY"></optgroup>
								<option value="LBS">전체 글 보기</option>
								<option value="L">육지 동물</option>
								<option value="B">조류</option>
								<option value="S">해상 동물</option>
							</select> <input type="text" name="keyword"> <input type="hidden"
								name="pageNum" value="#"> <input type="hidden"
								name="amount" value="#"> <input type="button" value="검색">
						</form>
					</div>
					<!-- 내용을 감싸는 div -->
					<div id="animal_contents">
						<a href="#">
							<div class="animal_smail_tap">
								<div class="animal_img">
									<img class="animal_img1" src="/resources/img/image1.jpg">
								</div>
								<div class="contents">
									<div class="small_title">
										<h2>소제목</h2>
									</div>
									<div class="small_contents">내용</div>
								</div>
							</div>
						</a> <a href="#">
							<div class="animal_smail_tap">
								<div class="animal_img">
									<img class="animal_img1" src="/resources/img/image1.jpg">
								</div>
								<div class="contents">
									<div class="small_title">
										<h2>소제목</h2>
									</div>
									<div class="small_contents">내용</div>
								</div>
							</div>
						</a> </a> <a href="#">
							<div class="animal_smail_tap">
								<div class="animal_img">
									<img class="animal_img1" src="/resources/img/image1.jpg">
								</div>
								<div class="contents">
									<div class="small_title">
										<h2>소제목</h2>
									</div>
									<div class="small_contents">내용</div>
								</div>
							</div>
						</a> </a> <a href="#">
							<div class="animal_smail_tap">
								<div class="animal_img">
									<img class="animal_img1" src="/resources/img/image1.jpg">
								</div>
								<div class="contents">
									<div class="small_title">
										<h2>소제목</h2>
									</div>
									<div class="small_contents">내용</div>
								</div>
							</div>
						</a>
					</div>
				</div>
				<!-- 동물 소개 끝 -->

				<!-- 사진첩 -->
				<div class="wrap" id="photo_tap">
					<div id="photo_title">
						<h1>
							<a href="#">사진첩</a>
						</h1>
					</div>
					<div id="ranking">
						<ul>
							<li><a href="#">최신순</a></li>
							<li><a href="#">조회수</a></li>
							<li><a href="#">오래된순</a></li>
						</ul>
					</div>
					<div id="photo_contents">
						<div class="photo_img">
							<img class="photo_img1" src="/resources/img/image1.jpg">
						</div>
						<div class="photo_img">
							<img class="photo_img1" src="/resources/img/image1.jpg">
						</div>
						<div class="photo_img">
							<img class="photo_img1" src="/resources/img/image1.jpg">
						</div>
						<div class="photo_img">
							<img class="photo_img1" src="/resources/img/image1.jpg">
						</div>
						<div class="photo_img">
							<img class="photo_img1" src="/resources/img/image1.jpg">
						</div>
					</div>
				</div>
				<!-- 사진첩 끝 -->

				<!-- 자유게시판 -->
				<div class="wrap" id="free_tap"></div>
				<!-- 자유게시판 끝 -->

				<!-- 건의게시판 -->
				<div class="wrap" id="tendinous_tap"></div>
				<!-- 건의게시판 끝 -->
			</div>
		</div>
		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
