package hw10Abstraction;

public interface Hospital {

	// declared method in the interface
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();
	
	
	// Default method implemented below (This default is not access modifier)
		public default void morge() {
		}
		
		// Static method implemented below
		public static void phermecy() {	
		}
}
