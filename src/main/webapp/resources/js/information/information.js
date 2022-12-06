/**
 * 동물소개 등록 js
 */
$(document).ready(function() {
	var input = "";
	// 동물 소개 등록 체크
	$("#uploadBtn").click(function(){
		// 동물 이름
		var animal_name_chk = false;
		// 서식지
		var habitat_chk = false;
		// 생김새와 특징
		var look_chk = false;
		// 수명
		var life_chk = false;
		// 먹이
		var food_chk = false;
		// 천적
		var enemy_chk = false;
		// 동물 분류
		var i_type_chk = false;
		
		/* 체크대상변수 */
		// 동물 이름
		var animal_name = $("input[name='animal_name']").val();
		// 서식지
		var habitat = $("textarea[name='habitat']").val();
		// 생김새와 특징
		var look = $("textarea[name='look']").val();
		// 수명
		var life = $("textarea[name='life']").val();
		// 먹이
		var food = $("textarea[name='food']").val();
		// 천적
		var enemy = $("textarea[name='enemy']").val();
		// 동물 본류
		var i_type = $("select[name='i_type']").val();
		// 페이지 분류
		var bgno = $("input[name='bgno']").val();
	
		/* 입력란 공백 체크 */
		if(animal_name.length>0){
			$("#animal_name").css('display','none');
			animal_name_chk=true;
		}else{
			$("#animal_name").css('display','block');
			animal_name_chk=false;
		}
		
		if(habitat.length>0){
			$("#habitat").css('display','none');
			habitat_chk=true;
		}else{
			$("#habitat").css('display','block');
			habitat_chk=false;
		}
		
		if(look.length>0){
			$("#look").css('display','none');
			look_chk=true;
		}else{
			$("#look").css('display','block');
			look_chk=false;
		}
		
		if(life.length>0){
			$("#life").css('display','none');
			life_chk=true;
		}else{
			$("#life").css('display','block');
			life_chk=false;
		}
		
		if(food.length>0){
			$("#food").css('display','none');
			food_chk=true;
		}else{
			$("#food").css('display','block');
			food_chk=false;
		}
		
		if(enemy.length>0){
			$("#enemy").css('display','none');
			enemy_chk=true;
		}else{
			$("#enemy").css('display','block');
			enemy_chk=false;
		}
		
		if(i_type.length>0){
			$("#i_type").css('display','none');
			i_type_chk=true;
		}else{
			$("#i_type").css('display','block');
			i_type_chk=false;
		}

		if(animal_name_chk && habitat_chk && look_chk && life_chk && food_chk && enemy_chk && i_type_chk && bgno){
			alert('통과');
			$("#info_form").append(input).submit();
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
	
	// 파일 전송버튼을 클릭하면 mian 이미지
	$("#main_img").on("change", function(e) {
		e.stopPropagation();
		// .jsp에 form태그를 대체 (FormData함수)
		var formData = new FormData();
		var inputFile = $("input[name='main']");
		var files = inputFile[0].files;
		console.log("inputFile1="+inputFile);
		console.log("files1="+files);

		for (var i = 0; i < files.length; i++) {
			// 함수 호출(checkExtension)
			if (!checkExtension(files[i].name, files[i].size)){
				return false;
			}
			// .jsp 파일선택을 통해 선택한 파일들을 form태그에 추가
			formData.append("main", files[i]);
		}		
		// ajax를 통해서 menuControll에 파일관련 데이터 전송
		$.ajax({
			type : "post",
			url : "/information_main",
			data : formData,
			contentType : false,
			processData : false,
			dataType : "json",
			success : function(result){
				console.log("result1 = "+result)
				
				var str = "";		
					 input += "<input type='text' name='info["+0+"].info_image' value ='" + result.info_image + "'><br>";					 					 
					 input += "<input type='text' name='info["+0+"].info_upload' value ='" + "\\information\\main\\" +result.info_upload + "'><br>";				 
					 input += "<input type='text' name='info["+0+"].info_uid' value ='" + result.info_uid + "'><br>";
					 input += "<input type='text' name='info["+0+"].info_name' value ='" + result.info_name + "'><br>";
					 input += "<input type='text' name='info["+0+"].vision' value ='" + result.vision + "'><br>";
					 // 만약 image 결과가 ture이면
					 // obj.image == true or
					 if(result.info_image){
							// 아래에 있는거 실행
							var filePath=encodeURIComponent(result.info_upload+"\\"+result.info_uid+"_"+result.info_name)
							console.log("filePath="+filePath)
							
							str += "<li><img src='/display?filename="+filePath+"'></li>"
						}else{// 그렇지 않으면
							// 다운로드 할 수 있도록 실행
							var filePath=encodeURIComponent(result.info_upload+"\\"+result.info_uid+"_"+result.info_name)
							str += "<li><a href='/download?filename="+filePath+"'>"+result.info_name+"</a></li>"
						 }					 	
		   }
	    })
    })
	
	// sub이미지
	$("#sub_img").on("change",function(e){
		e.preventDefault()
		// .jsp에 form태그를 대체 (FormData함수)
		var formData = new FormData();
		var inputFile = $("input[name='sub']");
		var files = inputFile[0].files;
		console.log("서브이미지(inputFile)="+inputFile);
		console.log("서브이미지(files)="+files);
		
		for (var i = 0; i < files.length; i++) {
			// 함수 호출(checkExtension)
			if (!checkExtension(files[i].name, files[i].size)){
				return false;
			}
			// .jsp 파일선택을 통해 선택한 파일들을 form태그에 추가
			formData.append("sub", files[i]);
		}
		// ajax를 사용하여 서버를 전송
		$.ajax({
			url:'/information_sub',
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
				  	 input += "<input type='text' name='info["+(i+1)+"].info_image' value ='" + obj.info_image + "'><br>";					 					 
					 input += "<input type='text' name='info["+(i+1)+"].info_upload' value ='" + "\\information\\sub\\" + obj.info_upload + "'><br>";				 
					 input += "<input type='text' name='info["+(i+1)+"].info_uid' value ='" + obj.info_uid + "'><br>";
					 input += "<input type='text' name='info["+(i+1)+"].info_name' value ='" + obj.info_name + "'><br>";
					 input += "<input type='text' name='info["+(i+1)+"].vision' value ='" + obj.vision + "'><br>";
					 // 만약 image 결과가 ture이면
					 // obj.image == true or
					 if(obj.info_image){
							// 아래에 있는거 실행
							var filePath=encodeURIComponent(obj.info_upload+"\\"+obj.info_uid+"_"+obj.info_name)
							console.log("filePath="+filePath)
							
							str += "<li><img src='/display?filename="+filePath+"'></li>"
						}else{// 그렇지 않으면
							// 다운로드 할 수 있도록 실행
							var filePath=encodeURIComponent(obj.info_upload+"\\"+obj.info_uid+"_"+obj.info_name)
							str += "<li><a href='/download?filename="+filePath+"'>"+obj.info_name+"</a></li>"
						 }
				})
			}
		})
	})
})
