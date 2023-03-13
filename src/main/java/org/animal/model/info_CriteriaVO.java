package org.animal.model;

public class info_CriteriaVO {
	private int pageNum; // 페이지번호
	private int amount; // 한 페이지당 게시물 갯수
	private String ikeyword; // 키워드를 통해 검색
	private String i_type; // 키워드 기준
	private String type;
	private int bgno; // 페이지 분류

	// 생성자
	public info_CriteriaVO() {
		this(1, 10);
	}

	public info_CriteriaVO(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getI_type() {
		return i_type;
	}

	public void setI_type(String i_type) {
		this.i_type = i_type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getIkeyword() {
		return ikeyword;
	}

	public void setIkeyword(String ikeyword) {
		this.ikeyword = ikeyword;
	}

	public int getBgno() {
		return bgno;
	}

	public void setBgno(int bgno) {
		this.bgno = bgno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "info_CriteriaVO [pageNum=" + pageNum + ", amount=" + amount + ", ikeyword=" + ikeyword + ", i_type="
				+ i_type + ", type=" + type + ", bgno=" + bgno + "]";
	}

}
