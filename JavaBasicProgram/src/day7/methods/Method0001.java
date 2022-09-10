package day7.methods;

public class Method0001 {
	/*
	 * method type:static
	 * access modifier:public
	 * non-accessmodifier:static
	 * return type:int
	 * method name:addnumber
	 * argument/parameter:int,int
	 * return value:result
	 */
	public static void addNumber2(int num1,int num2){//int num1=10;int num2=20;
		System.out.println("Number is : "+num1);
		System.out.println("Number is : "+num2);
		int result = num1 + num2;
		System.out.println("Result is :"+result);
	}
	public static int addNumber(int num1,int num2){//int num1=10;int num2=20;
		System.out.println("Number is : "+num1);
		System.out.println("Number is : "+num2);
		int result = num1 + num2;
		System.out.println("Result is :"+result);
		return result;
	}



public static void main(String[] args) {
	 //Method0001 obj = new Method0001();
	
	addNumber2(10, 20);
	addNumber(40 ,50);
	
}
}