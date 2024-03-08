package hw5JavaMethods;

public class MyFamily {
	
	public int child1Age = 19;
	public int chil2dAge = 18;
	protected int child3Age = 15;
	int child4Age = 9; 
	 
	
	public int MyFamily() {
	 int sum = child1Age + chil2dAge + child3Age + child4Age;
	 return sum;
	 		
	}
	
	

	public static void main(String[] args) {
	
		MyFamily story = new MyFamily();
		int sum = story.MyFamily();
		System.out.println("The sum of my childrens age is: " + sum);
		

	}

}
