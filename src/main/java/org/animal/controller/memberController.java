package org.animal.controller;

import org.animal.model.memberVO;
import org.animal.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class memberController {
	@Autowired
	memberService as;
	
	/* 로그인 페이지 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "/login/login";
	}
	/* 회원가입 페이지 */
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String getsignup() {
		return "/login/signup";
	}

	/* 회원 등록 */
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(memberVO member) {
		as.signup(member);
		return "redirect:/login";
	}

	/* 아이디 중복 체크 */
	@RequestMapping(value = "/signup/idcheck/{id}", method = RequestMethod.GET)
	public ResponseEntity<memberVO> idcheck(@PathVariable("id") String id) {
		System.out.println(id);
		return new ResponseEntity<>(as.idcheck(id), HttpStatus.OK);
	}

	/* 이메일 중복 체크 */
	@RequestMapping(value = "/signup/emailcheck/{email}", method = RequestMethod.GET)
	public ResponseEntity<memberVO> emailcheck(@PathVariable("email") String email) {
		System.out.println(email);
		return new ResponseEntity<>(as.emailcheck(email), HttpStatus.OK);
	}
	/* 전화번호 중복 체크 */
	@RequestMapping(value = "/signup/phonecheck/{phone}", method = RequestMethod.GET)
	public ResponseEntity<memberVO> phonecheck(@PathVariable("phone") String phone) {
		System.out.println(phone);
		return new ResponseEntity<>(as.phonecheck(phone), HttpStatus.OK);
	}

	/* 아이디/비밀번호 찾기 페이지 */
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String getfind() {
		return "/login/find";
	}
}
