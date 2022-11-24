<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<link rel="stylesheet" href="/resources/css/home.css">

</head>
<body>
	<div id="cont">
		<div id="main">
			<!-- header 영역 -->
			<jsp:include page="../views/include/header.jsp"></jsp:include>
			
			<!-- header 영역 끝 -->

			<!-- 센터 영역 -->
			<div id="center">
				<!-- 동물 소개  -->
				<div id="animal" class="section home" data-section-name="동물소개">
					<!-- 동물 소개 내용 넓이를 지정해줄 div -->
					<div class="wrap">
						<!-- 동물 소개 영역을 감싸는 div -->
						<div id="animal_menu" class="center_menu">
							<!-- 동물 소개 제목 -->
							<div id="animal_title" class="title">
								<h1>
									<a href="/page?type=information">동물 소개</a>									
								</h1>
								<!-- 동물 소개 제목 끝 -->
							</div>

							<!--  동물 소개의 미리보기 -->
							<div id="animal_tap">
								<!-- 육지 동물 소개 -->
								<div id="land_animal" class="animal_tap">
									<!-- 육지 동물 소제목 -->
									<div id="land_title" class="animal_title">
										<h2>
											<a href="">육지 동물</a>
										</h2>
										<!-- 육지 동물 소제목 끝 -->
									</div>


									<!-- 육지 동물 내용 -->
									<div class="animal_img_tap">
										<a href=""> <!-- img 영역 -->
											<div class="animal_img">
												<img src="/resources/img/st_1.png">
											</div> <!-- img 영역 끝 --> <!-- 설명 -->
											<div class="conten">
												<div class="animal_small_title">
													<h3>치타</h3>
												</div>
												<div class="animal_conten">육지에서 가장 빠른동물</div>
											</div> <!-- 설명 끝 -->
										</a>
										<!-- 육지 동물 내용 끝 -->
									</div>
									<!-- 육지 동물 소개 끝 -->
								</div>


								<!-- 해상 동물 소개 -->
								<div id="sea ​​_nimals" class="animal_tap">
									<!-- 해상 동물 소제목 -->
									<div id="sea_title" class="animal_title">
										<h2>
											<a href="">해상 동물</a>
										</h2>
										<!-- 해상 동물 소제목 끝 -->
									</div>
									<!-- 해상 동물 내용 -->
									<div class="animal_img_tap">
										<a href=""> <!-- img 영역 -->
											<div class="animal_img">
												<img src="/resources/img/st_2.png">
											</div> <!-- img 영역 끝 --> <!-- 설명 -->
											<div class="conten">
												<div class="animal_small_title">
													<h3>흰수염고래</h3>
												</div>
												<div class="animal_conten">바다에서 가장 큰 동물</div>
											</div> <!-- 설명 끝 -->
										</a>
										<!-- 해양 동물 내용 끝 -->
									</div>
									<!-- 해상 동물 소개 끝 -->
								</div>


								<!-- 공중 동물 소개 -->
								<div id="aerial_animal" class="animal_tap">
									<!-- 공중 동물 소제목 -->
									<div id="aerial_title" class="animal_title">
										<h2>
											<a href="">공중 동물</a>
										</h2>
										<!-- 공중 동물 소제목 끝 -->
									</div>
									<!-- 공중 동물 내용-->
									<div class="animal_img_tap">
										<a href=""> <!-- img 영역 -->
											<div class="animal_img">
												<img src="/resources/img/st_3.png">
											</div> <!-- img 영역 끝 --> <!-- 설명 -->
											<div class="conten">
												<div class="animal_small_title">
													<h3>매</h3>
												</div>
												<div class="animal_conten">공중에서 가장 빠른 동물</div>
											</div> <!-- 설명 끝 -->
										</a>
										<!-- 공중 동물 내용 끝 -->
									</div>
									<!-- 공중 동물 소개 끝 -->
								</div>
								<!--  동물 소개의 미리보기 끝 -->
							</div>
							<!-- 동물 소개 영역을 감싸는 div 끝 -->
						</div>
						<!-- 영역 넓이 지정할 div -->
					</div>
					<!-- 동물 소개 끝 -->
				</div>


				<!-- 사진첩 -->
				<div id="photo" class="section panel1" data-section-name="사진첩">
					<!-- 사진첩 내용 넓이를 지정해줄 div -->
					<div class="wrap">
						<!-- 사진첩 영역을 감싸는 div -->
						<div id="photo_menu" class="center_menu">
							<!-- 사진첩 제목 -->
							<div class="title">
								<h1>
									<a href="/page?type=photo">사진첩</a>
								</h1>
								<!-- 사진첩 제목 끝 -->
							</div>
							<!-- 사진첩 미리 보기 -->
							<div id="photo_tap">
								<div id="photo_list">
									<div class="photo_img">
										<a href="#"><img src="/resources/img/image1.jpg"></a>
									</div>
									<div class="photo_img">
										<a href="#"><img src="/resources/img/image1.jpg"></a>
									</div>
									<div class="photo_img">
										<a href="#"><img src="/resources/img/image1.jpg"></a>
									</div>
									<div class="photo_img">
										<a href="#"><img src="/resources/img/image1.jpg"></a>
									</div>
									<div class="photo_img">
										<a href="#"><img src="/resources/img/image1.jpg"></a>
									</div>
									<div class="photo_img">
										<a href="#"><img src="/resources/img/image1.jpg"></a>
									</div>
									<div class="photo_img">
										<a href="#"><img src="/resources/img/image1.jpg"></a>
									</div>
								</div>
								<!-- 사진첩 미리 보기 끝 -->
							</div>
							<!-- 사진첩 영역을 감싸는 div 끝 -->
						</div>
						<!-- 사진첩 내용 넓이를 지정해줄 div -->
					</div>
					<!-- 사진첩 끝 -->
				</div>
				
				<!-- 게시판 내용 넓이 div -->
				<div class="wrap">
					<!-- 게시판 -->
					<div id="board" class="section panel2" data-section-name="게시판">
						<!-- 게시판을 감싸는 div -->
						<div id="board_menu" class="center_menu">
							<!-- 자유게시판 -->
							<div id="left">
								<div class="title">
									<h2>
										<a href="/page?type=free_board">자유게시판</a>
									</h2>
								</div>
								<!-- 자유게시판 미리 보기 -->
								<div class="tap">
									<div class="board" id="free">
										<div class="free_no">번호</div>
										<div class="free_title">제목</div>
										<div class="free_id">이름</div>
										<div class="free_data">날짜</div>
										<div class="free_cnt">조회수</div>
										<div class="free_like">추천수</div>
									</div>
									<a href="#">
										<div class="board_conten">
											<div class="free_no">1</div>
											<div class="free_title">애완동물</div>
											<div class="free_id">고양이</div>
											<div class="free_data">2022-10-25</div>
											<div class="free_cnt">1</div>
											<div class="free_like">11</div>
										</div>
									</a>
								</div>
								<!-- 자유게시판 미리 보기 끝 -->
							</div>
							<!-- 자유게시판 끝 -->
							<!-- 건의게시판 -->
							<div id="right">
								<div class="title">
									<h2>
										<a href="/page?type=tendinous">건의게시판</a>
									</h2>
								</div>
								<!-- 건의게시판 미리 보기 -->
								<div class="tap">
									<div class="board" id="board">
										<div class="no">번호</div>
										<div class="board_title">제목</div>
										<div class="board_id">이름</div>
										<div class="board_data">날짜</div>
										<div class="board_cnt">조회수</div>
									</div>
									<a href="#">
										<div class="board_conten">
											<div class="no">1</div>
											<div class="board_title">재밌게 바꿔주세요</div>
											<div class="board_id">한국</div>
											<div class="board_data">2022-10-25</div>
											<div class="board_cnt">5</div>
										</div>
									</a>
									<!-- 건의 게시판 미리 보기 끝 -->
								</div>
								<!-- 건의게시판 끝 -->
							</div>
							<!-- 게시판을 감싸는 div끝 -->
						</div>
						<!-- 게시판 끝 -->
					</div>
					<!-- 게시판 내용 넓이 div -->
				</div>
				<!-- 센터 영역 -->
			</div>
		</div>
	</div>
</body>
</html>
