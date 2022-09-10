package day7.thisKeyword;

class Test101 {
	
	  Test101() {
		  
System.out.println("hello zero");
	  }
	  Test101(double d) {
		  
System.out.println("hello double"+d);
	  }
}

 class ThisStatement0 {
	 public static void main(String args[]) {
		 
		 Test101 t1=new Test101();
		 
		 Test101 t2=new Test101(25.36);
		 
		 Test101 t3=new Test101(25);
	 }

}
