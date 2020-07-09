package com.bit.exam01;

interface Filter {
	public boolean isItOK(Object obj);
}

class Rectangle implements Filter, Comparable {
	double width;
	double height;
	double area;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		calcArea();
	}
	public void calcArea() {
		area = width * height;
	}
		
	@Override //�ڹٿ��� �̹� ��������� �������̵� 
	public int compareTo(Object o) {
		Rectangle r = (Rectangle)o;
		int re = 0;
		if(area > r.area) {
			re = 1;
		}else if (area < r.area) {
			re = -1;
		}
		return re;
	}
	
	@Override
	public boolean isItOK(Object obj) {
		Rectangle r = (Rectangle)obj;
		boolean re = false;
		if(r.width == r.height) {
			re = true;
		}	
		return re;
	}
}

public class Programming04 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,4);
		Rectangle r2 = new Rectangle(2,8);
		
		if(r1.compareTo(r2)==0) {
			System.out.println("Same");
		}else if (r1.compareTo(r2) > 0) {
			System.out.println("r1 is bigger");
		}else {
			System.out.println("r1 is smaller");
		}
		
		if(r1.isItOK(r1)) {
			System.out.println("r1 ���簢��");
		}else {
			System.out.println("r1 no ���簢��");
		}
		
		if(r1.isItOK(r2)) {
			System.out.println("r2 ���簢��");
		}else {
			System.out.println("r2 no ���簢��");
		}
	}
}
