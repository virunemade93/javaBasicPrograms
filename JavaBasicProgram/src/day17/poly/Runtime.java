package day17.poly;
class Animal {
	void eat() {
		
System.out.println("Animal Eat");
	}
}
class herbivores extends Animal {
	 void eat() {
		 
System.out.println("Herbivores Eat Plants");
	 }
}
class omnivores extends Animal{
	 void eat() {
		 
System.out.println("Omnivores Eat Plants and meat");
	 }
}
class carnivores extends Animal {
	 void eat() {
		 
System.out.println("Carnivores Eat meat");
	 }
}

public class Runtime {

	public static void main(String[] args) {
		
		Animal A=new Animal();
		A.eat();//Animal Eat
		Animal h=new herbivores();
		h.eat();//
		Animal o=new omnivores();//
		o.eat();
		Animal c=new carnivores();
		c.eat();
		

	}

}
