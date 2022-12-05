<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- tendinous 영역 -->
<div class="wrap tap" id="tendinous_tap" style="display: none;">
					<div class="title">
						<h1>건의게시판</h1>
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
					<!-- 건의게시판 미리 보기 -->
					<div id="tendinous_contents">
						<div id="tendinous_board">
							<div class="no">번호</div>
							<div class="board_title">제목</div>
							<div class="board_id">이름</div>
							<div class="board_data">날짜</div>
							<div class="board_cnt">조회수</div>
						</div>
						<c:forEach items="${tend}" var="tend">
							<a href="/tendinous_datall?tno=${tend.tno}">
								<div id="tendinous_board_conten">
									<div class="no">${tend.tno}</div>
									<div class="board_title">${tend.tendinous_title}</div>
									<div class="board_id">${tend.id}</div>
									<div class="board_data">${tend.tendinous_date}</div>
									<div class="board_cnt">${tend.tendinous_cnt}</div>
								</div>
							</a>
						</c:forEach>
					</div>
					<div class="bottom">
						<!-- prev(이전)이 true이면 이전버튼 화설화 -->
						<c:if test="${tpaging.prev}">
							<a
								href="/page?type=information?pageNum=${tpaging.startPage-1}&amount=${tpaging.tcri.amount}">이전</a>
						</c:if>

						<!-- begin(1) end(10)될 동안 반복(1일 10일 될 동안 반복) -->
						<c:forEach begin="${tpaging.startPage}" end="${tpaging.endPage}"
							var="num">
							<a
								href="/page?type=information?ktype=${tpaging.tcri.ttype}&keyword=${tpaging.tcri.tkeyword}&pageNum=${num}&amount=${tpaging.tcri.amount}">${num}</a>
						</c:forEach>

						<!-- next(다음)이 true이면 다음버튼 활성화 -->
						<c:if test="${tpaging.next}">
							<a
								href="/page?type=information?pageNum=${tpaging.endPage+1}&amount=${tpaging.tcri.amount}">다음</a>
						</c:if>
						<br>
						<!-- ${paging} -->
						<c:choose>
							<c:when test="${loginVO.id==null}">
								<div class="pbtn"></div>
							</c:when>
							<c:otherwise>
								<div class="pbtn">
									<a href="/tendinous"><input type="button" value="글쓰기"
										class="bth"></a>
								</div>
							</c:otherwise>
						</c:choose>
						<!-- 건의 게시판 미리 보기 끝 -->
					</div>
				</div>
<!-- tendinous 영역 끝 -->
