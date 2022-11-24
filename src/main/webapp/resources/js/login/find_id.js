/**
 * 아이디 찾기 js
 */
// 아이디 * 스토어 값 저장하기 위한 변수
// 아이디 값 받고 출력하는 ajax
function id_click(){
	var name = $("#id_name").val();
	var email = $("#id_email").val();
	var phone = $("#id_phone").val();
	
	$.ajax({
		type:"POST",
		url:"/find_id",
		data:{"name":name, "email":email, "phone":phone},
		success:function(data){
			if(data == 0){
				$("#id_value").text("회원 정보를 확인해주세요!");
				$("#id_name").val('');
				$("#id_email").val('');
				$("#id_phone").val('');
				console.log(name);
				console.log(email);
				console.log(phone);
			}else {
				$("#id_value").text(data);
				$("#id_name").val('');
				$("#id_email").val('');
				$("#id_phone").val('');
				console.log(name);
				console.log(email);
				console.log(phone);
			}			
		},
		error:function(){
			alert("에러입니다.");
		}
	});
};

const id_modal = document.getElementById("id_modal");
const id_btnModal = document.getElementById("findid_search");

id_btnModal.addEventListener("click", e => {
	id_modal.style.display = "flex"
});

    
const id_closeBtn = id_modal.querySelector(".id_close-area")
id_closeBtn.addEventListener("click", e => {
	id_modal.style.display = "none"
});

id_modal.addEventListener("click", e => {
    const id_evTarget = e.target
    if(id_evTarget.classList.contains("id_modal-overlay")) {
    	id_modal.style.display = "none"
    }
});

/* id 휴대폰 하이픈 */
const i_phone = (target) => {
   target.value = target.value.replace(/[^0-9]/g, "")
   .replace(/(^02|^0505|^1[0-9]{3}|^0[0-9]{2})([0-9]+)?([0-9]{4})$/,"$1-$2-$3").replace("--", "-");
};
