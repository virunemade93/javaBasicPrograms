package day7.methods;

public class MethodSyntaxExample {
    //static global variables
	static int age;
	static double salary;
	//static method with return value no argument
	public static int test1() {
		System.out.println("I am test1 method.");
      //logic
//      int pin=201201;
//      return pin;
		return 201201;
	}
	//static method without return value no argument
	static void test2() {
		System.out.println("I am test2 method");
		//return;this will be return by java complier at compile
	}
	//static method with return value along with argument
	static double test3(boolean b1) {
		System.out.println("");
		return 15.36;
	}
	//static method without return value along with argument
	static private void test4(float f) {
		System.out.println("");
	}
	public static void main(String[] args) {
		test1();
		test2();
		test3(true);
		test4(5);
		

	}

}
