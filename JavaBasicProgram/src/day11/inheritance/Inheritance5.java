package day11.inheritance;

class A2 {
	void msg() {
		
System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		
System.out.println("Welcome");
	}
}
class Inhetitance5 extends A2,B2{
	
	Inheritance5() {
		super();//confusion
	}

	public static void main(String[] args) {
		
		Inheritance5 obj=new Inheritance5();
		obj.msg();
		

	}

}
