package org.animal.model;

public class informationVO {
	private int ino; // 동물 정보 번호
	private String main_img; // 메인 이미지
	private String sub_img; // 서브 이미지
	private String animal_name; // 동물 이름
	private String explanation;  // 설명
	private String  origin_title;  // 유래 제목
	private String  origin_cont;  // 유래 내용
	private String  place_title;  // 지리적 범위 제목
	private String	  place_cont;  // 지리적 범위 내용
	private String  habitat_title;  // 서식지 제목
	private String  habitat_cont;  // 서식지 내용
	private String  look_title;  // 생김새와 특징 제목
	private String  look_cont;  // 생김새와 특징 내용
	private String  growth_title;  // 성장과정 제목
	private String  growth_cont;  // 성장과정 내용
	private String  life_title;  // 수명 제목
	private String  life_cont;  // 수명 내용
	private String  habit_title;  // 행동 및 습성 제목
	private String  habit_cont;  // 행동 및 습성 내용
	private String  food_title;  // 먹이 제목
	private String  food_cont;  // 먹이 내용
	private String  enemy_title;  // 천적 제목
	private String  enemy_cont;  // 천적 내용
	private String  animal_data;  // 동물 정보 등록 일자
	private String  i_type; // 육해공 분류
	private String  id; // 회원테이블과 조인을 위한 아이디 (관리자)
	private String  type; // 페이지 분류
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
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getOrigin_title() {
		return origin_title;
	}
	public void setOrigin_title(String origin_title) {
		this.origin_title = origin_title;
	}
	public String getOrigin_cont() {
		return origin_cont;
	}
	public void setOrigin_cont(String origin_cont) {
		this.origin_cont = origin_cont;
	}
	public String getPlace_title() {
		return place_title;
	}
	public void setPlace_title(String place_title) {
		this.place_title = place_title;
	}
	public String getPlace_cont() {
		return place_cont;
	}
	public void setPlace_cont(String place_cont) {
		this.place_cont = place_cont;
	}
	public String getHabitat_title() {
		return habitat_title;
	}
	public void setHabitat_title(String habitat_title) {
		this.habitat_title = habitat_title;
	}
	public String getHabitat_cont() {
		return habitat_cont;
	}
	public void setHabitat_cont(String habitat_cont) {
		this.habitat_cont = habitat_cont;
	}
	public String getLook_title() {
		return look_title;
	}
	public void setLook_title(String look_title) {
		this.look_title = look_title;
	}
	public String getLook_cont() {
		return look_cont;
	}
	public void setLook_cont(String look_cont) {
		this.look_cont = look_cont;
	}
	public String getGrowth_title() {
		return growth_title;
	}
	public void setGrowth_title(String growth_title) {
		this.growth_title = growth_title;
	}
	public String getGrowth_cont() {
		return growth_cont;
	}
	public void setGrowth_cont(String growth_cont) {
		this.growth_cont = growth_cont;
	}
	public String getLife_title() {
		return life_title;
	}
	public void setLife_title(String life_title) {
		this.life_title = life_title;
	}
	public String getLife_cont() {
		return life_cont;
	}
	public void setLife_cont(String life_cont) {
		this.life_cont = life_cont;
	}
	public String getHabit_title() {
		return habit_title;
	}
	public void setHabit_title(String habit_title) {
		this.habit_title = habit_title;
	}
	public String getHabit_cont() {
		return habit_cont;
	}
	public void setHabit_cont(String habit_cont) {
		this.habit_cont = habit_cont;
	}
	public String getFood_title() {
		return food_title;
	}
	public void setFood_title(String food_title) {
		this.food_title = food_title;
	}
	public String getFood_cont() {
		return food_cont;
	}
	public void setFood_cont(String food_cont) {
		this.food_cont = food_cont;
	}
	public String getEnemy_title() {
		return enemy_title;
	}
	public void setEnemy_title(String enemy_title) {
		this.enemy_title = enemy_title;
	}
	public String getEnemy_cont() {
		return enemy_cont;
	}
	public void setEnemy_cont(String enemy_cont) {
		this.enemy_cont = enemy_cont;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "informationVO [ino=" + ino + ", main_img=" + main_img + ", sub_img=" + sub_img + ", animal_name="
				+ animal_name + ", explanation=" + explanation + ", origin_title=" + origin_title + ", origin_cont="
				+ origin_cont + ", place_title=" + place_title + ", place_cont=" + place_cont + ", habitat_title="
				+ habitat_title + ", habitat_cont=" + habitat_cont + ", look_title=" + look_title + ", look_cont="
				+ look_cont + ", growth_title=" + growth_title + ", growth_cont=" + growth_cont + ", life_title="
				+ life_title + ", life_cont=" + life_cont + ", habit_title=" + habit_title + ", habit_cont="
				+ habit_cont + ", food_title=" + food_title + ", food_cont=" + food_cont + ", enemy_title="
				+ enemy_title + ", enemy_cont=" + enemy_cont + ", animal_data=" + animal_data + ", i_type=" + i_type
				+ ", id=" + id + ", type=" + type + "]";
	}
	
}
