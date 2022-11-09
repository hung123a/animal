package org.animal.service;

import org.animal.model.memberVO;

public interface memberService {
	/* 서비스 */
	// 회원가입 설계
	public void signup(memberVO member); 
	// 아이디 중복 체크
	public memberVO idcheck(String id);
	// 이메일 중복 체크
	public memberVO emailcheck(String email);
	// 전화번호 중복 체크
	public memberVO phonecheck(String phone);
}
