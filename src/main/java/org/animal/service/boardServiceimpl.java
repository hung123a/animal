package org.animal.service;

import java.util.ArrayList;

import org.animal.mapper.AttachMapper;
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

	@Autowired
	AttachMapper am; // Sattach테이블 mapper


	/* 동물 소개 글 등록 구현 */
	public void info_writing(informationVO animal_info) {
		bm.info_writing(animal_info);
		
		animal_info.getInfo().forEach(info -> {
			
			// info_uploadVO의 info_no에 informationVO의 ino를 저장
			info.setIno(animal_info.getIno());;
			am.info_insert(info);
		});
	}

	/* 동물 소개 리스트 구현 */
	public ArrayList<informationVO> info_list(informationVO animal_info) {
		return bm.info_list(animal_info);
	}

	/* 동물 소개 메인 이미지 DB설계 */
	public informationVO main(informationVO animal_info) {
		return bm.main(animal_info);
	}

	/* 동물 소개 서브 이미지 DB설계 */
	public ArrayList<informationVO> sub(informationVO animal_info) {
		return bm.sub(animal_info);
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
