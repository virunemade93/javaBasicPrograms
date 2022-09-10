package day7.methods;

class call { 
	public static void main(String[]args) {
		System.out.println("Hello,I am call class...");
		int a=10 ,b=20;
		System.out.println((a==b));
	}
}
public class NSMethod_WithReturnType {
	
	double x=10 , y=20 , z=30;//NonStatic global variable
	//methodtype:nonstatic
	boolean checkSameOrNot(int a,int b) {
		boolean res=(a==b);
		return res;
	}
	//method type: static
	static void display() {
		NSMethod_WithReturnType m2 = new NSMethod_WithReturnType();
		System.out.println("Input the first number:"+m2.x);
		System.out.println("Input the second number:"+m2.y);
		System.out.println("Input the third number:"+m2.z);
	}
	public static void main(String[]args) {
		System.out.println("I am method5 class.....");
		NSMethod_WithReturnType m1 = new NSMethod_WithReturnType();
		System.out.println("Input the first number:"+m1.x);
		System.out.println("Input the second number:"+m1.y);
		System.out.println("Input the third number:"+m1.z);
		m1.average(m1.x,m1.y,m1.z);
		// or
		//m1.average(10,20,30);
		boolean res=m1.checkSameOrNot(10,20);
		display();
	}
	//method type: non static
	public void average(double p,double q,double r) //p=10,q=20,r=30
//p=m1,x=10,q=m1,y=20,r=m1,z=30
	{
		double res=(p+q+r)/3;
		System.out.println("The average value is"+res);
	}

}
