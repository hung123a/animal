package org.animal.model;

public class tendinous_sncVO {
	 private int sno; // 건의게시판 댓글 번호
	 private String snc_title; // 건의게시판 댓글 제목
	 private String snc_cont; // 건의게시판 댓글 내용
	 private String snc_data; // 건의게시판 댓글 등록 일자
	 private int tno; // 건의게시판과 조인을 위한 번호
	 private String id; // 회원테이블과 조인을 위한 아이디(관리자)
	 private int type; // 페이지 분류를 위한 컬럼
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSnc_title() {
		return snc_title;
	}
	public void setSnc_title(String snc_title) {
		this.snc_title = snc_title;
	}
	public String getSnc_cont() {
		return snc_cont;
	}
	public void setSnc_cont(String snc_cont) {
		this.snc_cont = snc_cont;
	}
	public String getSnc_data() {
		return snc_data;
	}
	public void setSnc_data(String snc_data) {
		this.snc_data = snc_data;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "tendinous_sncVO [sno=" + sno + ", snc_title=" + snc_title + ", snc_cont=" + snc_cont + ", snc_data="
				+ snc_data + ", tno=" + tno + ", id=" + id + ", type=" + type + "]";
	}
	 
}