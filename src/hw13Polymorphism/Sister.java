package hw13Polymorphism;
//when several methods stay with the same name but with different parameters or signature that's called method overloading

public class Sister {

	// void type non parameterized method (1) is implemented
	public void sister() {
		System.out.println("This is void type method from sister");
	}

	// void type parameterized method (2) is implemented
	public void sister(int age1, int age2) {
		int total1 = age1 + age2;
		System.out.println("Total age of sister" + total1);
	}

	// return type parameterized method (3) is implemented
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3;
		System.out.println("Total age of sister" + total2);
		return total2;
	}

	// void type parameterized method (4 ) is implemented
	public void sister(int age5, String age4, int age6) {
		int total4 = age5 + Integer.parseInt(age4) + age6;
		System.out.println("Total age of sister:" + total4);
	}

	// static type method implemented
	public static void sister(int age1, int age2, int age3, int age5, int age6) {
		int total5 = age1 + age2 + age3 + age5 + age6;
		System.out.println("Total age of sister" + total5);
	}

	// void type parameterized method (6) which is final type implement
	public final void sister(int age1, int age2, int age3, int age4) {
		int total6 = age1 + age2 + age3 + age4;
		System.out.println("Total age of sister" + total6);
	}

	// return type parameterized method (7) implemented
	public int sister(float age7, String age4, int age1) {
		int total7 = (int) age7 + Integer.parseInt(age4) + age1;
		System.out.println("Total age of sister" + total7);
		return total7;
	}

}
