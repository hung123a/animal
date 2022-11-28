package org.animal.model;

public class tend_CriteriaVO {
	private int pageNum; // 페이지번호
	private int amount; // 한 페이지당 게시물 갯수
	private String tkeyword; // 키워드를 통해 검색
	private String ttype; // 키워드 기준

	// 생성자
	public tend_CriteriaVO() {
		this(1,10);
	}

	public tend_CriteriaVO(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	public String getTkeyword() {
		return tkeyword;
	}

	public void setTkeyword(String tkeyword) {
		this.tkeyword = tkeyword;
	}

	@Override
	public String toString() {
		return "CriteriaVO [pageNum=" + pageNum + ", amount=" + amount + ", tkeyword=" + tkeyword + ", ttype=" + ttype
				+ "]";
	}

}
