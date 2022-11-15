package org.animal.service;

import java.util.ArrayList;

import org.animal.model.informationVO;
import org.animal.model.tendinousVO;

public interface boardService {
	/* 동물 소개 글 등록 설계 */
	/*public void information_writing(informationVO into);*/
	
	/*건의게시판 글 등록 설계*/
	public void tend_writing(tendinousVO tend);

	/* 건의게시판 리스트 설계 */
	public ArrayList<tendinousVO> tend_list();
}
