/*
 *  로그인 관련 처리 
 */
function loginChk() {
    var form = document.f1;
    if (!form.id.value) {
        alert("아이디를 입력해 주십시오.");
        form.id.focus();
        return;
    }
 
    if (!form.pwd.value) {
        alert("비밀번호를 입력해 주십시오.");
        form.pwd.focus();
        return;
    }
    form.action = "/login/login_post";
    form.submit();
}