package week2.day3;
 //Method Overload
public class Calculator {

	public void add(int a,int b) {
		int c= a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c) {
		int d= a+b+c;
		System.out.println(d);
	}
	public void Mul(double a,double b) {
		double c= a*b;
		System.out.println(c);
	}
	public void Mul(float a,float b) {
		float c= a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator addition = new Calculator();
		addition.add(2, 5);
		addition.add(2, 2, 3);
		addition.Mul(6, 6);
		addition.Mul(1.3, 2.3);

	}

}
