package com.bit.exam01;

public class Magazine extends Book{
	protected int day;
		
	public Magazine(String bName, int page, String mname, int day) {
		super(bName, page, mname);
		this.day = day;
	}

	public Magazine(String bName, int page, String mname) {
		super(bName, page, mname);
	}

    public Magazine() {
    	super("��", 400, "�߽¿�");
    	this.day = 30;
    }

	public void setDay(int day) {
		this.day = day;
	}
	
	public void printMagzine() {
		System.out.println(bName+ "," +  page + "p, " + Mname + "��, " + day + "�� �Ⱓ");
	}
	
}
