<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 글쓰기</title>
<!-- 제이쿼리 -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<!-- 사진첩 글쓰기 css -->
<link rel="stylesheet" href="/resources/css/photo/photo.css">
<!-- 겹치는 css -->
<link rel="stylesheet" href="/resources/css/include/header.css">
<link rel="stylesheet" href="/resources/css/tap/page.css">
</head>
<body>
	<div id="cont">
		<!-- header 영역 -->
		<jsp:include page="../include/header.jsp"></jsp:include>
		<!-- header 영역 끝 -->
		<div id="photo_center">
			<div class="wrap" id="main">
				<!-- 사진첩 -->
				<div class="wrap" id="animal_tap">
					<!-- 내용 전체 -->
					<div id="photo_border">
						<div class="photo_all">
							<div id="board">
								<div class="photo_title">이미지을 해당 영역으로 끌어다 놓으세요.</div>
								<label for="file" id="button">
									<div class="btn-upload" id="upload">파일 업로드</div>
								</label> <input type="file" id="file">
							</div>
						</div>
					</div>
					<div class="btn">
						<a href=""><input type="button" value="등록하기" class="bth"></a>
					</div>
					<div class="btn">
						<a href="/page?type=photo"><input type="button" value="목록으로"
							class="bth"></a>
					</div>
				</div>
				<!-- 동물 소개 끝 -->
				<div id="ex9">
        <style>
            #ex9 .upload-box{
                width:500px;
                height: 300px;
                border:1px solid gray;
                box-shadow: 2px 3px 9px hsl(0, 0%, 47%);
                padding:10px;
            }
        </style>
        <h1>파일업로드 : DND & Trigger</h1>
        <div class="upload-box">
            <button class="btn-upload">파일선택</button>
            <input class="btn-file d-none" type="file"> <!--파일 input box 형태-->     
        </div>
    </div>
			</div>
		</div>
		<!-- 센터 영역 끝-->
	</div>
	
	<!-- 이미지 드래그 앤 드롭 이벤트 -->
<script type="text/javascript" src="/resources/js/photo/photo.js"></script>
</body>
</html>
