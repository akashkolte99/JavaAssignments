package Ass1;

public class Zimpl implements Z {

	@Override
	public void fun1x() {
		// TODO Auto-generated method stub
		System.out.println("X Inside Zimpl from fun1x");

	}

	@Override
	public void fun1y() {
		// TODO Auto-generated method stub
		System.out.println("Y Inside Zimpl from fun1y");

	}

	@Override
	public void fun1z() {
		// TODO Auto-generated method stub
		System.out.println("Z Inside Zimpl from fun1z");

	}
	
	@Override
	public void fun2x() {
		System.out.println("X Inside Zimpl from fun2x");
	}

	public static void main(String[] args) {
		X x1 = new Zimpl();
		
		x1.fun1x();
		x1.fun2x();
		X.fun3x();
		System.out.println("====================");	
		Y y1 = new Zimpl();
		y1.fun1y();
		y1.fun2y();
		Y.fun3y();
		System.out.println("====================");
		System.out.println("==== direct reference from Z ====");
		Z z1 =new Zimpl();
		z1.fun1x();
		z1.fun1y();
		z1.fun2x();
		z1.fun2y();
		
		System.out.println("========");
		z1.fun1z();
	}
}
