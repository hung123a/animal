package org.animal.model;

public class memberVO {
	private String id; // 아이디
	private String password; // 비밀번호
	private String name; // 이름
	private String phone; // 전화번호
	private String email; // 이메일
	private String member_data; // 회원가입 일자
	private String rating; // 일반인과 관리자 구분
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	public String getMember_data() {
		return member_data;
	}
	public void setMember_data(String member_data) {
		this.member_data = member_data;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "memberVO [id=" + id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", member_data=" + member_data + ", rating=" + rating +"]";
	}
	
	
}
