class Point {
    private int x;
    private int y;

    public int getX(){
        return x;
    }
    
    public void setX(int xCoord) {
        x = xCoord;     
    }

    public int getY(){
        return y;
    }
    
    public void setY(int yCoord) {

        y = yCoord;  
    }   
}

class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(100);
        p1.setY(200);
        
        Point p2 = new Point();
        p2.setX(100);
        p2.setY(300);

        
        System.out.println("첫번째 좌표 x 위치: " + p1.getX() + " y 위치: " + p1.getY());
        System.out.println("두번째 좌표 y 위치: " + p2.getX() + " y 위치: " + p2.getY());
    }
}