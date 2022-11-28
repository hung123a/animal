package org.animal.model;

public class photo_CriteriaVO {
	private int pageNum; // 페이지번호
	private int amount; // 한 페이지당 게시물 갯수
	private String pkeyword; // 키워드를 통해 검색
	private String ptype; // 키워드 기준

	// 생성자
	public photo_CriteriaVO() {
		this(1,10);
	}

	public photo_CriteriaVO(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	

	public String getType() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	public String getPkeyword() {
		return pkeyword;
	}

	public void setPkeyword(String pkeyword) {
		this.pkeyword = pkeyword;
	}

	@Override
	public String toString() {
		return "CriteriaVO [pageNum=" + pageNum + ", amount=" + amount + ", pkeyword=" + pkeyword + ", ptype=" + ptype
				+  "]";
	}

}
