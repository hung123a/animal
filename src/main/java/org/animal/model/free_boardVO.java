package org.animal.model;

public class free_boardVO {
	private int fno; // 자유게시판 번호
	private String title; // 자유게시판 제목
	private String contents; // 자유게시판 내용
	private int free_cnt; // 자유게시판 조회수
	private String free_img; // 자유게시판 이미지  
	private String free_data; // 자유게시판 등록 일자
	private String id; // 회원테이블과 조인을 위한 아이디
	private String type; // 페이지 분류를 위한 컬럼
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getFree_cnt() {
		return free_cnt;
	}
	public void setFree_cnt(int free_cnt) {
		this.free_cnt = free_cnt;
	}
	public String getFree_img() {
		return free_img;
	}
	public void setFree_img(String free_img) {
		this.free_img = free_img;
	}
	public String getFree_data() {
		return free_data;
	}
	public void setFree_data(String free_data) {
		this.free_data = free_data;
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
		return "free_boardVO [fno=" + fno + ", title=" + title + ", contents=" + contents + ", free_cnt=" + free_cnt
				+ ", free_img=" + free_img + ", free_data=" + free_data + ", id=" + id + ", type=" + type + "]";
	}
	
}
