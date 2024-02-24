package hw3JavaVariableDeclared;

public class AboutMe {

	public String myName; //variable declared
    public byte myAge;
    public float myHeight;
    public char myGender;
    public boolean fullTimeStudent;
    public int phoneNumber;
    public short rent;
    public double mortgage;
    public long yearlySalary;

    // Step 5: Declare a Constructor inside the class.
    public AboutMe() {
        // Step 5: Constructor Body outcome.
        System.out.println(": ------------ This is all about Myself ------------:");
    }

    // Step 6: Implement a void type of method named "aboutMe" inside the class.
    public void aboutMe() {
        // Step 7: Inside the void type of method "aboutMe" body, call all the variables inside syso.
        // Step 9: Give a single-line comment where variables declared and initialized, Constructor declared and initialized, method implemented and initialized.
        System.out.println("Name: " + myName +
                           "Age: " + myAge +
                           "Height: " + myHeight +
                           "Gender: " + myGender +
                           "Full-time Student: " + fullTimeStudent +
                           "Phone Number: " + phoneNumber +
                           "My Rent: " + rent +
                           "My Yearly Salary: " + yearlySalary +
                           "My Mortgage: " + mortgage);
    }

    public static void main(String[] args) {
        // Step 8: Instantiate AboutMe class inside the main method body. 
        // Step 10: Follow indentation by Organizing the code.
        AboutMe myInfo = new AboutMe();
        myInfo.aboutMe(); //
        
    }
}
