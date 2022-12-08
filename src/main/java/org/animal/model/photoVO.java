package org.animal.model;

import java.util.ArrayList;

public class photoVO {
	private String photo_data; // 사진첩 등록 일자
	private String id; // 회원 아이디
	private int bgno; // 페이지 분류
	private int pno; // 사진 번호
	private ArrayList<photo_uploadVO> p_img; // 사진첩 이미지 정보 vo 연결
	public String getPhoto_data() {
		return photo_data;
	}
	public void setPhoto_data(String photo_data) {
		this.photo_data = photo_data;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBgno() {
		return bgno;
	}
	public void setBgno(int bgno) {
		this.bgno = bgno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public ArrayList<photo_uploadVO> getP_img() {
		return p_img;
	}
	public void setP_img(ArrayList<photo_uploadVO> p_img) {
		this.p_img = p_img;
	}
	@Override
	public String toString() {
		return "photoVO [photo_data=" + photo_data + ", id=" + id + ", bgno=" + bgno + ", pno=" + pno + ", p_img="
				+ p_img + "]";
	}
	
}
