package hw3JavaVariableDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		
		AboutMe shampa = new AboutMe();
		shampa.myName = "Shampa Afroz";
		shampa.myAge = 25;
		shampa.myHeight = 5.4f;
		shampa.myGender = 'F';
		shampa.phoneNumber = 123456789;
		shampa.rent = 32560;
		shampa.mortgage = 4000.4569872;
		shampa.yearlySalary = 7000000000000l;
		shampa.fullTimeStudent = false;
		shampa.aboutMe();
		
		AboutMe alex = new AboutMe();
		alex.myName = "Alex ";
		alex.myAge = 40;
		alex.myHeight = 4.12f;
		alex.myGender = 'M';
		alex.phoneNumber = 98265143;
		alex.rent = 2456;
		alex.mortgage = 3000.4569872;
		alex.yearlySalary = 2900000000000l;
		alex.fullTimeStudent = true;
		alex.aboutMe();
		


	}

}
