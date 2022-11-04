package org.animal.mapper;

import org.animal.model.memberVO;

public interface AnimalMapper {
	/* 서비스 */
	// 회원가입
	public void signup(memberVO member);
	// 아이디 중복 체크
	public memberVO idcheck(String id);
	// 이메일 중복 체크
	public memberVO emailcheck(String email);
}
