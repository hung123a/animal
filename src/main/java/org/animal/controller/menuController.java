package org.animal.controller;

import org.animal.model.free_boardVO;
import org.animal.model.informationVO;
import org.animal.model.tendinousVO;
import org.animal.service.boardService;
import org.animal.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class menuController {
	@Autowired
	memberService ms;
	@Autowired
	boardService bs;

	/* 서브 페이지 */
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String page(Model model, informationVO animal_info) {
		/* 건의 게시판 리스트 */
		model.addAttribute("tend", bs.tend_list());
		/* 자유게시판 리스트 */
		model.addAttribute("free", bs.free_list());
		/* 동물 소개 리스트 */
		model.addAttribute("info", bs.info_list(animal_info));
		return "/tap/page";
	}

	/* 동물 소개 */
	// 동물소개 글쓰기 페이지
	@RequestMapping(value = "/information", method = RequestMethod.GET)
	public String info_get() {
		return "/information/information_writing";
	}

	// 동물소개 글쓰기 등록
	@RequestMapping(value = "/information_writing", method = RequestMethod.POST)
	public String info_post(informationVO animal_info) {		
		System.out.println("동물소개="+animal_info);
		bs.info_writing(animal_info);
		return "redirect:/page?type=information";
	}

	/* 사진첩 */
	// 사진첩 글쓰기 페이지
	@RequestMapping(value = "/photo", method = RequestMethod.GET)
	public String photo_page() {
		return "/photo/photo_writing";
	}

	// 사진첩 글쓰기 등록
	@RequestMapping(value = "/photo_writing", method = RequestMethod.POST)
	public String photo_page_post() {
		return "/photo/photo_writing";
	}

	/* 자유게시판 */
	// 자유게시판 글쓰기 페이지
	@RequestMapping(value = "/free_board", method = RequestMethod.GET)
	public String free_get() {
		return "/free_board/free_writing";
	}

	// 자유게시판 글쓰기 등록
	@RequestMapping(value = "/free_writing", method = RequestMethod.POST)
	public String free_post(free_boardVO board) {
		System.out.println("자유게시판="+board);
		bs.free_writing(board);
		return "redirect:/page?type=free_board";
	}

	/* 건의게시판 */
	// 건의게시판 글쓰기 페이지
	@RequestMapping(value = "/tendinous", method = RequestMethod.GET)
	public String tendinous_get() {
		return "/tendinous/tendinous_writing";
	}
	
	// 건의게시판 글쓰기 등록
	@RequestMapping(value = "/tendinous_writing", method = RequestMethod.POST)
	public String tend_post(tendinousVO tend) {		
		bs.tend_writing(tend);
		return "redirect:/page?type=tendinous";
	}
	
	// 건의게시판 상세보기
	@RequestMapping(value = "/tendinous_datall", method = RequestMethod.GET)
	public String tendinous_datall_get() {
		return "/tendinous/tendinous_datall";
	}

}
