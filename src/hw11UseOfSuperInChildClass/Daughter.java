package hw11UseOfSuperInChildClass;
//here child class/subclass is daughter and parent class or base class or super class is father

public class Daughter extends Father {
	// declare variable

	public String birthMonth;
	public int age;

	// declare default constructor
	public Daughter() {
		super(); // default constructor called by super method
		// all usage by super keyword below
		super.father();// void method
		super.fatherInfo("Hussain", 68, 'M', true);// parameterized method
		super.name = "Hussain";
		super.age = 68;
		super.sex = 'M';
		super.usCitizen = true;
		// familyName variable called by super keyword
		super.familyName = "Hussain";
		System.out.println("this is the default Daughter constructor");

	}
	// parameterized constructor

	public Daughter(String birthMont, int age) {
		super("Hussain", 68, 'M', true);
		super.father();
		super.fatherInfo("Hussain", 68, 'M', true);
		super.name = "Hussain";
		super.age = 68;
		super.sex = 'M';
		super.usCitizen = true;
		this.birthMonth = birthMonth;
		this.age = age;

		System.out.println("Birth Month: " + birthMonth + "Age: " + age);
	}

	// void type method or no return method
	public void daughter() {
		// we can't use the super method the child class method
		super.father();
		super.fatherInfo("Hussain", 68, 'M', true);
		super.name = "Hussain";
		super.age = 68;
		super.sex = 'M';
		super.usCitizen = true;
		// family name variable called by super keyword
		super.familyName = "Hussain";
		System.out.println("This is void type method of daughter class");
	}
	// parameterized method

	public void daughterInfo(String birthMont, int age) {
		super.father();
		super.fatherInfo("Hussain", 68, 'M', true);
		super.name = "Hussain";
		super.age = 68;
		super.sex = 'M';
		super.usCitizen = true;
		System.out.println("Birth Month: " + birthMonth + "Age: " + age);
	}

}
