package org.animal.service;

import org.animal.model.memberVO;

public interface memberService {
	/* 서비스 */
	/*로그인*/
	// 로그인 
	public memberVO login(memberVO mvo);
	// 아이디 찾기
	public String find_id(String name, String email, String phone);
	// 로그인 체크
	public int logincheck(memberVO mvo);
	// 회원가입 설계
	public void signup(memberVO member); 
	// 아이디 중복 체크
	public memberVO idcheck(String id);
	// 이메일 중복 체크
	public memberVO emailcheck(String email);
	// 전화번호 중복 체크
	public memberVO phonecheck(String phone);
}
