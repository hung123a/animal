/**
 * 자유게시판 등록 js
 */
$(document).ready(function() {
	var input="";
	/* 자유게시판 등록 체크 */
	$("#uploadBtn").click(function() {
		// 제목
		var title_chk = false;
		// 내용
		var contents_chk = false;
		
		/* 체크대상변수 */
		// 제목
		var title = $("input[name='title']").val();
		// 내용
		var contents = $("textarea[name='contents']").val();
		
			
		/* 입력란 공백 체크 */
		if(title.length>0){
			$("#title").css('display','none');
			title_chk=true;
		}else{
			$("#title").css('display','block');
			title_chk=false;
		}
		
		if(contents.length>0){
			$("#contents").css('display','none');
			contents_chk=true;
		}else{
			$("#contents").css('display','block');
			contents_chk=false;
		}		
		if(title_chk && contents_chk ){
			alert('통과');
			$("#free_form").append(input).submit();
		}else{
			return false;
		}
	})

	// 첨부파일 공격에 대비하기 위한 업포드 파일 확장자 제한.((.exe .zip .aiz, 특정 크기 이상 파일) = 첨부x)
	// 함수 선언
	// 정규식을 이용하여 확장자 제한
	var reg = new RegExp("(.*?)\.(exe|zip|alz)$")
	// 최대크기를 설정하여 그 이상이면 제한
	var maxSize = 5242880; // 5MB
	// 파일이름, 파일 크기
	function checkExtension(filename, fileSize) {
		// 파일크기 제한
		// 실제파일의 크기 > 최대 크기
		if (fileSize > maxSize) {
			alert("파일 사이즈 초과")
			return false;
		}
		// 확장자 제한
		// 실제파일명의 확장자와 정규식 비교
		if (reg.test(filename)) { // 정규식이면
			alert("해당 종류의 파일은 업로드 할 수 없습니다.")
			return false;
		}
		return true;
	}

	$("#image").on("change",function(e){
		e.preventDefault()
		// .jsp에 form태그를 대체 (FormData함수)
		var formData = new FormData();
		var inputFile = $("input[name='free_board_img']");
		var files = inputFile[0].files;
		console.log("서브이미지(inputFile)="+inputFile);
		console.log("서브이미지(files)="+files);
		
		for (var i = 0; i < files.length; i++) {
			// 함수 호출(checkExtension)
			if (!checkExtension(files[i].name, files[i].size)){
				return false;
			}
			// .jsp 파일선택을 통해 선택한 파일들을 form태그에 추가
			formData.append("free_board_img", files[i]);
		}
		// ajax를 사용하여 서버를 전송
		$.ajax({
			url:'/free_img',
			data:formData,
			contentType:false,
			processData:false,
			dataType:"json",
			type:"POST",
			success:function(result){
				console.log(result);
				
				var str="";
				
				$(result).each(function(i,obj){
					console.log(obj)

				  	 input += "<input type='text' name='board_img["+i+"].free_image' value ='" + obj.free_image + "'><br>";					 					 
					 input += "<input type='text' name='board_img["+i+"].free_upload' value ='" + "\\free_board\\" + obj.free_upload + "'><br>";				 
					 input += "<input type='text' name='board_img["+i+"].free_uid' value ='" + obj.free_uid + "'><br>";
					 input += "<input type='text' name='board_img["+i+"].free_name' value ='" + obj.free_name + "'><br>";					 
					 // 만약 image 결과가 ture이면
					 // obj.image == true or
					 if(obj.free_image){
							// 아래에 있는거 실행
							var filePath=encodeURIComponent(obj.free_upload+"\\"+obj.free_uid+"_"+obj.free_name)
							console.log("filePath="+filePath)
							
							str += "<li><img src='/display?filename="+filePath+"'></li>"
						}else{// 그렇지 않으면
							// 다운로드 할 수 있도록 실행
							var filePath=encodeURIComponent(obj.free_upload+"\\"+obj.free_uid+"_"+obj.free_name)
							str += "<li><a href='/download?filename="+filePath+"'>"+obj.free_name+"</a></li>"
						 }
				})
			}
		})
	})
})
