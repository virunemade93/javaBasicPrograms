package day19Blocks;

public class Blocks7 {



	static int age=25;
	static double salary=15000.57;

	/*static block or SIB*/

	 


		/*non-static block or IIB*/
		{
			salary=45000.32;
		}
		public static void main(String[] args) {

			System.out.println("main() Starts..");

			System.out.println("age:"+Blocks7.age);

			System.out.println("-----------------------------------");

			Blocks7 b1=new Blocks7();

			System.out.println("salary:"+b1.salary);

			System.out.println("main()ends..");


		}

	}
