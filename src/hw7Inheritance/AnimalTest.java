package hw7Inheritance;

public class AnimalTest {
	
	public static void main(String[] args) {
	
		Animal animal = new Animal();
		animal.animalInfo();
		// dog > bulldog > mammal > animal 
		//mammal parent class
		Mammal mammal = new Mammal();
		mammal.mammallInfo();
		mammal.animalInfo();
		
		// BullDog child class
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.mammallInfo();
		mammal.animalInfo();

		Dog dog = new Dog();
		dog.dogInfo();
		dog.bullDogInfo();
		bullDog.mammallInfo();
		mammal.animalInfo();
		
		//Cobra > snake > reptile > Animal
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		reptile.animalInfo();
		
		Cobra cobra = new Cobra();
		cobra.cobra();
		cobra.snakeInfo();
		snake.reptileInfo();
		reptile.animalInfo();
		
		// robin > birds > animal
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		birds.animalInfo();
		
		
		
		

	}

}
