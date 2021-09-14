package prometheus;

public class Point {
	private int x;
	private int y;
	private int color = 10;
	public void draw() {
		//some theoretical code
		//color
	}
	
	public Point(int c) { //Constructor
		color = c;
	}
	
	public Point() {
		
	}
	
	public void draw(int x, int y) {
		//some theoretical code
	}
	public void draw(long x, long y) { // Don't use the same methods with different types
		//some theoretical code
	}
	
	public void test() {
		draw(1L, 2L);
	}
	
//	
//	public void draw() {
//		//some theoretical code
//		// Color
//	}
	
	
	public int getColor() {
		return color;
	}
	
}
