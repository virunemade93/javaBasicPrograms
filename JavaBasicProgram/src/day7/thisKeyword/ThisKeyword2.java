package day7.thisKeyword;

public class ThisKeyword2 {
	int x;
	//Constructor with a parameter
	public ThisKeyword2(int x) {
		this.x=x;
	}
	//call the constructor

	public static void main(String[] args) {
	  ThisKeyword2 myObj=new ThisKeyword2(5);
	  System.out.println("Value of x="+myObj.x);//

	}

}
