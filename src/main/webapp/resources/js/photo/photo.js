/**
 * 동물소개 등록 js
 */
$(document).ready(function() {
	var input = "";	
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
	
	// sub이미지
	$("#file").on("change",function(e){
		e.preventDefault()
		// .jsp에 form태그를 대체 (FormData함수)
		var formData = new FormData();
		var inputFile = $("input[name='photo']");
		var files = inputFile[0].files;
		console.log("서브이미지(inputFile)="+inputFile);
		console.log("서브이미지(files)="+files);
		
		for (var i = 0; i < files.length; i++) {
			// 함수 호출(checkExtension)
			if (!checkExtension(files[i].name, files[i].size)){
				return false;
			}
			// .jsp 파일선택을 통해 선택한 파일들을 form태그에 추가
			formData.append("photo", files[i]);
		}
		// ajax를 사용하여 서버를 전송
		$.ajax({
			url:'/photo_img',
			data:formData,
			contentType:false,
			processData:false,
			dataType:"json",
			type:"POST",
			success:function(result){
				console.log("서브이미지(result)="+result);
				
				var str="";
				
				$(result).each(function(i,obj){
					console.log("obj2="+obj)
					console.log("obj2.filename="+obj.filename)
				  	 input += "<input type='text' name='p_img["+(i+1)+"].photo_image' value ='" + obj.photo_image + "'><br>";					 					 
					 input += "<input type='text' name='p_img["+(i+1)+"].photo_upload' value ='" + "\\photo\\" + obj.photo_upload + "'><br>";				 
					 input += "<input type='text' name='p_img["+(i+1)+"].photo_uid' value ='" + obj.photo_uid + "'><br>";
					 input += "<input type='text' name='p_img["+(i+1)+"].photo_name' value ='" + obj.photo_name + "'><br>";					 
					 // 만약 image 결과가 ture이면
					 // obj.image == true or
					 if(obj.photo_image){
							// 아래에 있는거 실행
							var filePath=encodeURIComponent(obj.photo_upload+"\\"+obj.photo_uid+"_"+obj.photo_name)
							console.log("filePath="+filePath)
							
							str += "<li><img src='/display?filename="+filePath+"'></li>"
						}else{// 그렇지 않으면
							// 다운로드 할 수 있도록 실행
							var filePath=encodeURIComponent(obj.photo_upload+"\\"+obj.photo_uid+"_"+obj.photo_name)
							str += "<li><a href='/download?filename="+filePath+"'>"+obj.photo_name+"</a></li>"
						 }
				})
			}
		})
	})
})
