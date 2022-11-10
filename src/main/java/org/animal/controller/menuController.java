package org.animal.controller;

import org.animal.model.informationVO;
import org.animal.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class menuController {
	@Autowired
	memberService ms;

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
	
	/* 동물소개 글쓰기 등록 */
	@RequestMapping(value = "/information/information_writing", method = RequestMethod.POST)
	public String information_writing(informationVO info) {
		
		return "redirect:/page?type=information";
	}
	
	/* 사진첩 글쓰기 페이지 */
	@RequestMapping(value = "/photo/photo_writing", method = RequestMethod.GET)
	public String photo_page() {
		return "/photo/photo_writing";
	}
}
