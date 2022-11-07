<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>동물 소개 글쓰기</title>
<!-- 제이쿼리 -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/scrollify/1.0.19/jquery.scrollify.min.js"></script>
<!-- 페이지 이동 관련 JS -->
<script type="text/javascript" src="/resources/js/tap/page.js"></script>
<link rel="stylesheet" href="/resources/css/include/header.css">
<link rel="stylesheet" href="/resources/css/tap/page.css">

</head>
<body>
	<div id="cont">
		<!-- header 영역 -->
		<jsp:include page="../include/header.jsp"></jsp:include>
		<!-- header 영역 끝 -->
		<div id="center">
			<div class="wrap" id="main">
				<!-- 동물 소개 -->
				<div class="wrap" id="animal_tap">
					<!-- 동물 소개 분류 -->
					<div id="animal_menu">
						<div id="animal_title">
							<select id="i_type" name="i_type">
								<option>동물</option>
								<option>조류</option>
								<option>어류</option>
							</select>
						</div>
					</div>
					<!-- 내용을 감싸는 div -->
					<div id="animal_contents">
						<!-- 내용 전체 -->
						<div>
							<!-- 왼쪽 -->
							<div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
							</div>
							<!-- 오른쪽 -->
							<div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>
								<div>
									<div></div>
									<div></div>
								</div>								
							</div>
						</div>
					</div>
					<div id="animal_bth">
						<a href=""><input type="button" value="목록으로" class="bth"></a>
					</div>
					<div id="animal_bth">
						<a href=""><input type="button" value="글쓰기" class="bth"></a>
					</div>
				</div>
				<!-- 동물 소개 끝 -->
			</div>
		</div>
		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
