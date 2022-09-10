package day12.abstractions;
interface Drawable2 {
	void draw();//default public abstract
	//below default keyword can be used only inside interface
	default void msg() {
		
System.out.println("default method");
	}
	static int cube(int x) {
		return x*x*x;
	}
//	default static int print() {//default static cant be written together
	System.out.println("default static method of interface");/}
System.out.println("private method");
}
class Rectangle2 implements Drawable2
{
	public void draw() {
		
System.out.println("Drawing rectangle")
	}
}

public class InterfaceDefaultStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
