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
<script type="text/javascript" src="/resources/js/page.js"></script>
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
				<div class="wrap" id="animal_tap" style="display: none;">
					<!-- 동물 소개 제목 -->
					<div id="animal_menu">
						<div id="animal_title">
							<h1>
								<a href="#">동물 소개</a>
							</h1>
						</div>
						<!-- 검색영역 -->
						<div id="seach">
							<form id="seachForm" method="get">
								<select name="menu" class="select_menu">
									<optgroup label="CATEGORY" class="CATEGORY"></optgroup>
									<option value="LBS">전체 글 보기</option>
									<option value="L">육지 동물</option>
									<option value="B">조류</option>
									<option value="S">해상 동물</option>
								</select> <input type="text" name="keyword" class="keyword"> <input
									type="hidden" name="pageNum" value="#"> <input
									type="hidden" name="amount" value="#"> <input
									type="button" value="검색" class="button">
							</form>
						</div>
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
						</a>
					</div>
					<div id="animal_bth">
						<a href=""><input type="button" value="글쓰기" class="bth"></a>
					</div>
				</div>
				<!-- 동물 소개 끝 -->

				<!-- 사진첩 -->
				<div class="wrap" id="photo_tap" style="display: none;">
					<div id="photo_title">
						<h1>
							<a href="#">사진첩</a>
						</h1>
					</div>
					<div id="photo_ranking">
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
					<div id="photo_bth">
						<a href=""><input type="button" value="글쓰기" class="bth"></a>
					</div>
				</div>
				<!-- 사진첩 끝 -->

				<!-- 자유게시판 -->
				<div class="wrap" id="free_tap" style="display: none;">
					<div class="free_title">
						<h2>
							<a href="">자유게시판</a>
						</h2>
					</div>
					<div id="free_caution">
						<ol>
							<li>저속한 표현이나 비방, 선전＇광고 등 상업적인 내용, 게시판 목적에 부합하지 않는 글은 관리자에 의해
								예고 없이 삭제될 수 있습니다.</li>
							<li>자유게시판은 누구나 자유롭게 의견을 게시하여 소통하는 공간으로 회신이나 답변해 드리지 않습니다.</li>
							<li>답변을 원하시면 건의 게시판을 이용하시기 바랍니다.</li>
						</ol>
					</div>
					<div id="free_menu">
						<div id="free_ranking">
							<ul>
								<li><a href="#">최신순</a></li>
								<li><a href="#">조회수</a></li>
								<li><a href="#">오래된순</a></li>
							</ul>
						</div>
						<!-- 검색영역 -->
						<div id="free_seach">
							<form id="seachForm" method="get">
								<select name="menu" class="select_menu">
									<optgroup label="CATEGORY" class="CATEGORY"></optgroup>
									<option value="T">제목</option>
									<option value="S">작성자</option>
								</select> <input type="text" name="keyword" class="keyword"> <input
									type="hidden" name="pageNum" value="#"> <input
									type="hidden" name="amount" value="#"> <input
									type="button" value="검색" class="button">
							</form>
						</div>
					</div>
					<!-- 자유게시판 미리 보기 -->
					<div id="free_contents">
						<div id="free_board">
							<div class="free_no">번호</div>
							<div class="free_small_title">제목</div>
							<div class="free_id">이름</div>
							<div class="free_data">날짜</div>
							<div class="free_cnt">조회수</div>
							<div class="free_like">추천수</div>
						</div>
						<a href="#">
							<div id="free_board_conten">
								<div class="free_no">1</div>
								<div class="free_small_title">애완동물</div>
								<div class="free_id">고양이</div>
								<div class="free_data">2022-10-25</div>
								<div class="free_cnt">1</div>
								<div class="free_like">11</div>
							</div>
						</a>
						<div id="free_bth">
							<a href=""><input type="button" value="글쓰기" class="bth"></a>
						</div>
					</div>
					<!-- 자유게시판 미리 보기 끝 -->
				</div>
				<!-- 자유게시판 끝 -->

				<!-- 건의게시판 -->
				<div class="wrap" id="tendinous_tap" style="display: none;">
					<div id="tendinous_title">
						<h2>
							<a href="">건의게시판</a>
						</h2>
					</div>
					<div id="tendinous_ranking">
						<ul>
							<li><a href="#">최신순</a></li>
							<li><a href="#">조회수</a></li>
							<li><a href="#">오래된순</a></li>
						</ul>
					</div>
					<!-- 건의게시판 미리 보기 -->
					<div id="tendinous_contents">
						<div id="tendinous_board">
							<div class="no">번호</div>
							<div class="board_title">제목</div>
							<div class="board_id">이름</div>
							<div class="board_data">날짜</div>
							<div class="board_cnt">조회수</div>
						</div>
						<a href="#">
							<div id="tendinous_board_conten">
								<div class="no">1</div>
								<div class="board_title">재밌게 바꿔주세요</div>
								<div class="board_id">한국</div>
								<div class="board_data">2022-10-25</div>
								<div class="board_cnt">5</div>
							</div>
						</a>
						<div id="tendinous_bth">
							<a href=""><input type="button" value="글쓰기" class="bth"></a>
						</div>
					</div>
					<!-- 건의 게시판 미리 보기 끝 -->
				</div>
				<!-- 건의게시판 끝 -->
			</div>
		</div>
		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
