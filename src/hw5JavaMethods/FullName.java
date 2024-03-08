package hw5JavaMethods;

public class FullName {

	public String FullName(String fName, String lName) {

		System.out.println("Family Member: " + fName + " " + lName);

		return "fullName";

	}

	public static void main(String[] args) {
		FullName Story1 = new FullName();
		Story1.FullName("Aalek", "Aka");
		Story1.FullName("Ninad", "Aka");
		Story1.FullName("Golapi", "Aka");
		Story1.FullName("Aklima", "Aka");
		Story1.FullName("Shapla", "Khatun");

	}

}
