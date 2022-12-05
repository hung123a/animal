package org.animal.mapper;

import org.animal.model.memberVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface memberMapper {
	/* 서비스 */
	// 로그인
	public memberVO login(memberVO mvo);

	/* 아이디, 비밀번호 찾기 */
	// 아이디 찾기
	@Select("select ifnull(id, 0) from member where name=#{name} and email=#{email} and phone=#{phone}")
	public String find_id(@Param("name") String name, @Param("email") String email, @Param("phone") String phone);

	// 비밀번호 찾기
	@Select("select ifnull(pwd, 0) from member where name=#{name} and email=#{email} and phone=#{phone} and id=#{id}")
	public String find_pwd(@Param("name") String name, @Param("email") String email, @Param("phone") String phone, @Param("id") String id);

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
