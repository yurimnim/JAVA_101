class Rectangle {
	private double width;
	private double length;
	
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

class RectangleTest {
	public static void main(String[] args) {
		Rectangle r;
		r = new Rectangle();
		
		r.setWidth(20);
		r.setLength(40);

		System.out.println("가로:: " +  r.getWidth());
		System.out.println("세로:: " +  r.getLength());
		System.out.println("면적:: " +  r.calcArea());	
	}
}
