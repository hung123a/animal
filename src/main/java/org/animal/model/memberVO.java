package org.animal.model;

public class memberVO {
	private String id; // 아이디
	private String pwd; // 비밀번호
	private String name; // 이름
	private String phone; // 전화번호
	private String bth; // 생년월일
	private String gender; // 성별
	private String member_data; // 회원가입 일자
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBth() {
		return bth;
	}
	public void setBth(String bth) {
		this.bth = bth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMember_data() {
		return member_data;
	}
	public void setMember_data(String member_data) {
		this.member_data = member_data;
	}
	@Override
	public String toString() {
		return "memberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", bth=" + bth
				+ ", gender=" + gender + ", member_data=" + member_data + "]";
	}
	
}
