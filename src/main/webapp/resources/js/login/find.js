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


/*const autophone = (target) => { 
	   target.value = target.value.replace(/[^0-9]/g, "")
	   .replace(/(^02|^0505|^1[0-9]{3}|^0[0-9]{2})([0-9]+)?([0-9]{4})$/,"$1-$2-$3").replace("--", "-"); 
	};*/
 