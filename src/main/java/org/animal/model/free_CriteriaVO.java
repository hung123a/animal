package org.animal.model;

public class free_CriteriaVO {
	private int pageNum; // 페이지번호
	private int amount; // 한 페이지당 게시물 갯수
	private String fkeyword; // 키워드를 통해 검색
	private String ftype; // 키워드 기준
	private int bgno; // 페이지 분류

	// 생성자
	public free_CriteriaVO() {
		this(1,10);
	}

	public free_CriteriaVO(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBgno() {
		return bgno;
	}

	public void setBgno(int bgno) {
		this.bgno = bgno;
	}

	public String getFkeyword() {
		return fkeyword;
	}
	public void setFkeyword(String fkeyword) {
		this.fkeyword = fkeyword;
	}
	@Override
	public String toString() {
		return "free_CriteriaVO [pageNum=" + pageNum + ", amount=" + amount + ", fkeyword=" + fkeyword + ", ftype="
				+ ftype + ", bgno=" + bgno + "]";
	}

}
