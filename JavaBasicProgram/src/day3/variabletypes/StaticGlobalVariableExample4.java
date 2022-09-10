package day3.variabletypes;

public class StaticGlobalVariableExample4 {
   //static global variable
	static int age=25;
	static boolean res;
	static char grade='B';
	static float roi;
	public static void main(String[] args) {
    System.out.println("Program Start");
    System.out.println("value of age is:"+StaticGlobalVariableExample4.age);
    System.out.println("default value of res: "+StaticGlobalVariableExample4.res);
    System.out.println(" value of grade is:"+StaticGlobalVariableExample4.grade);
    System.out.println("default value of roi:"+StaticGlobalVariableExample4.roi);
    System.out.println("******************************************************");
    //initialization of static global variable
    age=35;
    res=true;
    grade='A';
    roi=6.5f;
    System.out.println("updated value of age is:"+StaticGlobalVariableExample4.age);
    System.out.println("updated value of res is:"+StaticGlobalVariableExample4.res);
    System.out.println("updated value of grade is:"+StaticGlobalVariableExample4.grade);
    System.out.println("updated value of roi is:"+StaticGlobalVariableExample4.roi);
    System.out.println("Program Ends");
    
    

	}

}
