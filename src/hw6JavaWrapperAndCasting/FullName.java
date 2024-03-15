package hw6JavaWrapperAndCasting;

public class FullName {
	// Implemented a String return type parameterized method below-

 public String fullName(int fName, int lName) {
	 
	 //convert int to string
	 
	 String name = String.valueOf(fName) + String.valueOf(lName);
		System.out.println("Family Member: " + fName + " " + lName);
		return name;

	}
 //int return type parameterized method 
 public int salary(String januarySalary, double februarySalary) {
	 System.out.println("Average Salary:" + (Integer.parseInt(januarySalary)+(int)februarySalary)/2);
	 return 0; 
	 
 }
 
 
//Created Main method & Instantiated the class below-
	public static void main(String[] args) {
		FullName Story1 = new FullName();
		
	// Calling the method multiple times 
		Story1.salary("9",29.5 );
		Story1.salary("10",49.5 );
		Story1.fullName(20,56);
		Story1.fullName(100,87);
		

	}

}
