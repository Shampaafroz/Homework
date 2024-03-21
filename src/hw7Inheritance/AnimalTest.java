package hw7Inheritance;

public class AnimalTest {
	
	public static void main(String[] args) {
	
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n------------------------------------");
		// dog > bulldog > mammal > animal 
		// Mammal extent to animal
		Mammal mammal = new Mammal();
		mammal.mammallInfo();
		mammal.animalInfo();
		System.out.println("\n------------------------------------");
		
		// BullDog child class
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.mammallInfo();
		bullDog.animalInfo();
		System.out.println("\n------------------------------------");
		
		Dog dog = new Dog();
		dog.dogInfo();
		dog.bullDogInfo();
		dog.mammallInfo();
		dog.animalInfo();
		System.out.println("\n------------------------------------");
		
		//Cobra > snake > reptile > Animal
		// Reptile extent to animal
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("\n------------------------------------");
		
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("\n------------------------------------");
		
		Cobra cobra = new Cobra();
		cobra.cobra();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		System.out.println("\n------------------------------------");
		
		// robin > birds > animal
		// birds extent to animal
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		System.out.println("\n------------------------------------");
		
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		
		
		
		

	}

}
