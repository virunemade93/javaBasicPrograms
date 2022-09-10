package day10.constructor;
class C {
	double i;
	
	C(double j) {
		System.out.println("Running class C constructor..");
		i=j;
	}
}

public class Cons6 {

	public static void main(String[] args) {
		System.out.println("Main() of Class Cons5 is started...");
		C b1= new C(10.76);
		System.out.println("Class C global variable i="+b1.i);
		b1.i=35.65;
		System.out.println("Class C global variable i="+b1.i);//35.65
		System.out.println("============================================");
		C b2=new C(45.32);
		System.out.println("Class C global variable i="+b2.i);
		System.out.println("Main() of Class Cons5 is end here...");
		

	}

}
