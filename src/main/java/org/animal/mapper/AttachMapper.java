package org.animal.mapper;

import org.animal.model.free_uploadVO;
import org.animal.model.info_uploadVO;
import org.animal.model.photo_uploadVO;

public interface AttachMapper {
	// 동물 소개 글쓰기할 당시에 첨부파일 DB작업 설계
	public void info_insert(info_uploadVO info);

	// 사진첩 첨부파일 DB파일 설계
	public void photo_insert(photo_uploadVO p_img);
	
	// 자유게시판 글쓰기할 당시에 첨부파일 DB작업 설계
	public void free_insert(free_uploadVO board_img);
}
