package com.bit.exam09;

import com.bit.exam08.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
		obj.setWidth(10);
		obj.setHeight(10);
		obj.setX(2);
		obj.setY(3);
		
	//	obj.x = 100;
		
		obj.print();
		System.out.println("사각형의 면적:" + obj.calcArea());
		obj.draw();
	}

}
