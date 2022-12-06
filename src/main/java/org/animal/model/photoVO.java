package org.animal.model;

import java.util.ArrayList;

public class photoVO {
	private int pno; // 사진첩 번호
	private String photo_img; // 사진첩 이미지
	private String photo_data; // 사진첩 등록 일자
	private String id; // 회원테이블과 조인을 위한 아이디(관리자)
	private int bgno; // 페이지 분류
	private ArrayList<photo_uploadVO> p_img;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPhoto_img() {
		return photo_img;
	}
	public void setPhoto_img(String photo_img) {
		this.photo_img = photo_img;
	}
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
	public ArrayList<photo_uploadVO> getP_img() {
		return p_img;
	}
	public void setP_img(ArrayList<photo_uploadVO> p_img) {
		this.p_img = p_img;
	}
	@Override
	public String toString() {
		return "photoVO [pno=" + pno + ", photo_img=" + photo_img + ", photo_data=" + photo_data + ", id=" + id
				+ ", bgno=" + bgno + ", p_img=" + p_img + "]";
	}
	
}
