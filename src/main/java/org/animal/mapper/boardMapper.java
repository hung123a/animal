package org.animal.mapper;

import org.animal.model.informationVO;

public interface boardMapper {
	/* 동물 소개 글 등록 DB설계 */
	public void information_writing(informationVO into);
}
