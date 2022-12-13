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
				<div class="wrap tap" id="free_tap">
					<div class="title">
						<h1>자유게시판</h1>
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
						<div class="ranking">
							<ul>
								<li><a href="#">최신순</a></li>
								<li><a href="#">조회수</a></li>
								<li><a href="#">오래된순</a></li>
							</ul>
						</div>
						<!-- 검색영역 -->
						<div class="seach" id="free_seach">
							<form id="seachForm" method="get">
								<select name="menu" class="select_menu">
									<optgroup label="CATEGORY" class="CATEGORY"></optgroup>
									<option value="TS">제목+작성자</option>
									<option value="T">제목</option>
									<option value="S">작성자</option>
								</select> <input type="text" name="fkeyword" class="keyword"> <input
									type="hidden" name="pageNum" value="#"> <input
									type="hidden" name="amount" value="#"> <input
									type="button" value="검색" class="button">
							</form>
						</div>
					</div>
					<!-- 자유게시판 미리 보기 -->
					<div class="free_contents">
						<div id="free_board">
							<div class="free_no">번호</div>
							<div class="free_small_title">제목</div>
							<div class="free_id">이름</div>
							<div class="free_data">날짜</div>
							<div class="free_cnt">조회수</div>
							<div class="free_like">추천수</div>
						</div>
						<c:forEach items="${free}" var="free">
							<a href="#">
								<div id="free_board_conten">
									<div class="free_no">${free.fno}</div>
									<div class="free_small_title">${free.title}</div>
									<div class="free_id">${free.id}</div>
									<div class="free_data">${free.free_date}</div>
									<div class="free_cnt">${free.free_cnt}</div>
									<div class="free_like">${free.free_like}</div>
								</div>
							</a>
						</c:forEach>
					</div>
					<div class="bottom">
						<!-- prev(이전)이 true이면 이전버튼 화설화 -->
						<c:if test="${fpaging.prev}">
							<a
								href="/page?bgno=3&pageNum=${fpaging.startPage-1}&amount=${fpaging.fcri.amount}">이전</a>
						</c:if>

						<!-- begin(1) end(10)될 동안 반복(1일 10일 될 동안 반복) -->
						<c:forEach begin="${fpaging.startPage}" end="${fpaging.endPage}"
							var="num">
							<a
								href="/page?bgno=3&ktype=${fpaging.fcri.ftype}&keyword=${fpaging.fcri.fkeyword}&pageNum=${num}&amount=${fpaging.fcri.amount}">${num}</a>
						</c:forEach>

						<!-- next(다음)이 true이면 다음버튼 활성화 -->
						<c:if test="${fpaging.next}">
							<a
								href="/page?bgno=3&pageNum=${fpaging.endPage+1}&amount=${fpaging.fcri.amount}">다음</a>
						</c:if>
						<br>
						<!-- ${paging} -->
						<c:choose>
							<c:when test="${sessionScope.login.id==null}">
								<div class="pbtn"></div>
							</c:when>
							<c:otherwise>
								<div class="pbtn">
									<a href="/free_board"><input type="button" value="글쓰기"
										class="bth"></a>
								</div>
							</c:otherwise>
						</c:choose>
						<!-- 자유게시판 미리 보기 끝 -->
					</div>
				</div>
			</div>
		</div>
		<!-- 센터 영역 끝-->
	</div>
</body>
</html>
