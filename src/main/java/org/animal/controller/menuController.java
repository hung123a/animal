package org.animal.controller;

import org.animal.model.informationVO;
import org.animal.model.tendinousVO;
import org.animal.service.boardService;
import org.animal.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class menuController {
	@Autowired
	memberService ms;
	boardService bs;

	/* 서브 페이지 */
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String shop() {
		return "/tap/page";
	}

	/* 동물소개 글쓰기 페이지 */
	@RequestMapping(value = "/information_writing", method = RequestMethod.GET)
	public String information_page() {
		return "/information/information_writing";
	}

	/* 동물소개 글쓰기 등록 */
	/*@RequestMapping(value = "/information/information_writing", method = RequestMethod.POST)
	public String information_writing(informationVO info) {

		return "redirect:/page?type=information";
	}*/

	/* 사진첩 글쓰기 페이지 */
	@RequestMapping(value = "/photo_writing", method = RequestMethod.GET)
	public String photo_page() {
		return "/photo/photo_writing";
	}

	/* 자유게시판 글쓰기 페이지 */
	@RequestMapping(value = "/free_writing", method = RequestMethod.GET)
	public String free_page() {
		return "/free_board/free_writing";
	}

	/* 건의게시판 글쓰기 페이지 */
	@RequestMapping(value = "/tendinous", method = RequestMethod.GET)
	public String tendinous_get() {
		return "/tendinous/tendinous_writing";
	}

	/* 건의게시판 글쓰기 등록 */
	@RequestMapping(value = "/tendinous_writing", method = RequestMethod.POST)
	public String tend_post(tendinousVO tend) {
		System.out.println("건의게시판 글쓰기 등록 =" + tend);
		bs.tend_writing(tend);
		return "redirect:/page?type=tendinous";
	}

}
