package hw2JavaVariablesInitialized;

public class AboutMe {

	public String myName; //variable declared

    // Step 3: Declare variables for int, float, char, and boolean types.
    public int myAge = 106; // variable initialized
    public float myHeight = 6.775f;
    public char myGender = 'F';
    public boolean fullTimeStudent = false;

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
                           "\nAge: " + myAge +
                           "\nHeight: " + myHeight +
                           "\nGender: " + myGender +
                           "\nFull-time Student: " + fullTimeStudent);
    }

    public static void main(String[] args) {
        // Step 8: Instantiate AboutMe class inside the main method body. 
        // Step 10: Follow indentation by Organizing the code.
        AboutMe myInfo = new AboutMe();
        myInfo.aboutMe();
        
    }
}
