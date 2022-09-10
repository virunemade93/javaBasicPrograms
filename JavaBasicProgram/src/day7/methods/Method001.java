package day7.methods;

public class Method001 {
	
	/*
	 * method type:static
	 * access modifier:public
	 * non access modifier:static
	 * return type:int
	 * method name:addnumber
	 * argument/parameter:int,int
	 * return value:result
	 */
	public static int addNumber(int num1,int num2) //int num1=10;int  num2=20;
	{
		System.out.println("Number 1 is:"+num1);
		System.out.println("Number 2 is:"+num2);
		int result=num1+num2;
		return result;
	}
	
	public static void main(String[]args) {
		//using below method call,you want be able to get method return value
		addNumber(10,20);
		//using below method call,you will be able to print the return value of method directly in the consol
		System.out.println("Result of two number addition:"+addNumber(10,20));
		//using below method call,you can store the method return value into the another variable and use it later based on your requirement
		int res=addNumber(10,20);
		int finalValue=res*100;
		System.out.println("Final result:"+finalValue);
		//using below method call,you will be able to print the return value of the method
		System.out.println("Result of two number addition:"+addNumber(55,25));
		//using below method call ,you will be able to print the return value of the method
		
		System.out.println("Result of two number addition:"+addNumber(24,36));
		//using below method call,you will be able to print the return value of the method
		System.out.println("Result of two number addition:"+addNumber(77,33));
	}
}
