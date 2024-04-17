package hw14Abstraction;

/*
 * we can use "extends" and "implements" keywords to inherit in the abstract class.
 * An abstract can inherit another abstract class or regular by "extends" keyword
 * An abstract can't inherit another abstract class or regular class by "implements" keyword
 * An abstract class can't inherit more than one interface 
 */
public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public abstract void anatomyLab();

	// Abstract method
	public abstract void medicalSchool();

	// non Abstract method
	void biochemistryLab() {
		System.out.println("Testing for biochemistry lab");
	}

	public MedicalSchool() {
		System.out.println("This is all from default constructor MedicalSchool");
		// we can make default constructor in abstract class
	}
}
