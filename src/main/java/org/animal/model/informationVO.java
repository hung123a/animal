package org.animal.model;

import java.util.ArrayList;

public class informationVO {
	private int ino; // 동물 정보 번호
	private String main_img; // 메인 이미지
	private String sub_img; // 서브 이미지
	private String animal_name; // 동물 이름
	private String habitat; // 서식지
	private String look; // 생김새와 특징
	private String life; // 수명 내용
	private String food; // 먹이 제목
	private String enemy; // 천적 내용
	private String animal_data; // 동물 정보 등록 일자
	private String i_type; // 육해공 분류
	private String id; // 회원테이블과 조인을 위한 아이디 (관리자)
	private String animal_date; // 동물 정보 등록 날짜
	private ArrayList<info_uploadVO> info; // 동물 소개 이미지 업로드 vo와 연결 
	private int bgno; // 페이지 분류
	public int getIno() {
		return ino;
	}
	public void setIno(int ino) {
		this.ino = ino;
	}
	public String getMain_img() {
		return main_img;
	}
	public void setMain_img(String main_img) {
		this.main_img = main_img;
	}
	public String getSub_img() {
		return sub_img;
	}
	public void setSub_img(String sub_img) {
		this.sub_img = sub_img;
	}
	public String getAnimal_name() {
		return animal_name;
	}
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getLook() {
		return look;
	}
	public void setLook(String look) {
		this.look = look;
	}
	public String getLife() {
		return life;
	}
	public void setLife(String life) {
		this.life = life;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getEnemy() {
		return enemy;
	}
	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}
	public String getAnimal_data() {
		return animal_data;
	}
	public void setAnimal_data(String animal_data) {
		this.animal_data = animal_data;
	}
	public String getI_type() {
		return i_type;
	}
	public void setI_type(String i_type) {
		this.i_type = i_type;
	}
	
	public String getAnimal_date() {
		return animal_date;
	}
	public void setAnimal_date(String animal_date) {
		this.animal_date = animal_date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<info_uploadVO> getInfo() {
		return info;
	}
	public void setInfo(ArrayList<info_uploadVO> info) {
		this.info = info;
	}
	
	public int getBgno() {
		return bgno;
	}
	public void setBgno(int bgno) {
		this.bgno = bgno;
	}
	@Override
	public String toString() {
		return "informationVO [ino=" + ino + ", main_img=" + main_img + ", sub_img=" + sub_img + ", animal_name="
				+ animal_name + ", habitat=" + habitat + ", look=" + look + ", life=" + life + ", food=" + food
				+ ", enemy=" + enemy + ", animal_data=" + animal_data + ", i_type=" + i_type + ", id=" + id
				+ ", animal_date=" + animal_date + ", info=" + info + ", bgno=" + bgno + "]";
	}

}
