package org.animal.service;

import org.animal.mapper.AnimalMapper;
import org.animal.model.memberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceimpl implements AnimalService {
	@Autowired
	AnimalMapper am; // 테이블로 연결되는 mapper
	
	/* 서비스 */
	// 회원가입
	public void signup(memberVO member) {
		am.signup(member);
	}
	// 아이디 중복 체크
	public memberVO idcheck(String id) {
		return am.idcheck(id);
	}
	// 이메일 중복 체크
	public memberVO emailcheck(String email) {
		return am.emailcheck(email);
	}
}
