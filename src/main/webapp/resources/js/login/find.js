/**
 * 회원가입 관련 js
 */

function ids() {
	if ($("#find_id").css('display') == 'block') {
		$("#find_id").css('display', 'none');
	} else {
		$("#find_id").css('display', 'block');
		$("#find_pwd").css('display', 'none');
	}
}

function pwd() {
	if ($("#find_pwd").css('display') == 'block') {
		$("#find_pwd").css('display', 'none');
	} else {
		$("#find_pwd").css('display', 'block');
		$("#find_id").css('display', 'none');
	}
}
