package org.animal.service;

import java.util.ArrayList;

import org.animal.mapper.AttachMapper;
import org.animal.mapper.boardMapper;
import org.animal.model.CriteriaVO;
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

	/* 동물 소개 */
	// 동물 소개 글 등록 구현
	public void info_writing(informationVO animal_info) {
		bm.info_writing(animal_info);

		animal_info.getInfo().forEach(info -> {

			// info_uploadVO의 info_no에 informationVO의 ino를 저장
			info.setIno(animal_info.getIno());
			am.info_insert(info);
		});
	}

	// 동물 소개 리스트 구현
	public ArrayList<informationVO> info_list(CriteriaVO cri) {
		return bm.info_list(cri);
	}

	// 동물 소개 메인 이미지 구현
	public informationVO main(informationVO animal_info) {
		return bm.main(animal_info);
	}

	// 동물 소개 서브 이미지 구현
	public ArrayList<informationVO> sub(informationVO animal_info) {
		return bm.sub(animal_info);
	}

	/* 사진첩 */
	// 사진첩 이미지 등록 구현
	/*public void photo_insert(photo_uploadVO p_img) {
		am.photo_insert(p_img);
	}*/

	// 사진첩 리스트 구현
	/*public ArrayList<photo_uploadVO> photo_list(CriteriaVO cri) {
		return bm.photo_list(cri);
	}*/

	/* 자유게시판 */
	// 자유게시판 글 등록 구현
	public void free_writing(free_boardVO board) {
		bm.free_writing(board);

		board.getBoard_img().forEach(board_img -> {
			board_img.setFno(board.getFno());
			am.free_insert(board_img);
		});
	}

	// 자유게시판 리스트 구현
	public ArrayList<free_boardVO> free_list(CriteriaVO cri) {
		return bm.free_list(cri);
	}

	/* 건의게시판 */
	// 건의게시판 글 등록 구현
	public void tend_writing(tendinousVO tend) {
		bm.tend_writing(tend);
	}
	// 건의게시판 리스트 구현
	public ArrayList<tendinousVO> tend_list(CriteriaVO cri) {
		return bm.tend_list(cri);
	}
	
	/* 페이징 */
	// 테이블 전체 건수 구현
	public int total(CriteriaVO cri) {
		return bm.total(cri);
	};
}
