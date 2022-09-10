package day7.overloading;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("I am main(string[]args)");
		main(15);
}
	public static void main(int a) {
		System.out.println("I am main()");
	}

}
