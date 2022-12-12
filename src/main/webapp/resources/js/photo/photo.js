/**
 * 동물소개 등록 js
 */
$(document).ready(function() {
	// 함수 선언
	// 정규식을 이용하여 확장자 제한
	var reg = new RegExp("(.*?)\.(exe|zip|alz)$")
	// 최대크기를 설정하여 그 이상이면 제한
	var maxSize = 5242880; // 5MB
	// 파일이름, 파일크기
	function checkExtension(filename, fileSize) {
		// 파일크기 제한
		// 실제파일의 크기 > 최대 크기
		if (fileSize > maxSize) {
			alert("파일 사이즈 초과");
			return false;
		}
		// 확장자 제한
		// 실제파일명의 확장자와 정규식 비교
		// 정규식이면
		if (reg.test(filename)) {
			alert("해당 종류의 파일은 업로드 할 수 없습니다.")
			return false;
		}
		return true;
	}

	// 파일전송버튼(id="uploadBtn)을 클릭하면
	$(".bth").on("click", function() {
		//e.preventDefault();	
		// 파일 업로드 관련 로직 처리
		// .jsp에 form태그를 대체(FormData함수)
		var formData = new FormData();
		var inputFile = $("input[name='photo']");
		// console.log(inputFile);
		var files = inputFile[0].files;
		console.log(files);
		for (var i = 0; i < files.length; i++) {
			// 함수 호출(checkExtension)
			if (!checkExtension(files[i].name, files[i].size)) {
				return false;
			}
			// .jsp의 파일선택을통해 선택한 파일들을 form태그에 추가
			formData.append("photo", files[i]);
		}

		// ajax를 통해서 UploadController에 파일관련 데이터 전송
		$.ajax({
			type : "post",
			url : "/photo_img",
			data : formData,
			contentType : false,
			processData : false,
			dataType : "json",
			success : function(result) {
				console.log("result = "+result)
				var str = "";
				var input = "";
				$(result).each(function(i, obj) {
					//console.log(obj)
					//console.log(obj.fileName)
				 input += "<input type='text' name='p_img["+i+"].photo_upload' value ='" + "\\photo\\" + obj.photo_upload + "'><br>";
				 input += "<input type='text' name='p_img["+i+"].photo_name' value ='" + obj.photo_name + "'><br>";
				 input += "<input type='text' name='p_img["+i+"].photo_uid' value ='" + obj.photo_uid + "'><br>";
				 input += "<input type='text' name='p_img["+i+"].photo_image' value ='" + obj.photo_image + "'><br>";
					// 만약 image결과가 ture면
					// obj.image == true or
			     if(obj.photo_image){
					// 아래에 있는거 실행					
					var filePath=encodeURIComponent(obj.photo_upload+"/s_"+obj.photo_uid+"_"+obj.photo_name)
					console.log(filePath)					
					str += "<li><img src='/display?filename="+filePath+"'></li>"
				}else{// 그렇지 않으면
					// 다운로드 할 수 있도록 실행
					var filePath=encodeURIComponent(obj.photo_upload+"/"+obj.photo_uid+"_"+obj.photo_name)
					str += "<li><a href='/download?filename="+filePath+"'>"+obj.photo_name+"</a></li>"
				 }
			})
				$("#uploadResult ul").html(str);
				$("#photo_form").append(input).submit();
			}
		})

	})
})
