package hw13Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("------Sister-------");
		Sister sister = new Sister();
		sister.sister(); // void type method -01 initialized
		sister.sister(79, 70); // void type parameterized method -02 initialized
		sister.sister(10, 40, 10); // return type parameterized method -03 initialized
		sister.sister(43, "89", 10); // void type parameterized method -04 initialized
		Sister.sister(90, 25, 10, 5, 30); // void type parameterized method -05 initialized
		sister.sister(25, 25, 18, 5); // void type parameterized method -06 initialized
		sister.sister(1.248f, "05", 20); // return type parameterized method -07 initialized

		System.out.println("\n-----------Niece-----------");

		Niece niece = new Niece();
		niece.sister(); // void type method -01 initialized
		niece.sister(45, 35); // void type parameterized method -02 initialized
		niece.sister(89, 2, 60); // return type parameterized method -03 initialized
		niece.sister(35, "65", 10); // void type parameterized method -04 initialized
		niece.sister(9.248f, "35", 95); // return type parameterized method -05 initialized

	}

}
