package day7.methods;

public class MethodEx3 {
	public void addition() {
		int a = 10, b = 20;
		int sum = a+b;
		System.out.println("Sum = "+sum);
	}
	public byte addition1() {
		byte b1 = 20 , b2 = 20;
		byte sum1 = (byte) (b1+b2);
		System.out.println("sum1 = "+sum1);
		return sum1;
	}
	public double addition2() {
		double f1 =  18.4;
		double f2 = 19.4;
		double sum2 = (f1+f2);
		System.out.println("Sum2 = "+sum2);
		return sum2;
	}

	public static void main(String[] args) {
		 MethodEx3 obj = new  MethodEx3();
		 obj.addition();
		 obj.addition1();
		 obj.addition2();
	}

}
