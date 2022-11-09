/**
 * 회원가입 관련 js
 */
$(document).ready(function() {
	var str = "";
	var idresult = "";
	var idcheckresult="";
	var passwordresult = "";
	var password2result = "";
	var nameresult = "";
	var emailresult = "";
	var emailcheckresult="";
	var phoneresult="";
	
	// 아이디 길이 체크
	$("#id").on("blur",function() {
		var idRegex = /^[a-z]+[a-z0-9-_]{4,20}$/g;
		var id=$("#id").val();
		// 아이디를 서버로전송 > DB 유효성검사 >결과반환
		// 아이디 중복 체크
		$.getJSON("/signup/idcheck/"+id+".json",function(data){
			// select된 결과가 있으면 success로 인식
			console.log(data)
			$("#id_alert").remove();
			
			str = "<div id='id_alert' class='alert'> 사용중입니다 </div>"
			
			$("#id_box").append(str);
			
			$("#id_alert").css("color", "red").css("margin-left", "230px");
			idcheckresult= false;
		}).fail(function(data){
			// select된 결과가 없으면 fail로 인식
			if(idRegex.test($("#id").val())) {
			$("#id_alert").remove();
			
			str = "<div id='id_alert' class='alert'> 사용가능합니다  </div>"
			
			$("#id_box").append(str);
			
			$("#id_alert").css("color", "green").css("margin-left", "230px");
			idresult = true;
		} else {
			
			$("#id_alert").remove();
			str = "<div id='id_alert' class='alert'>아이디는 5자 이상, 20자 이하로 써주세요.</div>"
			$("#id_box").append(str);
			$("#id_alert").css("color", "red").css("margin-left", "230px");
			idresult=false;
		}
		})
	})
	
	// 비밀번호 길이 체크
	$("#pwd").blur(function() {
		
		var pwreg =/^(?=.*?[a-z]+[a-zA-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{7,13}$/;
		
		if (pwreg.test(($("#pwd").val()))) {
			$("#pwd_alert").remove();
			str = "<div id='pwd_alert' class='alert'>사용가능합니다 </div>"
			$("#pwd_box").append(str);
			$("#pwd_alert").css("color", "green").css("margin-left", "230px");
			passwordresult = true;
		} else {
			$("#pwd_alert").remove();
				str = "<div id='pwd_alert' class='alert'>비밀번호는 특수문자를 포함한 영문자,숫자로 7자 이상~13자이하로 써주세요. </div>"
				$("#pwd_box").append(str);
				$("#pwd_alert").css("color", "red").css("margin-left", "230px");
			passwordresult=false;
		}
	})
	
	// 비밀번호 일치 확인
	$("#pwd2").blur(function() {
		
		var password = $("#pwd").val();
		var password2 = $("#pwd2").val();
		if (password != password2) {
			$("#pwd2_alert").remove();
			str = "<div id='pwd2_alert' class='alert'>비밀번호가 일치하지 않습니다. </div>"
			$("#pwd_box2").append(str);
			$("#pwd2_alert").css("color", "red").css("margin-left", "230px");
			password2result=false;
		} else {
			$("#pwd2_alert").remove();
			str = "<div id='pwd2_alert' class='alert'>  비밀번호가 일치합니다.</div>"
				$("#pwd_box2").append(str);
				$("#pwd2_alert").css("color", "green").css("margin-left", "230px");
				
				password2result = true;
		}
	})
	
	
	// name
	$("#name").blur(function(){
		
		
		var nameRegex =  /^[가-힣]{2,5}$/;
		
		if(nameRegex.test($("#name").val())){
			$("#name_alert").remove();
			str="<div id='name_alert' class='alert'>사용가능합니다.</div>"
			$("#name_box").append(str);
			$("#name_alert").css("color", "green").css("margin-left", "230px");
			nameresult = true;
		}else{
			$("#name_alert").remove();
			str="<div id='name_alert' class='alert'>이름 형식에 맞게 입력해주세요.</div>"
			$("#name_box").append(str);
			$("#name_alert").css("color", "red").css("margin-left", "230px");
			nameresult=false;
		}
	})
	// email
	$("#email").blur(function(){

		var emailRegex = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/;
		var email=$("#email").val();
		
		$.getJSON("/signup/emailcheck/"+email+".json",function(data){
			// select된 결과가 있으면 success로 인식
			console.log(data)
			$("#email_alert").remove();
			
			str = "<div id='email_alert' class='alert'> 사용중입니다 </div>"
			
			$("#email_box").append(str);
			
			$("#email_alert").css("color", "red").css("margin-left", "230px");
			
			 idcheckresult= false;
				
		}).fail(function(data){// select된 결과가 없으면 fail로 인식
			if(emailRegex.test($("#email").val())){
				$("#email_alert").remove();
				
				str="<div id='email_alert' class='alert'>사용가능합니다.</div>"
				
				$("#email_box").append(str);
				
				$("#email_alert").css("color", "green").css("margin-left", "230px");
				
				emailresult = true;
		} else {
			
			$("#email_alert").remove();
			str="<div id='email_alert' class='alert'>이메일 형식에 맞게 입력해주세요.</div>"
			$("#email_box").append(str);
			$("#email_alert").css("color", "red").css("margin-left", "230px");
			emailresult=false;
		}
		})
	})

    // 전화번호
	$("#phone").blur(function(){		
		var numberRegex =  /^[0-9]{3}-[0-9]{3,4}-[0-9]{4}$/;
		var phone=$("#phone").val();
		// 전화번호를 서버로전송 > DB 유효성검사 >결과반환
		// 전화번호 중복 체크
		$.getJSON("/signup/phonecheck/"+phone+".json",function(data){
			// select된 결과가 있으면 success로 인식
			console.log(data)
			$("#phone_alert").remove();
			
			str = "<div id='phone_alert' class='alert'> 사용중입니다 </div>"
			
			$("#phone_box").append(str);
			
			$("#phone_alert").css("color", "red").css("margin-left", "230px");
			idcheckresult= false;
		}).fail(function(data){
			// select된 결과가 없으면 fail로 인식
		if(numberRegex.test($("#phone").val())){
			$("#phone_alert").remove();
			str="<div id='phone_alert' class='alert'>사용가능합니다.</div>"
			$("#phone_box").append(str);
			$("#phone_alert").css("color", "green").css("margin-left", "230px");
			numberresult = true;
		}else{
			$("#phone_alert").remove();
			str="<div id='phone_alert' class='alert'>숫자, -을 포함해 휴대전화 형식에 맞게 입력해주세요</div>"
			$("#phone_box").append(str);
			$("#phone_alert").css("color", "red").css("margin-left", "230px");
			numberresult=false;
		}
		})
	})
	
	// 필요한 데이터가 전부 입력되었다면 submit을 진행한다//
	$("form").on("submit", function() {

		if(idresult == true && passwordresult == true && password2result == true && nameresult == true && emailresult == true){
			alert("회원가입을 축하합니다.");
		}else if( idcheckresult== false){
			alert("id가 중복되었습니다")
			return false;
		}else if(emailcheckresult==false){
			alert("email이 중복되었습니다")
			return false;
		}else{
			alert("다시 확인해 주세요.");
			return false;
		}
	
	})

	
});
/* 휴대폰 하이픈 */
const autophone = (target) => {
target.value = target.value
  .replace(/[^0-9]/g, "")
 .replace(/(^02|^0505|^1[0-9]{3}|^0[0-9]{2})([0-9]+)?([0-9]{4})$/,"$1-$2-$3").replace("--", "-");
};