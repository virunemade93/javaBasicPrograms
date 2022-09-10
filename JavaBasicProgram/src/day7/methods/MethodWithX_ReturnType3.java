package day7.methods;

public class MethodWithX_ReturnType3 {
       static double x=10 , y= 20 ,z=30;
       
       public static void main(String[]args)  {
    	   System.out.println("Input the first number:"+x);
    	   System.out.println("Input the second number:"+y);
    	   System.out.println("The average value is:"+average(z,y,x));
    	   
    	   System.out.println("The average value is:"+average(25,65,80));
    	   System.out.println("The average value is:"+average(20,30,50));
    	   System.out.println("The average value is:"+average(50,10,30));
       }
       
       public static double average(double p,double q,double r) {
    	   return (p+q+r)/3;
       }
}
