/**
 * 아이디 찾기 js
 */
// 아이디 * 스토어 값 저장하기 위한 변수
// 아이디 값 받고 출력하는 ajax
function id_click(){
	var name=$("input[name='name']").val();
	var email = $("input[name='email']").val();
	var phone = $("input[name='phone']").val();
	
	$ajax({
		type:"POST",
		url:"/find_id",
		data:{"name":name, "email":email, "phone":phone},
		success:function(data){
			if(data == 0){
				$("#id_value").text("회원 정보를 확인해주세요!");
				$("#id_name").val('');
				$("#id_email").val('');
				$("#id_phone").val('');
			}else {
				$("#id_value").text(data);
				$("#id_name").val('');
				$("#id_email").val('');
				$("#id_phone").val('');
			}			
		},
		error:function(){
			alert("에러입니다.");
		}
	});
};

const modal = document.getElementById("modal");
const btnModal = document.getElementById("find_id");

btnModal.addEventListener("click", e => {
    modal.style.display = "flex"
});

    
const closeBtn = modal.querySelector(".close-area")
closeBtn.addEventListener("click", e => {
    modal.style.display = "none"
});

modal.addEventListener("click", e => {
    const evTarget = e.target
    if(evTarget.classList.contains("modal-overlay")) {
        modal.style.display = "none"
    }
});