package day10.constructor;

public class Cons0 {
	int age=25;
	void display() {
		System.out.println("Hi,I am display method");
	}

	public static void main(String[] args) {
		
		Cons0 c1=new Cons0();
		System.out.println(c1.age);
		c1.display();

	}

}
