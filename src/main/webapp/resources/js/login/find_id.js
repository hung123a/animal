/**
 * 회원가입 관련 js
 */
$(document).ready(function() {
	$('#find_id').click(function() {
		if ($("#find_id").css('display') == 'block') {
		} else {
			$("#find_id").css('display', 'block');
			$("#find_pwd").css('display', 'none');
		}
	})

	$('#find_pwd').click(function() {
		if ($("#find_pwd").css('display') == 'block') {
		} else {
			$("#find_pwd").css('display', 'block');
			$("#find_id").css('display', 'none');
		}
	})
})
/*function ids() {
	if ($("#find_id").css('display') == 'block') {
	} else {
		$("#find_id").css('display', 'block');
		$("#find_pwd").css('display', 'none');
	}
}

function pwd() {
	if ($("#find_pwd").css('display') == 'block') {
	} else {
		$("#find_pwd").css('display', 'block');
		$("#find_id").css('display', 'none');
	}
}*/
