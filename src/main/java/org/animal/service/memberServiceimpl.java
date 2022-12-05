package org.animal.service;

import org.animal.mapper.memberMapper;
import org.animal.model.memberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class memberServiceimpl implements memberService {
	@Autowired
	memberMapper mm; // 테이블로 연결되는 mapper

	/* 서비스 */
	// 로그인
	public memberVO login(memberVO mvo) {
		return mm.login(mvo);
	}

	/* 아이디, 비밀번호 찾기 */
	// 아이디 찾기
	@Override
	public String find_id(String name, String email, String phone) {
		String result = "";
		try {
			result = mm.find_id(name, email, phone);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 비밀번호 찾기
	@Override
	public String find_pwd(String name, String email, String phone, String id) {
		String result = "";
		try {
			result = mm.find_pwd(name, email, phone, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 로그인 체크
	public int logincheck(memberVO mvo) {
		System.out.println("로그인 체크=" + mvo);
		return mm.logincheck(mvo);
	}

	// 회원가입
	public void signup(memberVO member) {
		mm.signup(member);
	}
	// 아이디 중복 체크
	public memberVO idcheck(String id) {
		return mm.idcheck(id);
	}
	// 이메일 중복 체크
	public memberVO emailcheck(String email) {
		return mm.emailcheck(email);
	}
	// 전화번호 중복 체크
	public memberVO phonecheck(String phone) {
		return mm.phonecheck(phone);
	}
}
