package day11.inheritance;
//super class/parent class
class A1 {
	   static int a=10;
	   int b=20;
	   double c=13.45;
}
class B1 extends A1 {
	static int x=30;
	int y=40;
	double z=53.45;
}
class C1 extends B1{
	static int p=50;
	int q=60;
	double r=66.45;
}

public class Inheritance1 {

	public static void main(String[] args) {
		/************Access static member class A members********/
System.out.println("Class A1 static variable:"+A1.a);
         /***********Acess static member class B members*********/
System.out.println("Class B1 static variable:"+B1.x);
         /***********Access static member class C members*********/
System.out.println("Class C1 static variable:"+C1.p);
         /***********Access non-static member class A1,B1 & C1 members*******/
System.out.println("************************************************");

         C1 c1=new C1();//it will have all non-static members of class A1,B1 & C1--->b,c,y,z,q,r
         
 System.out.println("With Class C refer:"+c1.b);
 System.out.println("With class C refer:"+c1.c);
 System.out.println("With class C refer:"+c1.q);
 System.out.println("With class C refer:"+c1.r);
 System.out.println("With class C refer:"+c1.y);
 System.out.println("With class C refer:"+c1.z);
 
 System.out.println("*********************************************");
 
         B1 b1=new B1();//it will have all the non-static members of class A1,B1--->b,c,y,z
         
 System.out.println("With Class B refer:"+b1.b);
 System.out.println("With Class B refer:"+b1.c);
 System.out.println("With Class B refer:"+b1.y);
 System.out.println("With Clas B refer:"+b1.z);
 
 
		

	}

}
