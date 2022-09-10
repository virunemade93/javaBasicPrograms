package day7.methods;

public class MethodEx1 {
	static int age;
	static double salary;
	public static int test1() {
		System.out.println("Test Method 1");
		int pin= 425505;
		return pin;
	}
	static void test2() {
		System.out.println("Test Method 2");
	}
	static double test3(boolean b1) {
		System.out.println("Test Method 3");
		return 19.45;
	}
	
	
	public static void main(String[] args) {
		test1();
		test2();
		test3(true);
	}

}
