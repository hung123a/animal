package org.animal.service;

import java.util.ArrayList;

import org.animal.model.free_boardVO;
import org.animal.model.informationVO;
import org.animal.model.tendinousVO;

public interface boardService {
	/* 동물 소개 글 등록 설계 */
	public void info_writing(informationVO info);

	/* 동물 소개 리스트 설계 */
	public ArrayList<informationVO> info_list();

	/* 자유게시판 글 등록 DB설계 */
	public void free_writing(free_boardVO free);

	/* 자유게시판 리스트 DB설계 */
	public ArrayList<free_boardVO> free_list();

	/* 건의게시판 글 등록 설계 */
	public void tend_writing(tendinousVO tend);

	/* 건의게시판 리스트 설계 */
	public ArrayList<tendinousVO> tend_list();
}
