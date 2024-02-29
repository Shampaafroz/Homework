package hw4Constructor;

public class Student {
// Declare some variable -- stName, stID, Gender, isProgrammer(as boolean), grade (as float

 public String stName;
 public int stID;
 public char stGender;
 public boolean isProgrammer;
 public float grade;
 
 
 // Declare the default constructor
 public Student () {
	 System.out.println("This is all about Students");	 
 }
 
 // parameterized constructor declared
 	
public Student(String stName, int stID, char stGender, boolean isProgrammer, float grade) {
	this.stName = stName;
	this.stID = stID;
	this.stGender = stGender;
	this.isProgrammer = isProgrammer;
	this.grade = grade;
	
	System.out.println("Student Name:" + stName + ", Student ID:" + stID + ", Student Gender:"+ stGender + 
			", Student Occupation:" + isProgrammer + ", Student Grade:" + grade);
}

}
