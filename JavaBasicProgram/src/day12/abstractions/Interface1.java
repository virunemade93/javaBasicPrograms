package day12.abstractions;
interface i1 {
	//variable---->by default---->public static final
	//method----->by default----->public abstract
	//no complete methods/non-abstract
	//no constructor
}
//Interface declaration:by first user
interface Drawable {
	int salary=25000;//by default----->public static final int salary=25000;
	void draw();//by default----->public abstract void draw();
}
//implementation:by second user class Rectangle1 implements Drawable{
     public void draw();
     
 System.out.println("drawing rectangle");
      }
 }
class Circle implements Drawable {
	public void draw() {
		
System.out.println("drawing circle");
	}
}
//Using interface:by third user


 class Interface1 {

	public static void main(String[] args) {
	
System.out.println("Interface variable salary:"+Drawable.salary);

    Rectangle1 r1=new Rectangle1();
    r1.draw();//drawing rectangle
    Circle c1=new Circle();
    c1.draw();//drawing circle
    //In real scenario,object is provided by method e.g. getDrawable()
    Drawable d=new Circle();
    d.draw();//drawing circle

	}

}
