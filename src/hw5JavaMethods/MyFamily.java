package hw5JavaMethods;

public class MyFamily {
	
	//initializing some int type variables

	public int child1Age = 19;
	public int chil2dAge = 18;
	protected int child3Age = 15;
	int child4Age = 9; 
	 
	//Implemented a return type method below-
	public int myFamily() {
	 int sum = child1Age + chil2dAge + child3Age + child4Age;
	 System.out.println("The sum of my childrens age is:" + sum);
	 return sum;
	 		
	}
	
	//Created Main method & Instantiated the class, also called the method by the object below-
	public static void main(String[] args) {
	
		MyFamily story = new MyFamily();
		story.myFamily();
		

	}

}
