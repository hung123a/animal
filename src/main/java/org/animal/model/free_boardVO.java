package org.animal.model;

import java.util.ArrayList;

public class free_boardVO {
	private int fno; // 자유게시판 번호
	private String title; // 자유게시판 제목
	private String contents; // 자유게시판 내용
	private int free_cnt; // 자유게시판 조회수
	private int free_like; // 자유게시판 추천수
	private String free_img; // 자유게시판 이미지
	private String free_data; // 자유게시판 등록 일자
	private String free_date; // 자유게시판 등록 날짜
	private String id; // 회원테이블과 조인을 위한 아이디
	private int type; // 페이지 분류를 위한 컬럼
	private ArrayList<free_uploadVO> board_img; // 자유게시판 이미지 업로드 vo와 연결

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

	public int getFree_like() {
		return free_like;
	}

	public void setFree_like(int free_like) {
		this.free_like = free_like;
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

	public String getFree_date() {
		return free_date;
	}

	public void setFree_date(String free_date) {
		this.free_date = free_date;
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

	public ArrayList<free_uploadVO> getBoard_img() {
		return board_img;
	}

	public void setBoard_img(ArrayList<free_uploadVO> board_img) {
		this.board_img = board_img;
	}

	@Override
	public String toString() {
		return "free_boardVO [fno=" + fno + ", title=" + title + ", contents=" + contents + ", free_cnt=" + free_cnt
				+ ", free_like=" + free_like + ", free_img=" + free_img + ", free_data=" + free_data + ", free_date="
				+ free_date + ", id=" + id + ", type=" + type + ", board_img=" + board_img + "]";
	}

}
