package day10.constructor;

public class StaticVariable {
	
	static int age=25;
	int empId=101;
	void display() {
		int empId=505;
		System.out.println("empId:"+empId);//505
		System.out.println("NSGV empId:"+this.empId);//101
	}

	public static void main(String[] args) {
		
		int age=10;
		System.out.println("age:"+age);
		System.out.println("SGV age:"+StaticVariable.age);
		StaticVariable s1=new StaticVariable();
		s1.display();
		System.out.println(s1.empId);

	}

}
