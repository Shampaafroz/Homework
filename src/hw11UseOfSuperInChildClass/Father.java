package hw11UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default constructor

	public Father() {
		System.out.println("This is a default contructor of father class");
	}

	// parameterized constructor

	public Father(String name, int age, char sex, boolean usCitizen) {
		// super(); super class method used in child class
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name: " + name + ", Age:" + age + ", Sex:" + sex + ",US Citizen :" + usCitizen);
	}

	// void type method or no return method
	public void father() {
		System.out.println("This is a void type method of father class");

	}

	// parameterized method

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("Name:" + name + "Age:" + age + ", Sex:" + sex + ", US Citizen:" + usCitizen);

	}

}
