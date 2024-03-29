package org.animal.controller;

import org.animal.model.info_CriteriaVO;
import org.animal.model.info_pageVO;

import javax.servlet.http.HttpSession;

import org.animal.model.free_CriteriaVO;
import org.animal.model.free_boardVO;
import org.animal.model.free_pageVO;
import org.animal.model.informationVO;
import org.animal.model.photoVO;
import org.animal.model.photo_CriteriaVO;
import org.animal.model.photo_pageVO;
import org.animal.model.tend_CriteriaVO;
import org.animal.model.tend_pageVO;
import org.animal.model.tendinousVO;
import org.animal.service.boardService;
import org.animal.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String page(Model model, informationVO animal_info, info_CriteriaVO icri,photo_CriteriaVO pcri, free_CriteriaVO fcri, tend_CriteriaVO tcri) {
		String path="";
		if(icri.getBgno()==1) { // 만약에 bgno가 1이면
			// 동물 소개
			model.addAttribute("info", bs.info_list(icri));
			path="information/information";
		}else if(pcri.getBgno()==2) { // 만약에 bgno가 2이면
			// 사진첩
			model.addAttribute("photo", bs.photo_list(pcri));
			path="photo/photo";
		}else if(fcri.getBgno()==3) { // 만약에 bgno가 3이면
			// 자유게시판
			model.addAttribute("free", bs.free_list(fcri));
			path="free_board/freeboard";
		}else if(tcri.getBgno()==4) {
			// 건의 게시판
			model.addAttribute("tend", bs.tend_list(tcri));
			path="tendinous/tendinous";
		}		
		int info_total=bs.info_total(icri);
		int photo_total=bs.photo_total(pcri);
		int free_total=bs.free_total(fcri);
		int tend_total=bs.tend_total(tcri);
		model.addAttribute("ipaging", new info_pageVO(icri, info_total));
		model.addAttribute("ppaging", new photo_pageVO(pcri, photo_total));
		model.addAttribute("fpaging", new free_pageVO(fcri, free_total));
		model.addAttribute("tpaging", new tend_pageVO(tcri, tend_total));
		return path;
		
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
		return "redirect:/page?bgno=1&pageNum=1";
	}

	/* 사진첩 */
	// 사진첩 글쓰기 페이지
	@RequestMapping(value = "/photo", method = RequestMethod.GET)
	public String photo_page() {
		return "/photo/photo_writing";
	}

	// 사진첩 글쓰기 등록
	@RequestMapping(value = "/photo_writing", method = RequestMethod.POST)
	public String photo_page_post(photoVO photo) {
		System.out.println("사진첩="+photo);		
		bs.photo_writing(photo);
		return "redirect:/page?bgno=2&pageNum=1";
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
		return "redirect:/page?bgno=3&pageNum=1";
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
		return "redirect:/page?bgno=4&pageNum=1";
	}
	
	// 건의게시판 상세보기
	@RequestMapping(value = "/tendinous_datall", method = RequestMethod.GET)
	public String tendinous_datall_get() {
		return "/tendinous/tendinous_datall";
	}

}
