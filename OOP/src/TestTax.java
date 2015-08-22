
public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tax t = new Tax();
		NjTax t = new NjTax();
		
		t.grossIncome=40000;
		t.numberOfDependents=2;
		t.state="NJ";
		
		double yourTax = t.calcTax();
		
		System.out.println("Your tax is " + t.adjustForStudents(yourTax));
	}

}
