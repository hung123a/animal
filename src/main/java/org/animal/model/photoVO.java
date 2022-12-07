package org.animal.model;

public class photoVO {
	private String photo_uid; // 사진 파일정보
	private String photo_name; // 파일 이름
	private boolean photo_image; // 파일 설명 사진
	private String photo_upload; // 파일 저장되어 있는 경로
	private String photo_data; // 사진첩 등록 일자
	private String id; // 회원 아이디
	private int bgno; // 페이지 분류
	private int pno; // 사진 번호
	public String getPhoto_uid() {
		return photo_uid;
	}
	public void setPhoto_uid(String photo_uid) {
		this.photo_uid = photo_uid;
	}
	public String getPhoto_name() {
		return photo_name;
	}
	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}
	public boolean isPhoto_image() {
		return photo_image;
	}
	public void setPhoto_image(boolean photo_image) {
		this.photo_image = photo_image;
	}
	public String getPhoto_upload() {
		return photo_upload;
	}
	public void setPhoto_upload(String photo_upload) {
		this.photo_upload = photo_upload;
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
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	@Override
	public String toString() {
		return "photoVO [photo_uid=" + photo_uid + ", photo_name=" + photo_name + ", photo_image=" + photo_image
				+ ", photo_upload=" + photo_upload + ", photo_data=" + photo_data + ", id=" + id + ", bgno=" + bgno
				+ ", pno=" + pno + "]";
	}		
}
