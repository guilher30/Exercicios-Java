package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void verifyStatus() {
		if (finalGrade() < 60) {
			System.out.println("FAILED");
			double missing = 60 - finalGrade();
			System.out.println("Missing " + missing + " points");
		}
		else {
			System.out.println("PASS");
		}
	}
}
