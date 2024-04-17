package hw14Abstraction;
/*
 * two keywords "extends" and "implements" are used for the inheritance in a regular class
 * A regular class can inherit another regular class or abstract class by "extends" keyword
 * A regular class can't inherit another regular class or abstract class by "implements" keywords
 * A regular class can inherit more than one interfaces by "implements" keyword
 * A regular class can't inherit interfaces by "extends" keyword
 * More than one inheritances are possible by a regular class
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// Abstract method not possible in the regular class, ColumbiaUniversity is a
	// regular class so it's not possible.
	// Abstract methods can only be created in abstract classes or interfaces.
	// public abstract void chemistry();

	public void biology() {
		System.out.println("Testing for biology");

	}

	public ColumbiaUniversity() {
		// it's possible to create default constructor in the regular class.
		// this default constructor has no argument.
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void medicalSchool() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}
	


}
