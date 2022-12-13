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
				<div class="wrap tap" id="photo_tap">
					<div class="title">
						<h1>사진첩</h1>
					</div>
					<div class="page_menu">
						<div class="ranking">
							<ul>
								<li><a href="#">최신순</a></li>
								<li><a href="#">조회수</a></li>
								<li><a href="#">오래된순</a></li>
							</ul>
						</div>
					</div>

					<div class="contents">
						<c:forEach items="${photo}" var="photo">
							<div class="photo_img">
								<img class="photo_img1" src="/display?filename=${photo.ph_img}">
							</div>
						</c:forEach>
					</div>
					<div class="bottom">
						<!-- prev(이전)이 true이면 이전버튼 화설화 -->
						<c:if test="${ppaging.prev}">
							<a
								href="/page?bgno=2&pageNum=${ppaging.startPage-1}&amount=${ppaging.pcri.amount}">이전</a>
						</c:if>

						<!-- begin(1) end(10)될 동안 반복(1일 10일 될 동안 반복) -->
						<c:forEach begin="${ppaging.startPage}" end="${ppaging.endPage}"
							var="num">
							<a
								href="/page?bgno=2&ktype=${ppaging.pcri.ptype}&keyword=${ppaging.pcri.pkeyword}&pageNum=${num}&amount=${ppaging.pcri.amount}">${num}</a>
						</c:forEach>

						<!-- next(다음)이 true이면 다음버튼 활성화 -->
						<c:if test="${ppaging.next}">
							<a
								href="/page?bgno=2&pageNum=${ppaging.endPage+1}&amount=${ppaging.icri.amount}">다음</a>
						</c:if>
						<br>
						<!-- ${paging} -->
						<c:choose>
							<c:when test="${sessionScope.login.id==null}">
								<div class="pbtn"></div>
							</c:when>
							<c:otherwise>
								<div class="pbtn">
									<a href="/photo"><input type="button" value="글쓰기"
										class="bth"></a>
								</div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
		</div>
		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
