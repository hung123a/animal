package org.animal.mapper;

import java.util.ArrayList;

import org.animal.model.CriteriaVO;
import org.animal.model.free_boardVO;
import org.animal.model.informationVO;
import org.animal.model.tendinousVO;

public interface boardMapper {
	/* 동물 소개 */
	// 동물 소개 글 등록 DB설계
	public void info_writing(informationVO animal_info);
	// 동물 소개 리스트 DB설계
	public ArrayList<informationVO> info_list(CriteriaVO cri);
	// 동물 소개 메인 이미지 DB설계
	public informationVO main(informationVO animal_info);
	// 동물 소개 서브 이미지 DB설계
	public ArrayList<informationVO> sub(informationVO animal_info);

	/* 사진첩 */
	
	/* 자유게시판 */
	// 자유게시판 글 등록 DB설계 
	public void free_writing(free_boardVO board);

	// 자유게시판 리스트 DB설계 
	public ArrayList<free_boardVO> free_list(CriteriaVO cri);

	/* 건의게시판 */
	// 건의게시판 글 등록 DB설계 
	public void tend_writing(tendinousVO tend);
	// 건의게시판 리스트 DB설계 
	public ArrayList<tendinousVO> tend_list(CriteriaVO cri);
	
	/*페이징*/
	// 테이블 전체 건수 설계 
	public int total(CriteriaVO cri);
}
