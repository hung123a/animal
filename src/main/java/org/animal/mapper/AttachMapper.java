package org.animal.mapper;

import org.animal.model.info_uploadVO;

public interface AttachMapper {
	// 글쓰기할 당시에 첨부파일 DB작업 설계
	public void info_insert(info_uploadVO info);
}
