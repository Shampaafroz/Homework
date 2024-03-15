package hw6JavaWrapperAndCasting;

public class MyFamily {
	
	//initializing int, float, double type variables

	public float child1Age = 9.5f;
	public int chil2dAge = 18;
	protected double child3Age = 15.5;
	int child4Age = 9; 
	 
	//Implemented a return type method below-
	public int myFamily() {
	 int sum = (int)(child1Age + chil2dAge + child3Age + child4Age);
	 System.out.println("The sum of my childrens age is:" + sum);
	 return sum;
	 		
	}
	
	//Created Main method & Instantiated the class, also called the method by the object below-
	public static void main(String[] args) {
	
		MyFamily story = new MyFamily();
		story.myFamily();
		

	}

}
