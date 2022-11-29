/**
 * 탭메뉴 클릭 이벤트, 전화번호 하이픈 js
 */
$(document).ready(function() {
	/* 탭메뉴 클릭 이벤트 */
	$('#id_search').click(function() {
		if ($("#find_id").css('display') == 'block') {
		} else {
			$("#find_id").css('display', 'block');
			$("#find_pwd").css('display', 'none');
		}
	});

	$('#pwd_search').click(function() {
		if ($("#find_pwd").css('display') == 'block') {
		} else {
			$("#find_pwd").css('display', 'block');
			$("#find_id").css('display', 'none');
		}
	});	
	
});

