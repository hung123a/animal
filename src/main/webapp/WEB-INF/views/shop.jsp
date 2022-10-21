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
<script type="text/javascript" src="/resources/js/main.js"></script>
<link rel="stylesheet" href="/resources/css/header.css">
<link rel="stylesheet" href="/resources/css/home.css">
<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Roboto&display=swap');
* {
  margin: 0;
  padding: 0;
}
body {
  width: 100%;
  background: #333;
  color:#ccc;
  font-family: 'Roboto', sans-serif;
}
body, ul, li {
    margin:0;
    padding:0;
    list-style:none;
}

.wrap { /* 중복 클래스 */
	max-width: 1500px; /* 중복되는 태그 넓이를 1200으로 */
	margin: 0 auto; /* 중복되는 태그 중앙 정렬 */
}

/* 헤더 영역 */
#head {
	box-shadow: 0 -5px 20px rgb(0 0 0/ 50%); /* 헤더 바닥 선 밑 음영 주기 */
	background-color: #eee; /* 배경색 */
	 position: absolute;
	height: 6rem; /* 높이 지정 */
	width: 100%; /* 넓이 화면만큼 */
	top: 0; /* 스크롤 시 위치 고정을 위한 값 */
  left: 0;
}
#head.drop{
  position: fixed;
  animation: dropHeader 0.3s;
}

@keyframes dropHeader {
  0% {
    top: -5rem;
  }
  100% {
    top: 0;
  }
}
#head_cont {
	height: 6rem; /* 영역 높이 지정 */
}

#tap_menu { /* 헤더 왼쪽 영역 */
	float: left; /* 위치를 왼쪽 배열로 */
	height: 100px; /* 높이를 100px로 지정 */
	width: 30%; /* 넓이를 250px로 지정 */
}

.tap_list {
	transform: translateY(70%); /* 높이 지정 */
	list-style: none; /* ul태그 스타일 제거 */
	padding-left: 0; /* 왼쪽 패딩값 지정 */
  display: flex;
   justify-content: center;
  align-items: center;
}

.tap_list>li {
	text-align: center; /* 글자 중앙 정렬 */
	padding: 13px; /* padding값  지정 */
	cursor: pointer; /* 해당 영역 손모양 마우스 표시 */
}

.tap_list>li>a {
	color: black;
}

#logo { /* 헤더 중앙 영역 */
	text-align: center; /* 글자를 가운데로 */
	height: 100px; /* 영역 높이 지정 */
	width: 40%; /* 넓이 로 지정 */
	float: left; /* 위치를 왼쪽 배열로 */
}

#logo_img { /* 로고 이미지 */
	width: 350px; /* 넓이 지정 */
}

#menu {
	float: right; /* 위치를 오른쪽 배열로 */
	width: 30%; /* 넓이 지정 */
}

#menu_list {
	padding-left: 46%; /* padding값 45으로 */
	list-style: none; /* ul태그 스타일 제거 */
	font-size: 14px; /* 폰트 사이즈 지정 */
	display: flex; /* ul의 li를 가로배치 */
}

#menu_list>li {
	margin-left: 14px; /* 가로배치된 li태그 간격주기 */
}

#menu_list>li>a {
	color: black; /* a태그 글자색을 검은색으로 지정 */
}

.section {
  width: 100%;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 5rem;
  box-sizing: border-box;
  text-align: center;
}
.section:nth-child(even) {
  background: #ccc;
  color:#333;
}

.pagination {
    position: fixed;
    right: 20px;
    top: 50%;
    transform: translateY(-50%);
    z-index: 10;
}

@media ( max-width:1000px ) {
    .pagination {
        top:auto;
        right:auto;
        left:50%;
        bottom:0;
        transform: translateY(0) translateX(-50%);
    }
    
    .pagination > li {
        float:left;
    }
}

.pagination a {
    display: block;
    color: white;
    position: relative;
    padding: 20px;
}

.pagination a.active:after {
    box-shadow: inset 0 0 0 5px;
}

.pagination a .hover-text {
    position: absolute;
    right: 20px;
    top: 50%;
    transform:translateY(-50%);
    opacity: 0;
    transition: opacity 0.5s ease;
    padding-right: 15px;
    white-space:nowrap;
}

.pagination a:hover .hover-text {
    opacity: 1;
}

.pagination a:after {
    content: "";
    transition: box-shadow 0.5s ease;
    width: 10px;
    height: 10px;
    display: block;
    border: 1px solid;
    border-radius: 50%;
    position: absolute;
    top:50%;
    left:50%;
    transform:translateX(-50%) translateY(-50%);
}
</style>

<script type="text/javascript">
$(document).ready(function(){
let header = document.querySelector("#head");
let headerHeight = header.offsetHeight;

window.onscroll = function () {
  let windowTop = window.scrollY;
  if (windowTop >= headerHeight) {
    header.classList.add("drop");
  } else {
    header.classList.remove("drop");
  }
};
$(function() {
    $.scrollify({
        section:".section",
        scrollbars:false,
        before:function(i,panels) {
            var ref = panels[i].attr("data-section-name");
            $(".pagination .active").removeClass("active");
            $(".pagination").find("a[href=\"#" + ref + "\"]").addClass("active");
        },
        afterRender:function() {
            var pagination = "<ul class=\"pagination\">";
            var activeClass = "";
            $(".section").each(function(i) {
                activeClass = "";
                if ( i === 0 ) {
                    activeClass = "active";
                }
                pagination += "<li><a class=\"" + activeClass + "\" href=\"#" + $(this).attr("data-section-name") + "\"><span class=\"hover-text\">" + $(this).attr("data-section-name").charAt(0).toUpperCase() + $(this).attr("data-section-name").slice(1) + "</span></a></li>";
            });

            pagination += "</ul>";

            $(".home").append(pagination);

            $(".pagination a").on("click", $.scrollify.move);
        }
    });
});
});
  </script>
</head>
<body>
	<div id="cont">
		<div id="main">
			<header id="head">
				<div id="head_cont" class="wrap">
					<div id="tap_menu">
						<ul class="tap_list">
							<li><a href="">동물 소개</a></li>
							<li><a href="">사진 첩</a></li>
							<li><a href="">자유게시판</a></li>
							<li><a href="">건의게시판</a></li>
						</ul>
					</div>
					<div id="logo">
						<a href="/"><img src="/resources/img/animal community.png"
							id="logo_img"></a>
					</div>
					<div id="menu">
						<ul id="menu_list">
							<li><a href="#">로그인</a></li>
							<li><a href="#">회원가입</a></li>
							<li><a href="#">마이페이지</a></li>
						</ul>
					</div>
				</div>
			</header>

			<!-- 센터 영역 -->
			<div id="center">
				<div id="animal" class="section home" data-section-name="동물소개">
					<h3>동물 소개</h3>
				</div>
				<div id="photo" class="section panel1" data-section-name="사진첩">
					<h3>사진첩</h3>
				</div>
				<div id="free" class="section panel2" data-section-name="자유게시판">
					<h3>자유게시판</h3>
				</div>
				<div id="tendinous" class="section panel3" data-section-name="건의게시판">
					<h3>건의게시판</h3>
				</div>
			</div>

			<!-- 바닥 영역 -->
			<div id="footer">
				<footer>
					<div>&copy;2021</div>
				</footer>
			</div>
		</div>
	</div>
</body>
</html>
