class Box {
    private double width;
    private double height;
    private double length;
    private boolean empty;
    
    public Box(){
        width = 24;
        height = 26;
        length = 15;
        empty = false;
    }

    public Box(double w, double h) {
        length = 44;
        empty = true;
    }

    //getter
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public boolean getEmpty() {
        return empty;
    }

    //setter
    public void setHeight(double a) {
        a = height;
    }

    public void setWidth(double b) {
        b = width;
    }

    public void setLength(double c) {
        c = length;
    }

    public void setEmpty(boolean d) {
        d = empty;
    }

}

class BoxTest {
    public static void main(String[] args) {
        Box apple = new Box();
            if(apple.getEmpty()) {
                System.out.println("The box is filled.");
            } else {
                System.out.println("The box is empty.");
            }
    }
}