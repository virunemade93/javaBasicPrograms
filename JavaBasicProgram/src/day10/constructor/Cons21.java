package day10.constructor;

public class Cons21 {
	
	int age;
	double salary;
	
	Cons21() {
		
		System.out.println("***********User Defined Zero-Param Constructor, start from here*******");
		 age=25;
		 salary=32506.56;
				
	System.out.println("*******User Defined Zero-Param Constructor,ends here********");
	}

	public static void main(String[] args) {
		Cons21 c1=new Cons21();
		System.out.println(c1.age);//25
		System.out.println(c1.salary);//

	}

}
