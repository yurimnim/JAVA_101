class Rectangle {
	private double width;
	private double length;
	
	public double calcArea() {
		return width * length; 
	}

	//setter ������
	public void setWidth(double w) {
		width = w;
	}

	public void setLength(double cm) {
		length = cm;
	}
	
 //getter �������� ������
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

		System.out.println("����:: " +  r.getWidth());
		System.out.println("����:: " +  r.getLength());
		System.out.println("����:: " +  r.calcArea());	
	}
}
