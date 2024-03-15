package hw5JavaMethods;

public class FullName {
	// Implemented a String return type parameterized method below-

 public String fullName(String fName, String lName) {
		System.out.println("Family Member: " + fName + " " + lName);
		return null;

	}
//Created Main method & Instantiated the class below-
	public static void main(String[] args) {
		FullName Story1 = new FullName();
		Story1.fullName("Aalek", "Aka");
		Story1.fullName("Ninad", "Aka");
		Story1.fullName("Golapi", "Aka");
		Story1.fullName("Aklima", "Aka");
		Story1.fullName("Shapla", "Khatun");

	}

}
