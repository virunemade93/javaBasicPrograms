package day7.methods;

public class MethodEx2 {
	int age ;
	public void display() {
		System.out.println("I am display method of class MethodEx2");
	}
	public void display(int a) {
		age =a;
		System.out.println("I am display method");
	}
	public static void main(String[] args) {
		MethodEx2 obj = new MethodEx2();
	//	obj.display();
		obj.display(28);

	}

}
