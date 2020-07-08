package com.bit.exam02;
import com.bit.exam01.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] arr = new Shape[3];
		arr[0] = new Cylinder(10, 10, 10, 50);
		arr[1] = new Rectangle(10, 100, 30, 40);
		arr[2] = new Cube(10, 200, 10, 10, 10);
		
		for(Shape s:arr) {
			if(s instanceof TwoDimenShape) {
				System.out.println("도형의 면적: "+ ((TwoDimenShape)s).getArea());
			} else {
				System.out.println("도형의 면적: "+ ((ThreeDimenShape)s).getVolume());
			}
			System.out.println(s.toString()); 
		}
				
//		Circle c = new Circle(10,10,5);
//		c.getArea();
//		System.out.println(c);
//		
//		Shape d = new Circle(10, 20, 5);
//			if (c instanceof TwoDimenShape) {
//				((TwoDimenShape)d).getArea(); // 후손변수에서 확장된 메소드 사용하기 위해서 타입캐스트 해줘야함
//			}
//			
	}
}
