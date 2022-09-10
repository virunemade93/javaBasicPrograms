package day10.constructor;

public class ConOverloading1 {
	 ConOverloading1(){
		 System.out.println("zero parameterized constructor");
		 System.out.println("Having no parameters");
	 }
	 ConOverloading1(int a){
		 System.out.println("Parameterized constructor");
		 System.out.println("Having int parameter");
	 }
	 ConOverloading1(double b){
		 System.out.println("Parameterized constructor");
		 System.out.println("Having double parameters");
	 }
	 ConOverloading1(int a ,double b, int c){
		 System.out.println("Parameterized constructor");
		 System.out.println("Having int double int parameters");
	 }
	 ConOverloading1(double a ,int b, int c){
		 System.out.println("Parameterized constructor");
		 System.out.println("Having double int int parameters");
	 }


	public static void main(String[] args) {
		ConOverloading1 pc5 = new ConOverloading1(); 
		ConOverloading1 pc1 = new ConOverloading1(19); 
		ConOverloading1 pc2 = new ConOverloading1(14.87); 
		ConOverloading1 pc3 = new ConOverloading1(12 , 15.75 ,18);
		ConOverloading1 pc4 = new ConOverloading1(16.75,76,98); 
	}

}
