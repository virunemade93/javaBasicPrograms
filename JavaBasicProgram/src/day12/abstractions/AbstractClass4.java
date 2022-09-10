package day12.abstractions;
abstract class RBIBank102 {
	final abstract double getRateOfInterestForHomeLoan();
	//abstract mean cant be overriden
	//final means cant be override
}
class SBI102 extends RBIBank{
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
 class AbstractClass4 {

	public static void main(String[] args) {
		

	}

}
