package day7.methods;

public class ArithmaticOperation {
	public int addition(int a , int b) {
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		ArithmaticOperation obj = new ArithmaticOperation();
		
		int sum = obj.addition(10, 20);
		System.out.println("sum = "+sum);

	}

}
