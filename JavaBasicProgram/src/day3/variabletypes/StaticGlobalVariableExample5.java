package day3.variabletypes;

public class StaticGlobalVariableExample5 {
    //static global variables
	static int num1,num2=25,res;
	public static void main(String[] args) {
     System.out.println("Program Starts");
     System.out.println("Number 1 is:"+num1);
     System.out.println("Number 2 is"+num2);
     res=num1+num2;
     System.out.println("Result is:"+res);
     System.out.println("**************");
     num1=75;
     System.out.println("updated Number 1 is:"+num1);
     System.out.println("Number 2 is:"+num2);
     res=num1+num2;
     System.out.println("updated result is:"+res);
     System.out.println("*************************");
     num1=85;
     num2=65;
     System.out.println("updated Number 1 is:"+num1);
     System.out.println("updated Number 2 is:"+num2);
     res=num1-num2;
     System.out.println("updated Result is:"+res);
     System.out.println("Program Ends");

	}

}
