package org.animal.model;

public class photo_pageVO {
	private int startPage; // 시작 번호
	private int endPage; // 끝번호
	private boolean prev; // 이전버튼
	private boolean next; // 다음버튼
	private int photo_total; // board테이블의 전체건수를 저장
	// pcriteriaVO 포함
	private photo_CriteriaVO pcri;

	// 생성자(매개변수가 2개인 생성자) 선언
	public photo_pageVO(photo_CriteriaVO pcri, int photo_total) {
		this.pcri = pcri;
		this.photo_total = photo_total;
		// 시작번호, 끝번호, 이전버튼, 다음버튼 계산
		// 끝번호 식 : 현재 페이지 / 10(올림) * 10
		this.endPage = (int) (Math.ceil(pcri.getPageNum() / 10.0)) * 10;
		// 시작번호 식 : 끝번호 - 9 ( 끝번호가 10 시작번호 1 )
		this.startPage = this.endPage - 9;

		// 제일 마지막 페이지번호는 전체건수를 고려해야함.
		// 제일 마지막 끝번호 식 : 전체건수(올림)/페이지당 게시물 갯수
		// 123*1.0 = 123.0 /10
		// 12.3(올림) > 13
		int realEnd = (int) (Math.ceil((photo_total * 1.0) / pcri.getAmount()));

		// 13(realEnd) < 20(endpage)면
		// realEnd가 적용되게 함.
		if (realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		// startpage가 1보다 크면 이전버튼 활성화
		this.prev = this.startPage > 1;

		// endpage가 realEnd 보다 작으면
		this.next = this.endPage < realEnd;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public photo_CriteriaVO getpcri() {
		return pcri;
	}

	public void setpcri(photo_CriteriaVO pcri) {
		this.pcri = pcri;
	}

	public int getPhoto_total() {
		return photo_total;
	}

	public void setPhoto_total(int photo_total) {
		this.photo_total = photo_total;
	}

	@Override
	public String toString() {

		return "pageVO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", pcri=" + pcri + ", photo_total=" + photo_total + "]";
	}
}
