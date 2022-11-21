package org.animal.controller;

import javax.servlet.http.HttpSession;

import org.animal.model.memberVO;
import org.animal.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class memberController {
	@Autowired
	memberService ms;

	/* 로그인 */
	// 로그인 페이지
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String get_login() {
		return "/login/login";
	}
	// 로그인 이동
	@RequestMapping(value = "/login/login_post", method = RequestMethod.POST)
	public String post_login(memberVO mvo, HttpSession session, RedirectAttributes rttr) {
		boolean result=ms.login(mvo, session);
		if(result) { // 로그인 성공
			System.out.println("로그인 성공");
			rttr.addFlashAttribute("msg","success");
			return "redirect:/";
		}else {
			System.out.println("로그인 실패");
			rttr.addFlashAttribute("msg","fail");
			return "redirect:/login";	
		}
	}
	// 로그아웃
	@RequestMapping(value = "/login/logout", method = RequestMethod.GET)
	public String get_logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	// 로그인 체크
	@RequestMapping(value = "/login/logincheck", method = RequestMethod.POST)
	public ResponseEntity<String> logincheck(@RequestBody memberVO mvo) {
		System.out.println("회원 컨트롤러 = " + mvo);
		int result=ms.logincheck(mvo);
		System.out.println("result결과 = " + result);
		
		return result==1?new ResponseEntity<>("success", HttpStatus.OK)
				        :new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

	/* 회원가입 페이지 */
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String getsignup() {
		return "/login/signup";
	}

	/* 회원 등록 */
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(memberVO member) {
		ms.signup(member);
		return "redirect:/login";
	}

	/* 아이디 중복 체크 */
	@RequestMapping(value = "/signup/idcheck/{id}", method = RequestMethod.GET)
	public ResponseEntity<memberVO> idcheck(@PathVariable("id") String id) {
		System.out.println(id);
		return new ResponseEntity<>(ms.idcheck(id), HttpStatus.OK);
	}

	/* 이메일 중복 체크 */
	@RequestMapping(value = "/signup/emailcheck/{email}", method = RequestMethod.GET)
	public ResponseEntity<memberVO> emailcheck(@PathVariable("email") String email) {
		System.out.println(email);
		return new ResponseEntity<>(ms.emailcheck(email), HttpStatus.OK);
	}

	/* 전화번호 중복 체크 */
	@RequestMapping(value = "/signup/phonecheck/{phone}", method = RequestMethod.GET)
	public ResponseEntity<memberVO> phonecheck(@PathVariable("phone") String phone) {
		System.out.println(phone);
		return new ResponseEntity<>(ms.phonecheck(phone), HttpStatus.OK);
	}

	/* 아이디/비밀번호 찾기 페이지 */
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String getfind() {
		return "/login/find";
	}
}
