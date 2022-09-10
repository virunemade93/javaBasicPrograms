package day7.thisKeyword;

class Student1 {
	//Global var
	int rollno;
	float fee;
	Student1(int rollno,float fee) {
	
System.out.println("local rollno:"+rollno);

System.out.println("local fee:"+fee);

System.out.println("initial global rollno:"+this.rollno);

System.out.println("initialglobal fee:"+this.fee);

           //Global var=Local var;
             this.rollno=rollno;
             
             this.fee=fee;
             
System.out.println("after update,global rollno :"+this.rollno);

System.out.println("after update,initialglobal fee:"+this.fee);
	}
	void display() {
		
System.out.println(rollno+" "+fee);
	}
}

class ThisKeyword11 {

	public static void main(String[] args) {
	
System.out.println("********with s1 referance********");

      Student1 s1 = new Student1(111,5000f);
      
        s1.display();
        
 System.out.println("**********with s2 referance**********");
 
       Student1 s2 = new Student1(112,6000f);
       
           s2.display();

	}

}
