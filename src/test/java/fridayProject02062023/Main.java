package fridayProject02062023;

public class Main {
	public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Leo", 5);
        Tiger tiger = new Tiger("Tigger", 3);
        Elephant elephant = new Elephant("Dumbo", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);

        System.out.println("List of animals in the zoo:");
        zoo.listAnimals();

        System.out.println("\nInteracting with animals:");
        zoo.interactWithAnimals();
    }
}
