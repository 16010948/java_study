package _package;

class Point{
	int x=0,y=0;
	
	public Point() {}
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void move(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")의 점";
	}
}

class PositivePoint extends Point{
	int x=0,y=0;
	
	public PositivePoint() {}

	public PositivePoint(int x,int y) {
		super(x, y);
		if(x<0 || y<0) super.move(0,0);
	}
	
	void move(int x,int y) {
		if(x>=0 && y>=0)
			super.move(x,y);
	}
	
	public String toString() {
		return super.toString();
	}
	
}

public class Q5_0212 {

	public static void main(String[] args) {
	      PositivePoint p = new PositivePoint();
	      p.move(10,10);
	      System.out.println(p.toString() + "입니다.");
	      
	      p.move(-5,5);
	      System.out.println(p.toString() + "입니다.");
	      
	      PositivePoint p2 = new PositivePoint(-10,-10);
	      System.out.println(p2.toString() + "입니다.");

	   }

}
