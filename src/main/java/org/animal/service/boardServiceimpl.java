package org.animal.service;

import java.util.ArrayList;

import org.animal.mapper.boardMapper;
import org.animal.model.informationVO;
import org.animal.model.tendinousVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class boardServiceimpl implements boardService {
	@Autowired
	boardMapper bm; // 글쓰기 관련 mapper
	
	/*동물 소개 글 등록 구현*/
	/*public void information_writing(informationVO into) {
		bm.information_writing(into);
	}*/
	
	/*건의게시판 글 등록 구현*/
	public void tend_writing(tendinousVO tend) {
		bm.tend_writing(tend);
	}
	/* 건의게시판 리스트 설계 */
	public ArrayList<tendinousVO> tend_list() {
		return bm.tend_list();
	}
}
