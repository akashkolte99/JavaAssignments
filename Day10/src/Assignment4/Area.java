package Assignment4;

public class Area extends Shapes {

	@Override
	public int rectangleArea(int length, int breadth) {
		int area = length*breadth;
		return area;
	}

	@Override
	public int squareArea(int side) {
		int area = side*side;
		return area;
	}

	@Override
	public int circleArea(int radius) {
		double pi = 3.14;
		double a = pi*(radius * radius);
		a=Math.round(a);
		int x = (int) a;
		return x;
	}
	
	

}
