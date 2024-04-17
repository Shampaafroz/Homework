package hw14Abstraction;

/*
* Only one keywords "Extents" we can use inherit on interface
* An Interface can inherit more than one Interface (separated by comma) by extends keyword
* An Interface can't inherit a regular class or an abstract class by extends keyword
*/
public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

	// public University() {}
	// default constructor can not be created in the interface
	// Interface doesn't allow constructor to be initialized in the interface

	// Default method implemented below (This default is not access modifier)
	public default void gymnasium() {
	}

	// Static method implemented below
	public static void library() {
	}
}
