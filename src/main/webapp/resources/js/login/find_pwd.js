/**
 *  비밀번호 찾기 js
 */
// 비밀번호 값 받고 출력하는 ajax
function pwd_click(){
	var id = $("#pwd_id").val();
	var name = $("#pwd_name").val();
	var email = $("#pwd_email").val();
	var phone = $("#pwd_phone").val();
	
	$.ajax({
		type:"POST",
		url:"/find_pwd",
		data:{"id":id, "name":name, "email":email, "phone":phone},
		success:function(data){
			if(data == 0){
				$("#id_value").text("회원 정보를 확인해주세요!");
				$("#pwd_id").val('');
				$("#pwd_name").val('');
				$("#pwd_email").val('');
				$("#pwd_phone").val('');				
			}else {
				$("#pwd_value").text(data);
				$("#pwd_id").val('');
				$("#pwd_name").val('');
				$("#pwd_email").val('');
				$("#pwd_phone").val('');				
			}			
		},
		error:function(){
			alert("에러입니다.");
		}
	});
};

const pwd_modal = document.getElementById("pwd_modal");
const pwd_btnModal = document.getElementById("findpwd_search");

pwd_btnModal.addEventListener("click", e => {
	pwd_modal.style.display = "flex"
});

    
const pwd_closeBtn = pwd_modal.querySelector(".pwd_close-area")
pwd_closeBtn.addEventListener("click", e => {
	pwd_modal.style.display = "none"
});

pwd_modal.addEventListener("click", e => {
    const pwd_evTarget = e.target
    if(pwd_evTarget.classList.contains("pwd_modal-overlay")) {
    	pwd_modal.style.display = "none"
    }
});

/* password 휴대폰 하이픈 */
const p_phone = (target) => { 
   target.value = target.value.replace(/[^0-9]/g, "")
   .replace(/(^02|^0505|^1[0-9]{3}|^0[0-9]{2})([0-9]+)?([0-9]{4})$/,"$1-$2-$3").replace("--", "-"); 
};