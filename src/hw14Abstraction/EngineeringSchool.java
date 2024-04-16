package hw14Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	// Abstract method
	public abstract void mechanicalLab();

	// non Abstract method
	public void computerLab() {
		System.out.println("Testing for Computer lab");
	}
}
