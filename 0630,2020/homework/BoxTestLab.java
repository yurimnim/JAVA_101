class Box {
    private int width;
    private int height;
    private int length;
    
    @Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", length=" + length + "]";
	}	
    
    public void setWidth(int w) {
        width = w; 
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int h) {
        height = h; 
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int l) {
        length = l; 
    }

    public int getLength() {
        return length;
    }
    
    //method 
    public int getVolume() {
        return width * height * length;
    }
}

class BoxTestLab {
    public static void main(String[] args) {
        Box box1 = new Box();

        box1.setWidth(100);
        box1.setLength(100);
        box1.setHeight(100);
        System.out.println(box1.getVolume());  //1000000
        System.out.println(box1);  //Box [width=100, height=100, length=100]

        Box box2 = new Box();

        box2.setWidth(200);
        box2.setLength(200);
        box2.setHeight(200);

        box1 = box2;
        System.out.println(box1); //Box [width=200, height=200, length=200] 
        //참조변수 라서 값을 공유 
        
    }
}