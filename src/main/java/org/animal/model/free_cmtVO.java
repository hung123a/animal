package org.animal.model;

public class free_cmtVO {
	private int cno; // 자유게시판 댓글 번호
	private String cmt_title; // 자유게시판 댓글 제목
	private String cmt_cont; // 자유게시판 댓글 내용
	private String cmt_data; // 자유게시판 댓글 등록 일자
	private int fno; // 자유게시판과 조인을 위한 번호
	private String id; // 회원테이블과 조인을 위한 아이디
	private String type; // 페이지 분류를 위한 컬럼
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCmt_title() {
		return cmt_title;
	}
	public void setCmt_title(String cmt_title) {
		this.cmt_title = cmt_title;
	}
	public String getCmt_cont() {
		return cmt_cont;
	}
	public void setCmt_cont(String cmt_cont) {
		this.cmt_cont = cmt_cont;
	}
	public String getCmt_data() {
		return cmt_data;
	}
	public void setCmt_data(String cmt_data) {
		this.cmt_data = cmt_data;
	}
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "free_cmtVO [cno=" + cno + ", cmt_title=" + cmt_title + ", cmt_cont=" + cmt_cont + ", cmt_data="
				+ cmt_data + ", fno=" + fno + ", id=" + id + ", type=" + type + "]";
	}
	
}
