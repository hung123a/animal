package org.animal.service;

import javax.servlet.http.HttpSession;

import org.animal.model.memberVO;

public interface memberService {
	/* 서비스 */
	/* 로그인 */
	// 로그인
	public boolean login(memberVO mvo, HttpSession session);

	/* 아이디, 비밀번호 찾기 */
	// 아이디 찾기
	public String find_id(String name, String email, String phone);

	// 비밀번호 찾기
	public String find_pwd(String name, String email, String phone, String id);

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
