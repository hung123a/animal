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
		if (fileSize >= maxSize) {
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
	
	var cloneojb=$("#uploaddiv").clone();
	$("input[type='file']").on("change",function(){ // onchange이벤트 : 요소 값이 바뀌였을 때
		var formData = new FormData(); 	// .jsp에 form태그를 대체 (FormData함수)
		var inputFile = $("input[name='photo']"); // photo이라는 name을 가진 input
		var files = inputFile[0].files;	// input 0번에 저장
		for (var i = 0; i < files.length; i++) {
			// 함수 호출(checkExtension)
			if (!checkExtension(files[i].name, files[i].size)){
				return false;
			}			
			formData.append("photo", files[i]); // .jsp 파일선택을 통해 선택한 파일들을 form태그에 추가			
		}// ajax를 사용하여 서버를 전송
		$.ajax({
			url:'/photo_img',
			data:formData,
			contentType:false,
			processData:false,
			dataType:"json",
			type:"POST",
			success:function(result){
		
				console.log("이미지(result)="+result);
				
				fileUploadFile(result);
			}
		})
	})
				
	var uploadResult = ("#uploadResult ul");
        // 글쓰기 파트 파일을 삭제할 수 있게하는 파트
       function fileUploadFile(arr) {
    	   if(!arr||arr.length==0){return}
    		var str="";
				$(arr).each(function(i,file){
					if(file.image) {
						// 아래에 있는거 실행
						var filePath=encodeURIComponent("\\photo\\" +file.photo_upload+"\\"+file.photo_uid+"_"+file.photo_name)
						str+="<li data-path='"+file.photo_upload+"' data-uuid='"+file.photo_uid+"' data-fileName='"+file.photo_name+"' data-type='"+file.image+"'><div>";
						str += "<img src='/display?filename="+filePath+"'>"							
						str += "<button data-file=\'"+ filePath+"\' data-type='image' class='del'>delete</button></li>"
					}else { // 그렇지 않으면
						// 다운로드 할 수 있도록 실행
						var filePath=encodeURIComponent("\\photo\\" +file.photo_upload+"\\"+file.photo_uid+"_"+file.photo_name)
						str+="<li data-path='"+file.photo_upload+"' data-uuid='"+file.photo_uid+"' data-fileName='"+file.photo_name+"' data-type='"+file.image+"'><div>";
						str += "<img src='/display?filename="+filePath+"'>"							
						str += "<button data-file=\'"+ filePath+"\' data-type='image' class='del'>delete</button></li>"
					}										  	
				})
				 $("#uploadResult ul").append(str);								
			}
		
	
	
	$("#uploadResult").on("click","button", function(e){
			console.log("delete File");
			if(confirm("정말로 지우시겠습니까 ?")) {
			var targetFile=$(this).data("file");
			var type=$(this).data("type");
			var targetLi=$(this).closest("li");
			$.ajax({
				url:'/deleteFile',
				data:{filename:targetFile,type:type},
				dataType:'text',
				type:'POST',
				success:function(result){
					alert(result);
					targetLi.remove();
				}
			})
		}
	})
	var form=$("form[id='photo_from']");
	$(".bth").on("click",function(e){
		var str="";
		$("#uploadResult ul li").each(function(i,file){
			
			str += "<input type='text' name='p_img["+i+"].photo_image' value ='" + file.photo_image + "'><br>";					 					 
			str += "<input type='text' name='p_img["+i+"].photo_upload' value ='" + "\\photo\\" + file.photo_upload + "'><br>";				 
			str += "<input type='text' name='p_img["+i+"].photo_uid' value ='" +  file.photo_uid + "'><br>";
			str += "<input type='text' name='p_img["+i+"].photo_name' value ='" + file.photo_name + "'><br>"; 
		})
		console.log("테스트="+file)
		form.append(str).submit();				 
	})
})
