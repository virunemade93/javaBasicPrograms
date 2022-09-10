package day12.abstractions;
//Interface
interface Animal10 {
	int age=20;//by default public static final
	public void animalSound();//interface method (does not have a body)
	public void sleep();//interface method (does not have a body)
}
//Pig "implements"the Animal interface
class Pig7 implements Animal10 {
	public void animalSound() {
		//The body of animalSound() is provided here
		
System.out.println("The pig says:wee wee");
	}
	public void sleep() {
		//The body of sleep() is provided here
		
System.out.println("Zzz");
	}
}

 class Interface6 {

	public static void main(String[] args) {
		Pig7 myPig=new Pig7();//create a Pig object
		myPig.animalSound();
		myPig.sleep();
		
System.out.println(Animal10.age);
//Animal10.age=200

	}

}
