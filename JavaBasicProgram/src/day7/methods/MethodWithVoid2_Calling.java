package day7.methods;

public class MethodWithVoid2_Calling {
    static void display() {
    	System.out.println("I am display method");
    }
    
    static void print(char c1) {
    	System.out.println("I am print method and printing char as:"+c1);
    }
    
    static void call(int num) {
    	System.out.println("I am call method and calling number is:"+num);
    }
	public static void main(String[] args) {
		display();
		print('A');
		call(123);
		System.out.println("********passing parameter using variable****");
		int num=123;
		char c='A';
		print(c);
		call(num);
		

	}

}
