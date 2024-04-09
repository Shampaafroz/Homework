package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {

		// Default constructor initialized here
		Father father = new Father();

		System.out.println("----------------------");

		// Parameterized Constructor initialized here
		Father father2 = new Father("Seen", 50, 'F', false);

		System.out.println("--------------------------");

		// Void type method initialized here
		father2.father();

		System.out.println("----------------------------");

		// parameterized method initialized
		father2.fatherInfo("Hussain", 68, 'M', true);

		System.out.println("-----Default constructor Intialised from the class Daughter-----");

		Daughter daughter = new Daughter();

		System.out.println("-----Parameterised constructor initialized from the class daughter---");

		Daughter daughter2 = new Daughter("January", 50);

		System.out.println("-----Void type method initialized from the class Daughter");

		daughter2.daughter();

		System.out.println("-----Prametereized type method initialized from the class Daughter");

		daughter2.daughterInfo("December", 31);

	}
}
