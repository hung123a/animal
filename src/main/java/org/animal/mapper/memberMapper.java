package org.animal.mapper;

import org.animal.model.memberVO;

public interface memberMapper {
	/* 서비스 */
	// 로그인
	public memberVO login(memberVO mvo);
	// 로그인 체크
	public int logincheck(memberVO mvo);
	// 회원가입
	public void signup(memberVO member);

	// 아이디 중복 체크
	public memberVO idcheck(String id);

	// 이메일 중복 체크
	public memberVO emailcheck(String email);

	// 전화번호 중복 체크
	public memberVO phonecheck(String phone);
}
