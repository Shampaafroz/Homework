package hw18JavaSwitch;

import java.util.Scanner;

public class LevelOfJava {
	public static void main(String[] args) {
		System.out.println("<-- Please Write about your Java level -->");
		Scanner scanner = new Scanner(System.in);
		String myLevel = scanner.next();
		switch (myLevel) {
		case "Beginner":
			System.out.println("I am at the begining level");
			break;
		case "Intermediate":
			System.out.println("I am at the Intermediate level");
			break;
		case "Expert":
			System.out.println("I am at the Expert level");
			break;
		case "Excellent":
			System.out.println("I have Java certification from Oracle");
			break;
		default:
			System.out.println("I am a drop out");
			break;
		}
		scanner.close();
	}

}
