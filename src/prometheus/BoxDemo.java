package prometheus;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(10, 20, 40);
		Box b2 = new Box(50, 10, 20);
		Box b3 = new Box();
		
//		b1 = b2;
//		b1.print();
		
//		b1= null;
//		b1.print();
		
		b3.change(100, 56, 70);
		b1.print();
		b2.print();
		b3.print();
	}

}
