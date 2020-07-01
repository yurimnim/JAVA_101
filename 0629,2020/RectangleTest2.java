class Rectangle {
	private double width;
	private double length;

	//생성자 중복정의 Constructor Overloading
	public Rectangle () {
		width = 40;
		length = 15.5;
	}

	public Rectangle (double e, double l) {
		width = e;
		length = l;
	}

	public Rectangle (double d) {
		width = 3.5;
		length = d;
	}

	//method
	public double calcArea() {
		return width * length; 
	}

	//setter 설정자
	public void setWidth(double w) {
		width = w;
	}

	public void setLength(double cm) {
		length = cm;
	}
	
 //getter 설정값을 가져옴
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
}

class RectangleTest2 {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Rectangle e = new Rectangle(25,20);	
		Rectangle c = new Rectangle(222);	

		System.out.println(r.calcArea());
		System.out.println(e.calcArea());
		System.out.println(c.calcArea());
	}
}
