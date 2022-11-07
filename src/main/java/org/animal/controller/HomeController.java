package org.animal.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.animal.model.memberVO;
import org.animal.service.AnimalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	AnimalService as;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/* 메인 페이지 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		return "AnimalCommunity";
	}

	/* 서브 페이지 */
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String shop() {
		return "/tap/page";
	}

	/* 동물소개 글쓰기 페이지 */
	@RequestMapping(value = "/information/information_writing", method = RequestMethod.GET)
	public String information_page() {
		return "/information/information_writing";
	}

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
	@RequestMapping(value = "/Signup/idcheck/{id}", method = RequestMethod.GET)
	public ResponseEntity<memberVO> idcheck(@PathVariable("id") String id) {
		System.out.println(id);
		return new ResponseEntity<>(as.idcheck(id), HttpStatus.OK);
	}

	/* 이메일 중복 체크 */
	@RequestMapping(value = "/Signup/emailcheck/{email}", method = RequestMethod.GET)
	public ResponseEntity<memberVO> emailcheck(@PathVariable("email") String email) {
		System.out.println(email);
		return new ResponseEntity<>(as.emailcheck(email), HttpStatus.OK);
	}

	/* 아이디/비밀번호 찾기 페이지 */
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String getfind() {
		return "redirect:/login/find";
	}

}
