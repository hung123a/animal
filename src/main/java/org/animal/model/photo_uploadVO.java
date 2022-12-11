package org.animal.model;
public class photo_uploadVO {
	private String photo_uid; // 사진 파일정보
	private String photo_name; // 파일 이름
	private boolean photo_image; // 파일 설명 사진
	private String photo_upload; // 파일 저장되어 있는 경로
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
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	@Override
	public String toString() {
		return "photo_uploadVO [photo_uid=" + photo_uid + ", photo_name=" + photo_name + ", photo_image=" + photo_image
				+ ", photo_upload=" + photo_upload + ", pno=" + pno + "]";
	}
	
	
}
