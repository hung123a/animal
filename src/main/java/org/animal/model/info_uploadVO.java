package org.animal.model;

public class info_uploadVO {
	private String info_uid; // 사진 파일정보
	private String info_name; // 파일 이름
	private boolean info_image; // 파일 설명 사진
	private String info_upload; // 파일 저장되어 있는 경로
	private int ino; // 사진 번호
	public String getInfo_uid() {
		return info_uid;
	}
	public void setInfo_uid(String info_uid) {
		this.info_uid = info_uid;
	}
	public String getInfo_name() {
		return info_name;
	}
	public void setInfo_name(String info_name) {
		this.info_name = info_name;
	}
	public boolean getInfo_image() {
		return info_image;
	}
	public void setInfo_image(boolean b) {
		this.info_image = b;
	}
	public String getInfo_upload() {
		return info_upload;
	}
	public void setInfo_upload(String info_upload) {
		this.info_upload = info_upload;
	}
	public int getIno() {
		return ino;
	}
	public void setIno(int ino) {
		this.ino = ino;
	}
	@Override
	public String toString() {
		return "info_uploadVO [info_uid=" + info_uid + ", info_name=" + info_name + ", info_image=" + info_image
				+ ", info_upload=" + info_upload + ", ino=" + ino + "]";
	}	
}
