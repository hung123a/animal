<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- freeboard 영역 -->
<div class="wrap tap" id="animal_tap" style="display: none;">
					<!-- 동물 소개 제목 -->
					<div class="title">
						<div id="animal_title">
							<h1>동물 소개</h1>
						</div>
					</div>
					<div class="page_menu">
						<div class="ranking">
							<ul>
								<li><a href="#">최신순</a></li>
								<li><a href="#">조회수</a></li>
								<li><a href="#">오래된순</a></li>
							</ul>
						</div>
						<!-- 검색영역 -->
						<div class="seach" id="animal_seach">
							<form id="seachForm" method="get">
								<select name="i_type" class="select_menu">
									<optgroup label="CATEGORY" class="CATEGORY"></optgroup>
									<option value="LBS">전체 글 보기</option>
									<option value="L">육지 동물</option>
									<option value="B">조류</option>
									<option value="S">해상 동물</option>
								</select> <input type="text" name="ikeyword" class="keyword"> <input
									type="hidden" name="pageNum" value="#"> <input
									type="hidden" name="amount" value="#"> <input
									type="button" value="검색" class="button">
							</form>
						</div>
					</div>
					<!-- 내용을 감싸는 div -->
					<div class="contents">
						<c:forEach items="${info}" var="info">
							<a href="#">
								<div class="animal_smail_tap">
									<div class="animal_img">
										<img class="animal_img1"
											src="/display?filename=${info.main_img}">
									</div>
									<div class="main_contents">
										<div class="small_title">
											<h2>${info.animal_name}</h2>
										</div>
										<div class="small_contents">${info.look}</div>
										<div id="date">${info.animal_date}</div>
									</div>
								</div>
							</a>
						</c:forEach>
					</div>
					<div class="bottom" id="information_bottom">
						<!-- prev(이전)이 true이면 이전버튼 화설화 -->
						<c:if test="${ipaging.prev}">
							<a 
								href="/page?type=information&pageNum=${ipaging.startPage-1}&amount=${ipaging.icri.amount}">이전</a>
						</c:if>

						<!-- begin(1) end(10)될 동안 반복(1일 10일 될 동안 반복) -->
						<c:forEach begin="${ipaging.startPage}" end="${ipaging.endPage}"
							var="num">
							<a 
								href="/page?type=information&i_type=${ipaging.icri.i_type}&ikeyword=${ipaging.icri.ikeyword}&pageNum=${num}&amount=${ipaging.icri.amount}">${num}</a>
						</c:forEach>

						<!-- next(다음)이 true이면 다음버튼 활성화 -->
						<c:if test="${ipaging.next}">
							<a 
								href="/page?type=information&pageNum=${ipaging.endPage+1}&amount=${ipaging.icri.amount}">다음</a>
						</c:if>
						<br>
						<!-- ${paging} -->
						<c:choose>
							<c:when test="${loginVO.id==null}">
								<div class="pbtn"></div>
							</c:when>
							<c:otherwise>
								<div class="pbtn">
									<a href="/information"><input type="button" value="글쓰기"
										class="bth"></a>
								</div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
<!-- freeboard 영역 끝 -->
