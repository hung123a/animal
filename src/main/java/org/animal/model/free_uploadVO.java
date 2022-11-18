package org.animal.model;

public class free_uploadVO {
	private String free_uid; // 사진 파일정보
	private String free_name; // 파일 이름
	private boolean free_image; // 파일 설명 사진
	private String free_upload; // 파일 저장되어 있는 경로
	private int fno; // 사진 번호
	public String getFree_uid() {
		return free_uid;
	}
	public void setFree_uid(String free_uid) {
		this.free_uid = free_uid;
	}
	public String getFree_name() {
		return free_name;
	}
	public void setFree_name(String free_name) {
		this.free_name = free_name;
	}
	public boolean getFree_image() {
		return free_image;
	}
	public void setFree_image(boolean b) {
		this.free_image = b;
	}
	public String getFree_upload() {
		return free_upload;
	}
	public void setFree_upload(String free_upload) {
		this.free_upload = free_upload;
	}
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	@Override
	public String toString() {
		return "free_uploadVO [free_uid=" + free_uid + ", free_name=" + free_name + ", free_image=" + free_image
				+ ", free_upload=" + free_upload + ", fno=" + fno + "]";
	}
	
}
