package org.animal.model;

public class tendinousVO {
	private int tno; // 건의게시판 번호
	private String tendinous_title; // 건의게시판 제목
	private String tendinous_cont; // 건의게시판 내용
	private int tendinous_cnt; // 건의게시판 조회수
	private String tendinous_data; // 건의게시판 등록 일자
	private String id; // 회원테이블과 조인을 위한 아이디
	private int type;

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTendinous_title() {
		return tendinous_title;
	}

	public void setTendinous_title(String tendinous_title) {
		this.tendinous_title = tendinous_title;
	}

	public String getTendinous_cont() {
		return tendinous_cont;
	}

	public void setTendinous_cont(String tendinous_cont) {
		this.tendinous_cont = tendinous_cont;
	}

	public int getTendinous_cnt() {
		return tendinous_cnt;
	}

	public void setTendinous_cnt(int tendinous_cnt) {
		this.tendinous_cnt = tendinous_cnt;
	}

	public String getTendinous_data() {
		return tendinous_data;
	}

	public void setTendinous_data(String tendinous_data) {
		this.tendinous_data = tendinous_data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "tendinousVO [tno=" + tno + ", tendinous_title=" + tendinous_title + ", tendinous_cont=" + tendinous_cont
				+ ", tendinous_cnt=" + tendinous_cnt + ", tendinous_data=" + tendinous_data + ", id=" + id + ", type="
				+ type + "]";
	} // 페이지 분류를 위한 컬럼

}
