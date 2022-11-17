package org.animal.mapper;

import java.util.ArrayList;

import org.animal.model.free_boardVO;
import org.animal.model.informationVO;
import org.animal.model.tendinousVO;

public interface boardMapper {
	/* 동물 소개 글 등록 DB설계 */
	public void info_writing(informationVO animal_info);
	
	/*동물 소개 리스트 DB설계*/
	public ArrayList<informationVO> info_list();
	
	/*동물 소개 메인 이미지 DB설계*/
	public informationVO main(informationVO animal_info);
	
	/*동물 소개 서브 이미지 DB설계*/
	public ArrayList<informationVO> sub(informationVO animal_info);

	/* 자유게시판 글 등록 DB설계 */
	public void free_writing(free_boardVO free);

	/* 자유게시판 리스트 DB설계 */
	public ArrayList<free_boardVO> free_list();
	
	/* 건의게시판 글 등록 DB설계 */
	public void tend_writing(tendinousVO tend);
	
	/* 건의게시판 리스트 DB설계 */
	public ArrayList<tendinousVO> tend_list();
}
