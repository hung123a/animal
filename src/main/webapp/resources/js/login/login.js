/*
 *  로그인 관련 처리 
 */
$(document).ready(function(){
	$("#login").submit(function() {
		//event.preventDefault();
		
		var id = $("#id").val();
		var password = $("#password").val();
		var check = false;
		
		// 아이디가 공백이라면 false
		if (id == "") {
			alert("아이디를 입력해주세요.");
			$("#id").focus();
		
		// 비밀번호가 공백이라면 false
		} else if (password == "") {
			alert("비밀번호를 입력해주세요.");
			$("#pw").focus();
		
		// 어느쪽에도 해당되지 않는다면 아래의 ajax를 실행한다.
		}else {
			
			$.ajax ({
				type : "POST",
				url : "/Login/logincheck",
				data : JSON.stringify ({id:id, password:password}),
				contentType : "application/json; charset=utf-8",
				async : false,
				success:function(result) {
					
					if(result == "success") {
						alert("로그인되셨습니다.")
						check = true;
					}
				},
				error:function() {
					alert("아이디 혹은 비밀번호가 존재하지 않거나 잘못되었습니다.")
					check = false;
				}
			}) // ajax 끝
		}
		return check;
	})

})
function loginChk(e) {
    var form = document.f1;
    if (!form.id.value) {
        alert("아이디를 입력해 주십시오.");
        form.id.focus();
    }else if (!form.pwd.value) {
    	e.preventDefault();
    	alert("비밀번호를 입력해 주십시오.");
    	form.pwd.focus();
    }
 
    /*if (!form.pwd.value) {
    	e.preventDefault();
        alert("비밀번호를 입력해 주십시오.");
        form.pwd.focus();
        return;
    }*/
    form.action = "/login/login_post";
    form.submit();
}