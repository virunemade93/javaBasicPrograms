package day7.methods;

public class TotalRecallConcepts {
       //global variables----->static and non-static
	     static int age1;
	     static double salary1=2536.0326;
	     int age2; 
	     double salary2=568.898;
	     //method---->static and non-static method
	     void display() {
	    	 System.out.println("Display()is started");
	    	 //access non static global variable directly from another non static method as per rule
	    	 System.out.println("NSGV age2:"+age2);
	    	 System.out.println("NSGV salary2:"+salary2);
	    	 System.out.println("Display()is Ends here");
	    	 
	     }
	     double getInterest(int amount,int numOfYrs,double irt) {
	    	 System.out.println("Principle Amount is:"+amount);
	    	 System.out.println("NOY for loan:"+numOfYrs);
	    	 System.out.println("ROI for your loan"+irt);
	    	 return 253.5465;
	     }
	     static void display2() {
	    	 System.out.println("Display2() is started");
	    	 //access static global variable directly from another static method as per rule 
	    	 System.out.println("SGV age1:"+age1);
	    	 System.out.println("SGV salary1:"+salary1);
	    	 System.out.println("Display2()is End here");
	    	 
	     }
	     static double getInterest2(int amount,int numOfYrs,double irt) {
	    	 System.out.println("Principle Amount is:"+amount);
	    	 System.out.println("NOY for loan:"+numOfYrs);
	    	 System.out.println("ROI for your loan:"+irt);
	    	 double interest=(amount*numOfYrs*irt)/100;
	    	 return interest;
	     }
	public static void main(String[] args) {
		//local variable
		int empId=1505;
		System.out.println("Local variable empId:"+empId);
		System.out.println("*******Non static members************");
		
		//access non-static members---->variable & methods
		TotalRecallConcepts t1=new TotalRecallConcepts();
		System.out.println("NSGV age2:"+t1.age2);
		System.out.println("NSGV salary2:"+t1.salary2);
		t1.display();
		//you will be able to execute method body but won't get its return value
		t1.getInterest(55000, 4, 6.5);
		//you will be able to execute method body and also able to print its return value in the console
		System.out.println("Interest is:"+t1.getInterest(55000,4,6.5));
		//you will be able to execute method body and store its return value for further action
		double r=t1.getInterest(55000,4,6.5);
		System.out.println("Interest amount is:"+r);
		System.out.println("************static members**********");
		//access static members--->variable & methods
		System.out.println("Accessing SGV age1 directly:"+age1);
		System.out.println("Accessing SGV age1 using standard:"+TotalRecallConcepts.salary1);
		display2();//or TotalRecallConcept.display2();
		//we will be able to execute method body but we won't get the return value
		getInterest2(55000,2,5.5);
		//you will be able to execute method body as well as you will able to print its return value
		System.out.println("Interest amount is:"+getInterest2(55000,2,5.5));
		//you will be able to execute method body as well as we can store return value in a variable for future actions
		double res=getInterest2(55000,2,5.5);
		System.out.println("Interest amount is:"+res);
	}
	
	
	
		
		

	}


