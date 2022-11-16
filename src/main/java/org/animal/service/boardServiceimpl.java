package org.animal.service;

import java.util.ArrayList;

import org.animal.mapper.boardMapper;
import org.animal.model.free_boardVO;
import org.animal.model.informationVO;
import org.animal.model.tendinousVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class boardServiceimpl implements boardService {
	@Autowired
	boardMapper bm; // 글쓰기 관련 mapper

	/* 동물 소개 글 등록 구현 */
	public void info_writing(informationVO info) {
		bm.info_writing(info);
	}

	/* 동물 소개 리스트 구현 */
	public ArrayList<informationVO> info_list() {
		return bm.info_list();
	}

	/* 자유게시판 글 등록 구현 */
	public void free_writing(free_boardVO free) {
		bm.free_writing(free);
	}

	/* 자유게시판 리스트 구현 */
	public ArrayList<free_boardVO> free_list() {
		return bm.free_list();
	}

	/* 건의게시판 글 등록 구현 */
	public void tend_writing(tendinousVO tend) {
		bm.tend_writing(tend);
	}

	/* 건의게시판 리스트 구현 */
	public ArrayList<tendinousVO> tend_list() {
		return bm.tend_list();
	}
}
