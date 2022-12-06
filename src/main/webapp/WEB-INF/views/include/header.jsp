<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/resources/css/include/header.css">
<!-- header 영역 -->
<header id="head">
	<div id="head_cont" class="wrap">
		<div id="tap_menu">
			<ul class="tap_list">
				<li><a href="/page" class="href" onclick="javascript:tabcustom(1);">동물 소개</a></li>
				<li><a href="/page" class="href" onclick="javascript:tabcustom(2);">사진 첩</a></li>
				<li><a href="/page" class="href" onclick="javascript:tabcustom(3);">자유게시판</a></li>
				<li><a href="/page" class="href" onclick="javascript:tabcustom(4);">건의게시판</a></li>
			</ul>
		</div>
		<div id="logo">
			<a href="/"><img src="/resources/img/animal community.png"
				id="logo_img"></a>
		</div>
		<div id="menu">
			<ul id="menu_list">
				<c:choose>
					<c:when test="${sessionScope.login.id==null}">
						<li><a href="/login">로그인</a></li>
						<li><a href="/signup">회원가입</a></li>						
					</c:when>
					<c:when test="${sessionScope.login.rating=='관리자'}">
						<li><a href="/login">관리자메뉴</a></li>
						<li><a href="/login/logout">로그아웃</a></li>						
					</c:when>
					<c:otherwise>
						<li><a href="/mypage?id=${sessionScope.login.id}">${sessionScope.login.id}님</a></li>
						<li><a href="/login/logout">로그아웃</a></li>						
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
</header>
<!-- header 영역 끝 -->
