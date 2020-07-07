package com.bit.exam01;

public class Book {
	protected String bName;
	protected int page;
	protected String Mname;

	public Book(String bName, int page, String mname) {
	
		this.bName = bName;
		this.page = page;
		Mname = mname;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}
	
	
}
